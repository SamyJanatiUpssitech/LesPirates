package jeu;

import joueur.Joueur;

public class CarteAuraInstable extends Carte {

    public CarteAuraInstable() {
        super("Aura Instable", Effet.AURA_INSTABLE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        if (joueur.getVie() >= 3) {
            joueur.gagnerPopularite(1);
        } else {
            joueur.perdrePopularite(1);
        }
    }
}


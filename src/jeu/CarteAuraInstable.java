package jeu;

import joueur.Joueur;

public class CarteAuraInstable extends Carte {

    public CarteAuraInstable() {
        super("Aura Instable", Effet.AURA_INSTABLE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerPopularite(1);
        adversaire.perdrePopularite(1);
    }
}

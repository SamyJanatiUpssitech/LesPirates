package jeu;

import joueur.Joueur;

public class CarteDeclin extends Carte {

    public CarteDeclin() {
        super("Déclin", Effet.DECLIN);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.perdrePopularite(1);
    }
}


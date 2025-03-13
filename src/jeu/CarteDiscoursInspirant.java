package jeu;

import joueur.Joueur;

public class CarteDiscoursInspirant extends Carte {

    public CarteDiscoursInspirant() {
        super("Discours Inspirant", Effet.DISCOURS_INSPIRANT);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerPopularite(3);
    }
}

package jeu;

import joueur.Joueur;

public class CarteEgoFragile extends Carte {

    public CarteEgoFragile() {
        super("Égo Fragile", Effet.EGO_FRAGILE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.perdrePopularite(1);
        joueur.perdreVie(1);
    }
}

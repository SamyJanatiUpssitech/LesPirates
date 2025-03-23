package jeu;

import joueur.Joueur;

public class CarteEgoFragile extends Carte {

    public CarteEgoFragile() {
        super("�go Fragile", Effet.EGO_FRAGILE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        if (joueur.getPopularite() <= 2) {
            joueur.gagnerVie(1);
        } else {
            joueur.perdreVie(1);
        }
    }

}

package jeu;

import joueur.Joueur;
public class CarteVolPlanifie extends Carte {

    public CarteVolPlanifie() {
        super("Vol Planifié", Effet.VOL_PLANIFIE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerPopularite(1);
    }
}

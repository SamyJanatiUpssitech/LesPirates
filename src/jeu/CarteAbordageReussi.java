package jeu;

import joueur.Joueur;

public class CarteAbordageReussi extends Carte {

    public CarteAbordageReussi() {
        super("Abordage Réussi", Effet.ABORDAGE_REUSSI);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerPopularite(2);
    }
}

package jeu;

import joueur.Joueur;

public class CarteMainDeFer extends Carte {

    public CarteMainDeFer() {
        super("Main de Fer", Effet.MAIN_DE_FER);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerPopularite(2);
        adversaire.perdreVie(1);
    }
}

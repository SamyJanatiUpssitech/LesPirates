package jeu;

import joueur.Joueur;

public class CarteRenouveau extends Carte {

    public CarteRenouveau() {
        super("Renouveau", Effet.RENOUVEAU);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        joueur.gagnerVie(1);
    }
}

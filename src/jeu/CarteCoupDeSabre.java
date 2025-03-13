package jeu;

import joueur.Joueur;

public class CarteCoupDeSabre extends Carte {

    public CarteCoupDeSabre() {
        super("Coup de Sabre", Effet.COUP_DE_SABRE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        adversaire.perdreVie(2);
    }
}

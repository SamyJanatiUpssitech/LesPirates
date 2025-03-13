package jeu;

import joueur.Joueur;

public class CarteRouletteRusse extends Carte {

    public CarteRouletteRusse() {
        super("Roulette Russe", Effet.ROULETTE_RUSSE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        if (Math.random() > 0.5) {
            joueur.perdreVie(2);
        } else {
            adversaire.perdreVie(2);
        }
    }
}

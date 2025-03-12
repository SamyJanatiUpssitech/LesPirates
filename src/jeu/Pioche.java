package jeu;

import java.util.Random;

public class Pioche {
    private Carte[] cartes = new Carte[40];  
    private int indexCarte = 0;  
 
    public Pioche() {
        remplirPioche();
        melangerPioche();
    }

    private void remplirPioche() {
        for (int i = 0; i < 4; i++) {
            cartes[i * 10] = new CarteVolPlanifie();
            cartes[i * 10 + 1] = new CarteRenouveau();
            cartes[i * 10 + 2] = new CarteDeclin();
            cartes[i * 10 + 3] = new CarteRouletteRusse();
            cartes[i * 10 + 4] = new CarteEgoFragile();
            cartes[i * 10 + 5] = new CarteAuraInstable();
            cartes[i * 10 + 6] = new CarteCoupDeSabre();
            cartes[i * 10 + 7] = new CarteAbordageReussi();
            cartes[i * 10 + 8] = new CarteMainDeFer();
            cartes[i * 10 + 9] = new CarteDiscoursInspirant();
        }
    }

    private void melangerPioche() {
        Random rand = new Random();
        for (int i = cartes.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Carte temp = cartes[i];
            cartes[i] = cartes[j];
            cartes[j] = temp;
        }
    }

    public Carte piocher() {
        if (indexCarte < cartes.length) {
            return cartes[indexCarte++];
        } else {
            return null;  // Plus de cartes à piocher
        }
    }

    public boolean estVide() {
        return indexCarte >= cartes.length;
    }
}

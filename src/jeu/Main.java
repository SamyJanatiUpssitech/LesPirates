package jeu;

public class Main {
    private Carte[] cartes = new Carte[5];
    private int nbCartes = 0;

    public void ajouterCarte(Carte carte) {
        if (nbCartes < 5) {
            cartes[nbCartes] = carte;
            nbCartes++;
        }
    }

    public void supprimerCarte(int index) {
        for (int i = index; i < nbCartes - 1; i++) {
            cartes[i] = cartes[i + 1];
        }
        cartes[nbCartes - 1] = null;
        nbCartes--;
    }

    public Carte getCarte(int index) {
        return cartes[index];
    }

    public int getNbCartes() {
        return nbCartes;
    }
}

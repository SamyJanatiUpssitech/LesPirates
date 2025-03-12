package jeu;

public class Zattaque {
    private Carte carte;

    public void ajouterCarte(Carte nouvelleCarte) {
        if (carte == null) {
            carte = nouvelleCarte;
        }
    }

    public void supprimerCarte() {
        carte = null;
    }

    public Carte getCarte() {
        return carte;
    }
}

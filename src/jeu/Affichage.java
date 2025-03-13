package jeu;

import joueur.Joueur;

public class Affichage {

    public void afficherNbTour(int nbTour) {
        System.out.println("\nTour " + nbTour + "\n===============");
    }

    public String nouveauJoueur(int numJoueur) {
        System.out.print("Nom du joueur " + numJoueur + " : ");
        return new java.util.Scanner(System.in).next();
    }

    public void afficherEtatJoueur(Joueur joueur) {
        System.out.println("\n " + joueur.getNom() + " - Vie : " + joueur.getVie() + ", Popularité : " + joueur.getPopularite());
    }

    public void afficherMain(Main main) {
        System.out.println("\n Cartes en main :");
        for (int i = 0; i < main.getNbCartes(); i++) {
            System.out.println("- " + main.getCarte(i).getNom());
        }
    }

    public void afficherBanc(Banc banc) {
        System.out.println("\n Cartes sur le banc :");
        for (int i = 0; i < banc.getNbCartes(); i++) {
            System.out.println("- " + banc.getCarte(i).getNom());
        }
    }

    public void afficherZoneAttaque(Zattaque zattaque) {
        if (zattaque.getCarte() != null) {
            System.out.println("\n Carte en attaque : " + zattaque.getCarte().getNom());
        } else {
            System.out.println("\n Aucune carte en zone d'attaque");
        }
    }

    public void afficherGagnant(Joueur joueur) {
        System.out.println("\n Félicitations " + joueur.getNom() + " ! Vous avez gagné la partie ! ");
    }

    public void afficherDefaite(Joueur joueur) {
        System.out.println("\n " + joueur.getNom() + " a perdu la partie...");
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }
}

package jeu;

import java.util.Scanner;
import joueur.Joueur;

public class Affichage {

    private Scanner scanner = new Scanner(System.in);

    public void afficherNbTour(int nbTour) {
        System.out.println("Tour " + nbTour + "\n--------------------\n");
    }

    public String nouveauJoueur(int numJoueur) {
        System.out.print("Nom du joueur " + numJoueur + " : ");
        String nom = scanner.next();
        System.out.println(nom + " a été créé !");
        return nom;
    }

    public void afficherEtatJoueur(Joueur joueur) {
        System.out.println("\nÉtat de " + joueur.getNom() + " : ");
        System.out.println("Vie : " + joueur.getVie());
        System.out.println("Popularité : " + joueur.getPopularite());
    }

    public void afficherGagnant(Joueur joueur) {
        System.out.println("\n🏆 " + joueur.getNom() + " a gagné la partie.");
    }

    public void afficherDefaite(Joueur joueur) {
        System.out.println("\n💀 " + joueur.getNom() + " a perdu la partie.");
    }
}

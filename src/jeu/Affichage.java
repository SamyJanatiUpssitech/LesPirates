package jeu;

import java.util.Scanner;
import joueur.Joueur;
import objetsJeu.Carte;

public class Affichage {
	
	private Scanner scanner=new Scanner(System.in);
	
	public void afficherNbTour(int nbTour) {
		System.out.println("nb tour : "+nbTour+"\n\n");
	}
	
	public void nouveauJoueur(int numJoueur) {
		System.out.println("Nom du nouveau joueur : ");
		String nom = scanner.next();
		System.out.println("\n" + nom+" a été crée\n");
	}
	
	public void initPioche() {
        System.out.println("Création pioche (40 cartes)\n\n");
    }
	
	
	
	public static void main(String[]args) {
		
		Affichage affichage = new Affichage();
		affichage.nouveauJoueur(1);
		
	}

}

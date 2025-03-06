package jeu;

import java.util.Scanner;


public class Affichage {
	
	private Scanner scanner=new Scanner(System.in);
	
	public void afficherNbTour(int nbTour) {
		System.out.println("nb tour : "+nbTour+"\n\n");
	}
	
	public String nouveauJoueur(int numJoueur) {
		System.out.println("Nom du nouveau joueur : ");
		String nom = scanner.next();
		System.out.println("\n" + nom+" a été crée\n");
		return (nom);
	}
	
	public void initPioche() {
        System.out.println("Création pioche (40 cartes)\n\n");
    }
	
	public void donnerJoueur(int numJoueur) {
        String joueur = scanner.next();
        System.out.println(
                "Le joueur " + numJoueur + " est " + joueur + " et commence avec : \nVie = 5 \nPopularité = 0\n");
    }
	
	

}

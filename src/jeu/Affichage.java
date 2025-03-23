package jeu;

import joueur.Joueur;

public class Affichage implements IAffichage {

    @Override
	public void afficherNbTour(int nbTour) {
        System.out.println("\nTour " + nbTour + "\n===============");
    }

    @Override
	public String nouveauJoueur(int numJoueur) {
        System.out.print("Nom du joueur " + numJoueur + " : ");
        return new java.util.Scanner(System.in).next();
    }

    @Override
	public void afficherEtatJoueur(Joueur joueur) {
        System.out.println("\n " + joueur.getNom() + " - Vie : " + joueur.getVie() + ", Popularité : " + joueur.getPopularite());
    }

    @Override
	public void afficherMain(Main main) {
        System.out.println("\n Cartes en main :");
        for (int i = 0; i < main.getNbCartes(); i++) {
            System.out.println("- " + main.getCarte(i).getNom());
        }
    }

    @Override
	public void afficherBanc(Banc banc) {
        System.out.println("\n Cartes sur le banc :");
        for (int i = 0; i < banc.getNbCartes(); i++) {
            System.out.println("- " + banc.getCarte(i).getNom());
        }
    }

    @Override
	public void afficherZoneAttaque(Zattaque zattaque) {
        if (zattaque.getCarte() != null) {
            System.out.println("\n Carte en attaque : " + zattaque.getCarte().getNom());
        } else {
            System.out.println("\n Aucune carte en zone attaque");
        }
    }

    @Override
	public void afficherGagnant(Joueur joueur) {
        System.out.println("\n Félicitations " + joueur.getNom() + " Vous avez gagné cette manche ! ");
    }

    @Override
	public void afficherDefaite(Joueur joueur) {
        System.out.println("\n " + joueur.getNom() + " a perdu la manche.");
    }

    @Override
	public void afficherMessage(String message) {
        System.out.println(message);
    }
}

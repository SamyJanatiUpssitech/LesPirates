package jeu;

import joueur.Joueur;

public class Jeu {

    private Joueur joueur1;
    private Joueur joueur2;
    private Affichage affichage = new Affichage();
    private int tour = 1;

    public Jeu() {
        String nomJoueur1 = affichage.nouveauJoueur(1);
        String nomJoueur2 = affichage.nouveauJoueur(2);
        
        this.joueur1 = new Joueur(nomJoueur1, 1);
        this.joueur2 = new Joueur(nomJoueur2, 2);
    }

    public void start() {
        System.out.println("\nDébut du jeu !\n");

        while (!joueur1.aGagne() && !joueur2.aGagne() && !joueur1.aPerdu() && !joueur2.aPerdu()) {
            affichage.afficherNbTour(tour);

            affichage.afficherEtatJoueur(joueur1);
            affichage.afficherEtatJoueur(joueur2);

            // Ajout futur : actions des joueurs (piocher, poser des cartes, attaquer)
            
            tour++;
        }

        if (joueur1.aGagne()) {
            affichage.afficherGagnant(joueur1);
        } else if (joueur2.aGagne()) {
            affichage.afficherGagnant(joueur2);
        } else if (joueur1.aPerdu()) {
            affichage.afficherDefaite(joueur1);
            affichage.afficherGagnant(joueur2);
        } else if (joueur2.aPerdu()) {
            affichage.afficherDefaite(joueur2);
            affichage.afficherGagnant(joueur1);
        }
    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.start();
    }
}

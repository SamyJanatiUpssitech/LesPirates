package jeu;

import joueur.Joueur;
import java.util.Scanner;

public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private Affichage affichage = new Affichage();
    private Pioche pioche = new Pioche();
    private int tour = 1;
    private Scanner scanner = new Scanner(System.in);

    public Jeu() {
        // Création des joueurs avec l'affichage
        String nomJoueur1 = affichage.nouveauJoueur(1);
        String nomJoueur2 = affichage.nouveauJoueur(2);

        this.joueur1 = new Joueur(nomJoueur1, affichage);
        this.joueur2 = new Joueur(nomJoueur2, affichage);
    }

    public void start() {
        affichage.afficherMessage("\n🚀 Début du jeu !");

        while (!joueur1.aGagne() && !joueur2.aGagne() && !joueur1.aPerdu() && !joueur2.aPerdu()) {
            affichage.afficherNbTour(tour);
            joueur1.afficherEtat();
            joueur2.afficherEtat();

            // Tour du joueur actif
            Joueur joueurActif = (tour % 2 == 1) ? joueur1 : joueur2;
            Joueur adversaire = (joueurActif == joueur1) ? joueur2 : joueur1;

            // Demander une action au joueur
            affichage.afficherMessage("\n👉 " + joueurActif.getNom() + ", que voulez-vous faire ?");
            affichage.afficherMessage("1 - Piocher une carte");
            affichage.afficherMessage("2 - Passer votre tour");
            affichage.afficherMessage("👉 Choisissez une action : ");
            
            int choix = scanner.nextInt();

            if (choix == 1) {
                // Piocher une carte
                Carte cartePiochee = pioche.piocher();
                if (cartePiochee != null) {
                    affichage.afficherMessage("\n🎴 Vous avez pioché : " + cartePiochee.getNom());
                    cartePiochee.appliquerEffet(joueurActif, adversaire);
                } else {
                    affichage.afficherMessage("\n⚠️ La pioche est vide !");
                }
            } else {
                affichage.afficherMessage("\n⏭️ Vous passez votre tour...");
            }

            // Vérification des conditions de fin de jeu après chaque tour
            if (joueur1.aGagne()) {
                affichage.afficherGagnant(joueur1);
                break;
            }
            if (joueur2.aGagne()) {
                affichage.afficherGagnant(joueur2);
                break;
            }
            if (joueur1.aPerdu()) {
                affichage.afficherDefaite(joueur1);
                affichage.afficherGagnant(joueur2);
                break;
            }
            if (joueur2.aPerdu()) {
                affichage.afficherDefaite(joueur2);
                affichage.afficherGagnant(joueur1);
                break;
            }

            tour++;
        }
    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.start();
    }
}

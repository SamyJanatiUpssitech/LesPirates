package jeu;

import joueur.Joueur;

public interface IAffichage {

	void afficherNbTour(int nbTour);

	String nouveauJoueur(int numJoueur);

	void afficherEtatJoueur(Joueur joueur);

	void afficherMain(Main main);

	void afficherBanc(Banc banc);

	void afficherZoneAttaque(Zattaque zattaque);

	void afficherGagnant(Joueur joueur);

	void afficherDefaite(Joueur joueur);

	void afficherMessage(String message);

}
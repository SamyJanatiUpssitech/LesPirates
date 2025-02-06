package objetsJeu;

import joueur.Joueur;

public class CartePopularite {
	
	public void perdreVieSelf(Joueur j1, int nb) {
		for(int i=0;i<nb;i++) {
			j1.perdreVie(j1,nb);
		}
	}
	public void ajouterPopulariteSelf(Joueur j1, int nb) {
		for(int i=0;i<nb;i++) {
			j1.gagnerPopularite(j1,nb);
		}
	}

}

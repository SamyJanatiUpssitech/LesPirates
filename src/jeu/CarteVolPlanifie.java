package jeu;

import joueur.Joueur;
public class CarteVolPlanifie extends Carte {

    public CarteVolPlanifie() {
        super("Vol Planifi�", Effet.VOL_PLANIFIE);
    }

    @Override
    public void appliquerEffet(Joueur joueur, Joueur adversaire) {
        Banc bancAdversaire = adversaire.getBanc();
        Banc bancJoueur = joueur.getBanc();

        if (bancAdversaire.getNbCartes() > 0 && bancJoueur.getNbCartes() < 5) {
          
            Carte carteVolee = bancAdversaire.getCarte(0);
            bancAdversaire.supprimerCarte(0);
            bancJoueur.ajouterCarte(carteVolee);
        }
    }

}

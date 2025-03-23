package joueur;

import jeu.Banc;
import jeu.IAffichage;
import jeu.Main;
import jeu.Zattaque;

public class Joueur {
    private String nom;
    private int vie = 5;
    private int popularite = 0;
    private Main main = new Main();
    private Banc banc = new Banc();
    private Zattaque zattaque = new Zattaque();
    private IAffichage affichage;

    public Joueur(String nom, IAffichage affichage) {
        this.nom = nom;
        this.affichage = affichage;
    }

    public String getNom() { return nom; }
    public int getVie() { return vie; }
    public int getPopularite() { return popularite; }
    public Main getMain() { return main; }
    public Banc getBanc() { return banc; }
    public Zattaque getZattaque() { return zattaque; }

    public void gagnerVie(int nb) {
        vie = Math.min(5, vie + nb);
    }

    public void perdreVie(int nb) { 
    	vie = Math.max(0, vie - nb); 
    }

    public void gagnerPopularite(int nb) { popularite += nb; }
    public void perdrePopularite(int nb) { popularite = Math.max(0, popularite - nb); }

    
    public boolean aGagne() {
        return this.popularite >= 5;
    }

   
    public boolean aPerdu() {
        return this.vie <= 0;
    }

    public void afficherEtat() {
        affichage.afficherEtatJoueur(this);
        affichage.afficherMain(main);
        affichage.afficherBanc(banc);
        affichage.afficherZoneAttaque(zattaque);
    }
}

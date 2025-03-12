package joueur;

public class Joueur {
	
    private String nom;
    private int vie = 5;
    private int popularite = 0;
    private int num;

    
    public Joueur(String nom, int num) {
        this.nom = nom;
        this.num = num;
    }

    
    public String getNom() { return nom; }
    public int getVie() { return vie; }
    public int getPopularite() { return popularite; }
    public int getNum() { return num; }

  
    public void gagnerVie(int nb) {
        this.vie += nb;
    }

    public void perdreVie(int nb) {
        this.vie -= nb;
        if (this.vie < 0) this.vie = 0; 
    }

    public void gagnerPopularite(int nb) {
        this.popularite += nb;
    }

    public void perdrePopularite(int nb) {
        this.popularite -= nb;
        if (this.popularite < 0) this.popularite = 0; 
    }


    public boolean aGagne() {
        return this.popularite >= 5;
    }

   
    public boolean aPerdu() {
        return this.vie <= 0;
    }
}

package joueur;

public class Joueur {
	
	protected String nom;
	protected int vie=5;
	protected int popularite=0;
	protected int num;
	
	protected Joueur(String nom, int vie, int popularite, int num) {
		this.nom = nom;
		this.vie = vie;
		this.popularite = popularite;
		this.num = num;
	}
	
	public String getNom() {
		return nom;
	}
	public int getVie() {
		return vie;
	}
	public int getPopularite() {
		return popularite;
	}
	
	public int gagnerVie (Joueur j1, int nb) {
		j1.vie = j1.vie+nb;
		return j1.vie;
	}
	public int perdreVie (Joueur j1, int nb) {
		j1.vie = j1.vie-nb;
		return j1.vie;
	}
	public int gagnerPopularite (Joueur j1, int nb) {
		j1.popularite = j1.popularite+nb;
		return j1.popularite;
	}
	public int perdrePopularite (Joueur j1, int nb) {
		j1.popularite= j1.popularite-nb;
		return j1.popularite;
	}

	

}

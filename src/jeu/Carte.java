package jeu;

import joueur.Joueur;

public abstract class Carte {
    protected String nom;
    protected Effet effet;

    public Carte(String nom, Effet effet) {
        this.nom = nom;
        this.effet = effet;
    }

    public String getNom() { return nom; }
    public Effet getEffet() { return effet; }

    
    public abstract void appliquerEffet(Joueur joueur, Joueur adversaire);
}

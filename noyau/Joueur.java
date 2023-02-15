package noyau;

import java.io.Serializable;

public class Joueur implements Serializable, Comparable<Joueur>{
	//les attributs
	private String nomJoueur;
	private int meilleurScore;
	private int scoreCourant;
	private int numeroCaseCourant;
	private int m;
	
	public void setM(int n) {
		m = n;
	}

	//les constructeurs & getters & setters
	public Joueur(String nomJoueur) {
		super();
		this.nomJoueur = nomJoueur;
	}
	
	public Joueur(String string, int i) {
		super();
		nomJoueur = string;
		meilleurScore = i;
		
	}

	public String getNomJoueur() {
		return nomJoueur;
	}


	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}


	public int getMeilleurScore() {
		return meilleurScore;
	}


	public void setMeilleurScore(int meilleurScore) {
		this.meilleurScore = meilleurScore;
	}


	public int getScoreCourant() {
		return scoreCourant;
	}



	public void setScoreCourant(int scoreCourant) {
		this.scoreCourant = scoreCourant;
	}


	public int getNumeroCaseCourant() {
		return numeroCaseCourant;
	}

   
	public void setNumeroCaseCourant(int numeroCaseCourant) {
		this.numeroCaseCourant = numeroCaseCourant;
	}

	//les methodes
	public void afficher() {
		System.out.println("=========================");
		System.out.println("nom joueur : "+nomJoueur+", Score : "+meilleurScore);
		System.out.println("=========================");
	}
	public void identifie() {};
	public int lancer() {return (int)Math.floor(Math.random()*(6)+1);}
	
	
	public void avancerPas(){
		numeroCaseCourant=numeroCaseCourant+1;
		if (numeroCaseCourant>100) {numeroCaseCourant=numeroCaseCourant-100;}
	};
	
	public void avancer(int d){
		int n = numeroCaseCourant;
		int i=0;
		while((numeroCaseCourant!=m) && (i!=d)) {
			avancerPas();
			i++;
		}
		if((numeroCaseCourant==m) && (i<d)) {
			numeroCaseCourant =  n;
			reculer(d-i);
		}
	};
	public void reculer(int n) {
		numeroCaseCourant=numeroCaseCourant-n;
		if (numeroCaseCourant<1) {numeroCaseCourant=numeroCaseCourant+100;}
	};
	public void gagner(int n) {
		scoreCourant=scoreCourant+n;
		if(scoreCourant>meilleurScore) {
			meilleurScore=scoreCourant;
		}
	};
	public void perdre(int n) {
		scoreCourant=scoreCourant-n;
		if(scoreCourant<0) {scoreCourant = 0;}
	};
	public String repondre() {
		return ("");
	}
	
	public int compareTo(Joueur j) {
		int i = j.getMeilleurScore();
		int r = 0;
		
		if(meilleurScore > i) {
			r = -1;
		}else if (meilleurScore < i) {
			r = 1;
		}else {r=0;}
     
		return r;
	}
	
	public void suspendre() {};
	public void reprendre() {};
	public void enregistrer() {};
}

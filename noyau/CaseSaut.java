package noyau;

import java.io.Serializable;

public class CaseSaut extends Case implements Serializable{
	//les attributs
	//les constructeurs & getters & setters
	//les methodes
	
	private String couleur ="#e49813"; 
	public  String getCouleur() {
		return this.couleur;
	}
	
    public String toString() {
    	return "Saut";
    }
	public void action(Joueur J) {
		int rand = (int)Math.floor(Math.random()*(100)+1);
		J.setNumeroCaseCourant(rand);
	};


}

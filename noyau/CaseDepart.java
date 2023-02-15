package noyau;

import java.io.Serializable;

public class CaseDepart extends Case implements Serializable{
	//les attributs
	//les constructeurs & getters & setters
	//les methodes
	
	private static String couleur ="#fcef57"; 
	public String getCouleur() {
		return this.couleur;
	}
	
	public void action(Joueur j) {
		//j.setNumeroCaseCourant(n);
	}
	
    public String toString() {
    	return "Depart";
    }

}

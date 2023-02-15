package noyau;

import java.io.Serializable;

public class CaseFin extends Case implements Serializable{
	//les attributs
	//les constructeurs & getters & setters
	//les methodes
	private String couleur ="#000000"; 
	public  String getCouleur() {
		return this.couleur;
	}
	

	public void action(Joueur J) {
	}
	
    public String toString() {
    	return "Fin";
    }
}

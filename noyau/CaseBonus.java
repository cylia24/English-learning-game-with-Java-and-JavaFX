package noyau;

import java.io.Serializable;

public class CaseBonus extends Case implements Serializable{
	private final int points=10;
	private final int deplacement=2;
	private String couleur ="#b2fa6f"; 
	public  String getCouleur() {
		return this.couleur;
	}
	//les attributs
	//les constructeurs & getters & setters
	
	public String toString() {
    	return "Bonus";
    }
	

	//les methodes
	public void action(Joueur J) {
		J.avancer(deplacement);
		J.gagner(points);
	}

   



}

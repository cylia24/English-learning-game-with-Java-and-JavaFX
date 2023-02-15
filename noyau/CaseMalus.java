package noyau;

import java.io.Serializable;

public class CaseMalus extends Case implements Serializable{
	//les attributs
	private final int points=10;
	private final int deplacement=2;
	
	private  String couleur ="#e42f1e"; 
	public String getCouleur() {
		return this.couleur;
	}
	
	//les constructeurs & getters & setters
	//les methodes
    public String toString() {
    	return "Malus";
    }
	public void action(Joueur J) {
		J.reculer(deplacement);
		J.perdre(points);
	};


}

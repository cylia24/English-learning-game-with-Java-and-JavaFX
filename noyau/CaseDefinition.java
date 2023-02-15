package noyau;

import java.io.Serializable;

public class CaseDefinition extends CaseQuestion implements Serializable{
	//les attributs
	private final int pointsgagner=20;
	private final int deplacement=4;
	private final int pointsperdu=10;
	
	private String couleur ="#38d5ea"; 
	public String getCouleur() {
		return this.couleur;
	}
	//les constructeurs & getters & setters
    public String toString() {
    	return "Definition";
    }

	//les methodes
    public void action(Joueur J) {
    }
}

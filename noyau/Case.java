package noyau;

import java.io.Serializable;

public class Case implements Serializable{
	
	/* code couleur */
	
	//les attributs
	//les constructeurs & getters & setters
	//les methodes
	private  String couleur = "#ffffff"; 
	public  String getCouleur() {
		return couleur;
	}
	
    public String toString() {
    	return "Parcours";
    }
	public void action(Joueur J) 
	{
	};

}

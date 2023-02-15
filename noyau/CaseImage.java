package noyau;

import java.io.Serializable;

public class CaseImage extends CaseQuestion implements Serializable{
	//les attributs
	private final int pointsgagner=10;
	private final int deplacement=2;
	
	private static String couleur ="#fa4490"; 
	public String getCouleur() {
		return this.couleur;
	}
	
	private String def;
	private String reponse;
	private boolean rp=true;
	//les constructeurs & getters & setters
	//les methodes
    
	public String toString() {
    	return "Image";
    }
	
    public void action(Joueur J) {
    }
	/*public void action(Joueur J) {
		if(rp == true)
		{
			charger();
		}
		System.out.println(def);
		String reponsejoueur = J.repondre();
	    if (reponse.equals(reponsejoueur))
	    {
	    	J.avancer(deplacement);
	    	J.gagner(pointsgagner);
	    	rp=true;
	    }
	    else {
	    	J.reculer(deplacement/2);
	    	rp=false;}
	}*/
	
	public void charger() {}

}

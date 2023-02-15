package noyau;

import java.io.Serializable;

public class Partie implements Serializable{
	
	
	private Joueur joueur;
	private Plateau plateau;
	private String[] questions;
	
    
    public Partie(String[] questions) {
    	this.questions=questions;
		plateau = new Plateau();
	}
    
    public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

    public String getRepDef() {
    	return questions[0];
    }
    
    public String getDef() {
    	return questions[1];
    }
    
    public String getRepIm() {
    	return questions[2];
    }
    
    public String getIm() {
    	return questions[3];
    }
   
    public void setRepDef(String repDef) {
    	questions[0] = repDef;
    }
    
    public void setDef(String def) {
    	questions[1] = def;
    }
    
    public void setRepIm(String repIm) {
    	questions[2] = repIm;
    }
    
    public void setIm(String im) {
    	questions[3] = im;
    }
   
    
    public int placer() {
	  return (plateau.getNumeroCaseDepart());
    };

  
  
	
}

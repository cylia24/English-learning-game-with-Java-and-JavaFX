package noyau;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Plateau implements Serializable{
	//les attributs
	private Case[] cases = new Case[100];
	private int numeroCaseDepart;
	private int numeroCaseFin;
	//les constructeurs & getters & setters

	
	public Plateau() {
		super();
		genererPlateau();
	}

	public Case[] getCases() {
		return cases;
	}

	public void setCases(Case[] cases) {
		this.cases = cases;
	}
	
	public int getNumeroCaseDepart() {
		return numeroCaseDepart;
	}



	public int getNumeroCaseFin() {
		return numeroCaseFin;
	}


	//les methodes
	
	public void genererPlateau() 
	{
		
		//creation de tableau des cases
		cases[0]=new CaseDepart();
		Case D = cases[0];
		cases[1]=new CaseFin();
		Case F = cases[1];
		int i;
		for(i=2;i<75;i++)
		{
			cases[i]=new Case();
		}
		for(i=75;i<80;i++)
		{
			cases[i]=new CaseBonus();
		}
		for(i=80;i<85;i++)
		{
			cases[i]=new CaseMalus();
		}
		for(i=85;i<90;i++)
		{
			cases[i]=new CaseSaut();
		}
		for(i=90;i<95;i++)
		{
			cases[i]=new CaseDefinition();
		}
		for(i=95;i<100;i++)
		{
			cases[i]=new CaseImage();
		}
		//Generation des emplacements aleatoire
		List<Case> caseList = Arrays.asList(cases);
		Collections.shuffle(caseList);
		caseList.toArray(cases);
		caseList = Arrays.asList(cases);
		numeroCaseDepart  = caseList.indexOf(D)+1;
		numeroCaseFin = caseList.indexOf(F)+1;
		 
	};
}

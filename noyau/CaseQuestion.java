package noyau;

import java.io.Serializable;

public abstract class CaseQuestion extends Case implements Serializable{
	//les attributs

	
	//les constructeurs & getters & setters
	/**public CaseQuestion(S) {
		super("Green");
		// TODO Auto-generated constructor stub
	};**/
	//les methodes
	public abstract void action(Joueur J);
}

package noyau;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;





public class Jeu {

	private HashMap<String,Joueur> joueurs = new HashMap<String,Joueur>();
	private HashMap<String,Partie> parties=new HashMap<String,Partie>();
	private HashMap<String,String> def = new HashMap<String,String>();
	private HashMap<String,Integer> im = new HashMap<String,Integer>();
	
////////////////////////////////////////////////////////////////	
	private Joueur joueurCourant;
	private Plateau plateauCourant;
	private String[] defCourante;
	private String[] imCourante;
	
	public HashMap<String, Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(HashMap<String, Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	public Joueur getJoueurCourant() {
		return joueurCourant;
	}

	public void setJoueurCourant(Joueur joueurCourant) {
		this.joueurCourant = joueurCourant;
	}

	public Plateau getPlateauCourant() {
		return plateauCourant;
	}

	public void setPlateauCourant(Plateau plateauCourant) {
		this.plateauCourant = plateauCourant;
	}

	public Jeu(HashMap<String, Joueur> joueurs) {
		super();
		this.joueurs = joueurs;
	}
//////////////////////////////////////////////////////////
	
	public Jeu() {
		// TODO Auto-generated constructor stub
	}

	public Joueur rechercher(String nom) {
		return joueurs.get(nom);
	}

	public void ajouter(String nom, Joueur joueur) {
		joueurs.put(nom,joueur);
	}
     	
	public void sauvegarderJeu() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( new File("Jeu.dat"))));
		    out.writeObject(parties);
		    out.writeObject(joueurs);
		    out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void chargerJeu() throws ClassNotFoundException {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( new File("Jeu.dat"))));
		    HashMap<String,Partie> readObject1= (HashMap<String,Partie> ) in.readObject();
		    HashMap<String,Joueur> readObject2 = (HashMap<String,Joueur> ) in.readObject();
		    HashMap<String,String> readObject3 = (HashMap<String,String> ) in.readObject();
		    HashMap<String,Integer> readObject4 = (HashMap<String,Integer> ) in.readObject();
		    parties = readObject1;
		    joueurs = readObject2;
		    def = readObject3;
		    im = readObject4;
		    in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Joueur> classement() {
		Collection<Joueur> values = joueurs.values();
		ArrayList<Joueur> listOfValues = new ArrayList<>(values);
		Collections.sort(listOfValues);
		return listOfValues; 
	}
	
}

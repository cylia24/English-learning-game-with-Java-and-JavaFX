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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Test {

	public static void main(String args[]) throws ClassNotFoundException 
	{
		
		//HashMap<String,Partie> Parties=new HashMap<String,Partie>();
		

		
		HashMap<String,Joueur> map = new HashMap<String,Joueur>();
		
		Joueur j = new Joueur("cylia");
		j.setMeilleurScore(120);
		map.put("cylia",j);
		j = new Joueur("meriem");
		j.setMeilleurScore(13);
		map.put("meriem",j);
		j = new Joueur("mohamed");
		j.setMeilleurScore(10);
		map.put("mohamed",j);
		j = new Joueur("mama");
		j.setMeilleurScore(20);
		map.put("mama",j);
		
		Collection<Joueur> values = map.values();
		
		
		ArrayList<Joueur> listOfValues = new ArrayList<>(values);
		System.out.println(values);
		System.out.println(listOfValues);
		j = listOfValues.get(0);
		j.afficher();
		j = listOfValues.get(1);
		j.afficher();
		j = listOfValues.get(2);
		j.afficher();
		j = listOfValues.get(3);
		j.afficher();
		Collections.sort(listOfValues);
		System.out.println("apres sort");
		j = listOfValues.get(0);
		j.afficher();
		j = listOfValues.get(1);
		j.afficher();
		j = listOfValues.get(2);
		j.afficher();
		j = listOfValues.get(3);
		j.afficher();
		
		//HashMap<String,String> def = new HashMap<String,String>();
		//HashMap<String,Integer> im = new HashMap<String,Integer>();
		
		/*def.put("Cat", "un animal mignant qui dit meaw ");
		def.put("Dog", "un animal mignant qui dit how ");
		def.put("Duk", "un animal mignant qui dit quack ");
    	
		im.put("Caw", 1);
		im.put("Banana", 2);
		im.put("Milk", 3);
		im.put("Fruit", 4);
		
		ObjectOutputStream out;
		try {
		out = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( new File("Parties.dat"))));
		out.writeObject(def);
		out.writeObject(im);
		out.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}*/
		
		
		/*ObjectInputStream in;
		try {
		in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( new File("Parties.dat"))));
		HashMap<String,String> readObject1 = (HashMap<String,String> ) in.readObject();
		HashMap<String,Integer> readObject2 = (HashMap<String,Integer> ) in.readObject();
		
		def = readObject1;
		im = readObject2;
		
		in.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
     Set<Entry<String, String>> entries = def.entrySet();
		
		for(Entry<String, String> entry : entries) {
			System.out.println("===================");
			System.out.println(entry);
			
		}
		
	     Set<Entry<String, Integer>> entrie = im.entrySet();
			
			for(Entry<String, Integer> entry : entrie) {
				System.out.println("===================");
				System.out.println(entry);
				
			}
		
		/*HashMap<String,Joueur> map = new HashMap<String,Joueur>();
		
		Joueur j = new Joueur("cylia");
		map.put("cylia",j);
		j = new Joueur("meriem");
		map.put("meriem",j);
		j = new Joueur("mohamed");
		map.put("mohamed",j);
		j = new Joueur("mama");
		map.put("mama",j);
		
		Joueur nom = map.get("cylia");
		System.out.println("l'element cylia : "+nom.getNomJoueur());
		nom = map.get("meriem");
		System.out.println("l'element meriem : "+nom.getNomJoueur());
		nom = map.get("mohamed");
		System.out.println("l'element mohamed : "+nom.getNomJoueur());
		nom = map.get("mama");
		System.out.println("l'element mama : "+nom.getNomJoueur());*/
		
		
    	//Jeu jeu=new Jeu(joueurs);
    	//System.out.println("start methode 3");
    	//Joueur j = jeu.rechercheJou("cylia");
    	//System.out.println("start methode 4");
    	//j.afficher();
    	//if(j == null) {System.out.println("NULL");}
       
    	//System.out.println("Initial Mapping are : "+joueurs);
    	//System.out.println("The value of key cylia is : "+joueurs.get("cylia").getNomJoueur());
    	/* Set<Map.Entry<String, Joueur>> entries = joueurs.entrySet();
		
		for(Map.Entry<String, Joueur> entry : entries) {
			System.out.println("===================");
			entry.getValue().afficher();
			System.out.println("key : "+entry.getKey());
			System.out.println("===================");
		}*/
		
		
		
		
		
		
		
		
		
		/*//int rand = (int)Math.floor(Math.random()*(100)+1);
		 Case[] cases = new Case[100];
		 int numeroCaseDepart;
		 int numeroCaseFin;
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
		
			
		System.out.println("numeroCaseDepart "+numeroCaseDepart);
	    System.out.println("numeroCaseFin "+numeroCaseFin);

		for(i=0;i<100;i++)
		{
			System.out.println(cases[i].toString());
		}*/
		
		
	}
}

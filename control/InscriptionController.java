package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import noyau.Jeu;
import noyau.Joueur;

public class InscriptionController extends Controller{
	
		

	    @FXML
	    private TextField inscriptionTextField;
	    @FXML
	    private Label inscriptionLabel;

		public void switchToAccueil (ActionEvent event) throws IOException {
			
	    	root = FXMLLoader.load(getClass().getResource("../interfaceGraphique/Accueil.fxml"));
	    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
	    	stage.setScene(scene);
			stage.show();
	    }
	    
		public void switchToInfo (ActionEvent event) throws IOException {
	        
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Info.fxml"));
			root = loader.load();
	    	InfoController controller = loader.getController();
	    	controller.infoAfficher();
	    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }


	    public void inscrire (ActionEvent event) throws IOException {

	    	String nom = inscriptionTextField.getText();
	    	j = jeu.rechercher(nom);
	    	if (j== null){
	    		j= new Joueur(nom);
	    		jeu.ajouter(nom, j);
	    		switchToInfo(event);
	    	}
	    	else {
	    		inscriptionLabel.setText("this name already exists, please try again");
	    	}
	    }


}
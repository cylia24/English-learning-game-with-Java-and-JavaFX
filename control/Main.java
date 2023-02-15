package control;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.TreeMap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import noyau.Jeu;
import noyau.Joueur;
import noyau.Partie;
import javafx.fxml.FXMLLoader;

public class  Main extends Application {
	   
	private Jeu jeu = new Jeu();

	public Jeu getJeu() {
		return jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public Main() throws ClassNotFoundException {
		jeu.chargerJeu();
	}
			
    public void start (Stage stage) throws IOException  {
	    	Parent root = (Parent)FXMLLoader.load(getClass().getResource("../interfaceGraphique/Accueil.fxml"));
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	stage.setOnCloseRequest(event -> {
	    		event.consume();
	    		quitter(stage);
	    	});
	    		    
	}
        
	public void quitter(Stage stage) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Quitter le jeu");
			alert.setHeaderText("Clickez sur OK pour quitter le jeu");
			if(alert.showAndWait().get()==ButtonType.OK) {
				stage.close();	
			}
	}
	    
	public static void main(String[] args) throws IOException {	
        	launch();
    }
}
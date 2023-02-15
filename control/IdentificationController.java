package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import noyau.Jeu;
import noyau.Joueur;

public class IdentificationController extends Controller {


    @FXML
    private TextField identificationTextField;
    @FXML
    private Label identificationLabel;


    

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

    public void identifier (ActionEvent event) throws IOException {

    	String nom = identificationTextField.getText();
    	j = jeu.rechercher(nom);
    	if (j!= null){
    		switchToInfo(event);
    	}
    	else {
    		identificationLabel.setText("try again");
    	}
    }

}

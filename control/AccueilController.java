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

public class AccueilController {

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private AnchorPane pane;

    public void switchToIdentification(ActionEvent event) throws IOException {
		
		
		root = FXMLLoader.load(getClass().getResource("../interfaceGraphique/Identification.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	public void switchToInscription(ActionEvent event) throws IOException {
		
		root = FXMLLoader.load(getClass().getResource("../interfaceGraphique/Inscription.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	public void quitter(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Quitter");
		alert.setHeaderText("you'll quit");
		alert.setContentText("do you want somtheing before ?");
		if(alert.showAndWait().get()==ButtonType.OK) {
		    stage = (Stage)pane.getScene().getWindow();
			stage.close();
		}
	}
}

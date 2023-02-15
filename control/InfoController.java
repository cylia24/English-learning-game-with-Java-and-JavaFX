package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import noyau.Joueur;

public class InfoController extends Controller{
	
	@FXML
	private Label infoJoueurLabel, infoTopScoreLabel;
	@FXML
	private AnchorPane infoPane;
    @FXML
    private Button infoNouvellePartieButton,classementButton;
    @FXML
    private Label infoBienvenue;
	
	
	public void setInfoBienvenue(String infoBienvenue) {
		this.infoBienvenue.setText(infoBienvenue);
	}

	public void infoAfficher() {
    	infoJoueurLabel.setText(j.getNomJoueur());
		infoTopScoreLabel.setText(String.valueOf(j.getMeilleurScore()));
    }

	public void switchToPartie (ActionEvent event) throws IOException {
		j.setM(plateau.getNumeroCaseFin());
	    j.setNumeroCaseCourant(plateau.getNumeroCaseDepart());
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Partie.fxml"));
		root = loader.load();
		PartieController controller = loader.getController();
    	controller.partieAfficher();
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
	
	public void switchToClassement (ActionEvent event) throws IOException {
	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Classement.fxml"));
		root = loader.load();
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
		    Stage stage = (Stage)infoPane.getScene().getWindow();
			stage.close();
		}
	}
}

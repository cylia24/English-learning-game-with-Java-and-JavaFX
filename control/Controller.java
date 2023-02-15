package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import noyau.Jeu;
import noyau.Joueur;
import noyau.Partie;
import noyau.Plateau;
import javafx.scene.Node;

public class Controller {

	protected static Stage stage;
	protected static Scene scene;
	protected static Parent root;
	protected static Main main = new Main();
	protected static Jeu jeu = main.getJeu();
	protected static Joueur j;
	protected static Plateau plateau = new Plateau();
	
}

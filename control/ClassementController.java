package control;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import noyau.Joueur;

public class ClassementController extends Controller implements Initializable{

    @FXML
    private TableView<Joueur> classementTable;

    @FXML
    private TableColumn<Joueur, String> nomJoueur;

    @FXML
    private TableColumn<Joueur, Integer> topScore;
    
    

    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<Joueur> list = FXCollections.observableArrayList(jeu.classement());
    	nomJoueur.setCellValueFactory(new PropertyValueFactory<Joueur,String >("nomJoueur"));
		topScore.setCellValueFactory(new PropertyValueFactory<Joueur,Integer >("meilleurScore"));
		classementTable.setItems(list);
	}

    @FXML
    void switchToInfo(ActionEvent event) {

    }
}

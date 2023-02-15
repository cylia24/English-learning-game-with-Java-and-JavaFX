package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DefinitionController extends Controller{

    @FXML
    private Label aide;

    @FXML
    private Button confirmerReponse;

    @FXML
    private Label definition;

    @FXML
    private BorderPane definitionPane;

    @FXML
    private Button okButton;

    @FXML
    private TextField reponseTextField;

    @FXML
    private Label resultat1;

    @FXML
    private Label resultat2;

    @FXML
    void quitter(ActionEvent event) {
    	Stage stage = (Stage)definitionPane.getScene().getWindow();
		stage.close();

    }

    
    public void initialiser() {
    	definition.setText("Animal mignon qui dit meaw");
    	aide.setText("Aide : le mot contient 3 lettres.");
    }
    
    
    @FXML
    void repondre(ActionEvent event) {
    	confirmerReponse.setDisable(true);
        String reponse = reponseTextField.getText();
        if (reponse.equals("cat")) {
           j.avancer(4);
           j.gagner(20);
           resultat1.setText("C'est la bonne reponse, bravo !");
           resultat2.setText("Allez vers la case : "+j.getNumeroCaseCourant());
        }else {
        	j.reculer(2);
        	resultat1.setText("Ce n'est pas la bonne reponse");
            resultat2.setText("Allez vers la case : "+j.getNumeroCaseCourant());
        }
    	
    	
        okButton.setDisable(false);

    }
    
	public void etatButton(boolean b) {
		okButton.setDisable(b);
	}

}

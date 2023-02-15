package control;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import noyau.CaseException;

public class DesController extends Controller{
	
	Random random = new Random();
	@FXML
	private Button lancerDes,okButton;
	@FXML
	private ImageView  desImageView1,desImageView2;
	@FXML
	private Label sommeDes1,sommeDes2;
	@FXML
	private BorderPane desPane;
	
	public void etatButton(boolean b) {
		okButton.setDisable(b);
	}
	
	public void lancer(ActionEvent event) throws InterruptedException {
		
		lancerDes.setDisable(true);
		int r1=0,r2=0;
        for (int i = 0; i < 15; i++) {
        	r1 = (random.nextInt(6)+1);
	        r2= (random.nextInt(6)+1);
	        desImageView1.setImage(new Image(getClass().getResourceAsStream("../ressource/Des" + r1+".png")));
	        desImageView2.setImage(new Image(getClass().getResourceAsStream("../ressource/Des" + r2+".png")));  
	    }
        int somme = r1+r2;
        j.avancer(somme);	
	    sommeDes1.setText("La somme obtenue : "+String.valueOf(somme));
	    sommeDes2.setText("Allez vers la case : "+String.valueOf(j.getNumeroCaseCourant()));
	    okButton.setDisable(false);

	}

	
	
	public void quitter(ActionEvent event) {

		    Stage stage = (Stage)desPane.getScene().getWindow();
			stage.close();
	}
}

package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageController extends Controller{
    @FXML
    private Button imageOkButton;

    @FXML
    private Label imageReponse;

    @FXML
    private Label imageResultat;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    @FXML
    private ImageView imageView4;
    
    @FXML
    private BorderPane imagePane;

    @FXML
    private Button button1,button2,button3,button4;
    
    
    @FXML
    void quitter(ActionEvent event) {
    	Stage stage = (Stage)imagePane.getScene().getWindow();
		stage.close();
    }
    
	public void etatButton(boolean b) {
		imageOkButton.setDisable(b);
	}
	
	public void initialiser() {
    	imageReponse.setText("Four");
    	imageView1.setImage(new Image(getClass().getResourceAsStream("../ressource/Des1.png")));
    	imageView2.setImage(new Image(getClass().getResourceAsStream("../ressource/Des2.png")));
    	imageView3.setImage(new Image(getClass().getResourceAsStream("../ressource/Des5.png")));
    	imageView4.setImage(new Image(getClass().getResourceAsStream("../ressource/Des4.png")));
    }
    
    
    @FXML
    void repondre(ActionEvent event) {
    	
    	Button btn = (Button) event.getSource();
		String id = btn.getId();
    	if (id.equals("button4")) {
           j.avancer(2);
           j.gagner(20);
           imageResultat.setText("Vous etes raison, Allez vers la case : "+j.getNumeroCaseCourant());
        }else {
        	j.reculer(2);
        	imageResultat.setText("Allez vers la case : "+j.getNumeroCaseCourant());
        }
    	imageOkButton.setDisable(false);
    }

}

package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FinController extends Controller{

    @FXML
    private Button finButton;

    @FXML
    private AnchorPane finPane;

    @FXML
    void switchToInfo(ActionEvent event) throws IOException {
    	Stage stage1 = (Stage)finPane.getScene().getWindow();
		stage1.close();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Info.fxml"));
		root = loader.load();
    	InfoController controller = loader.getController();
    	controller.infoAfficher();
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    }

}
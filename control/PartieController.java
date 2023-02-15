package control;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import noyau.Case;
import noyau.CaseException;

import java.util.Random;

public class PartieController extends Controller {
	
	
	
	
	
    @FXML
    private Label partieInstructionLabel;
	
	@FXML
	private Button lancerDesButton;
	
	public void lancer(ActionEvent event) throws IOException {
		
		lancerDesButton.setDisable(true);	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Des.fxml"));
		Parent root1 = (Parent)loader.load();
		DesController desController = loader.getController();
		desController.etatButton(true);
		Stage stage1 = new Stage();
		stage1.setTitle("Lancement de des");
		stage1.setScene(new Scene(root1));
		stage1.setResizable(false);
		stage1.show();
		partieInstructionLabel.setText("Allez vers la case resulat");
	}

	public void suspendre() {
		
	}
	

	 @FXML
	    private Button case1;

	    @FXML
	    private Button case10;

	    @FXML
	    private Button case100;

	    @FXML
	    private Button case11;

	    @FXML
	    private Button case12;

	    @FXML
	    private Button case13;

	    @FXML
	    private Button case14;

	    @FXML
	    private Button case15;

	    @FXML
	    private Button case16;

	    @FXML
	    private Button case17;

	    @FXML
	    private Button case18;

	    @FXML
	    private Button case19;

	    @FXML
	    private Button case2;

	    @FXML
	    private Button case20;

	    @FXML
	    private Button case21;

	    @FXML
	    private Button case22;

	    @FXML
	    private Button case23;

	    @FXML
	    private Button case24;

	    @FXML
	    private Button case25;

	    @FXML
	    private Button case26;

	    @FXML
	    private Button case27;

	    @FXML
	    private Button case28;

	    @FXML
	    private Button case29;

	    @FXML
	    private Button case3;

	    @FXML
	    private Button case30;

	    @FXML
	    private Button case31;

	    @FXML
	    private Button case32;

	    @FXML
	    private Button case33;

	    @FXML
	    private Button case34;

	    @FXML
	    private Button case35;

	    @FXML
	    private Button case36;

	    @FXML
	    private Button case37;

	    @FXML
	    private Button case38;

	    @FXML
	    private Button case39;

	    @FXML
	    private Button case4;

	    @FXML
	    private Button case40;

	    @FXML
	    private Button case41;

	    @FXML
	    private Button case42;

	    @FXML
	    private Button case43;

	    @FXML
	    private Button case44;

	    @FXML
	    private Button case45;

	    @FXML
	    private Button case46;

	    @FXML
	    private Button case47;

	    @FXML
	    private Button case48;

	    @FXML
	    private Button case49;

	    @FXML
	    private Button case5;

	    @FXML
	    private Button case50;

	    @FXML
	    private Button case51;

	    @FXML
	    private Button case52;

	    @FXML
	    private Button case53;

	    @FXML
	    private Button case54;

	    @FXML
	    private Button case55;

	    @FXML
	    private Button case56;

	    @FXML
	    private Button case57;

	    @FXML
	    private Button case58;

	    @FXML
	    private Button case59;

	    @FXML
	    private Button case6;

	    @FXML
	    private Button case60;

	    @FXML
	    private Button case61;

	    @FXML
	    private Button case62;

	    @FXML
	    private Button case63;

	    @FXML
	    private Button case64;

	    @FXML
	    private Button case65;

	    @FXML
	    private Button case66;

	    @FXML
	    private Button case67;

	    @FXML
	    private Button case68;

	    @FXML
	    private Button case69;

	    @FXML
	    private Button case7;

	    @FXML
	    private Button case70;

	    @FXML
	    private Button case71;

	    @FXML
	    private Button case72;

	    @FXML
	    private Button case73;

	    @FXML
	    private Button case74;

	    @FXML
	    private Button case75;

	    @FXML
	    private Button case76;

	    @FXML
	    private Button case77;

	    @FXML
	    private Button case78;

	    @FXML
	    private Button case79;

	    @FXML
	    private Button case8;

	    @FXML
	    private Button case80;

	    @FXML
	    private Button case81;

	    @FXML
	    private Button case82;

	    @FXML
	    private Button case83;

	    @FXML
	    private Button case84;

	    @FXML
	    private Button case85;

	    @FXML
	    private Button case86;

	    @FXML
	    private Button case87;

	    @FXML
	    private Button case88;

	    @FXML
	    private Button case89;

	    @FXML
	    private Button case9;

	    @FXML
	    private Button case90;

	    @FXML
	    private Button case91;

	    @FXML
	    private Button case92;

	    @FXML
	    private Button case93;

	    @FXML
	    private Button case94;

	    @FXML
	    private Button case95;

	    @FXML
	    private Button case96;

	    @FXML
	    private Button case97;

	    @FXML
	    private Button case98;

	    @FXML
	    private Button case99;

	@FXML
	private Label partieJoueurLabel, partieTopScoreLabel, partieScoreLabel;
	
	public void partieAfficher() {
		partieJoueurLabel.setText(j.getNomJoueur());
    	partieTopScoreLabel.setText(String.valueOf(j.getMeilleurScore()));
    	partieScoreLabel.setText(String.valueOf(j.getScoreCourant()));
    	partieInstructionLabel.setText("Appuyez sur la case jaune pour commencer");
    	lancerDesButton.setDisable(true);
    	Case[] cases = plateau.getCases();
    	case1.setStyle("-fx-background-color: "+cases[0].getCouleur()+"; ");
    	case2.setStyle("-fx-background-color: "+cases[1].getCouleur()+"; ");
    	case3.setStyle("-fx-background-color: "+cases[2].getCouleur()+"; ");
    	case4.setStyle("-fx-background-color: "+cases[3].getCouleur()+"; ");
    	case5.setStyle("-fx-background-color: "+cases[4].getCouleur()+"; ");
    	case6.setStyle("-fx-background-color: "+cases[5].getCouleur()+"; ");
    	case7.setStyle("-fx-background-color: "+cases[6].getCouleur()+"; ");
    	case8.setStyle("-fx-background-color: "+cases[7].getCouleur()+"; ");
    	case9.setStyle("-fx-background-color: "+cases[8].getCouleur()+"; ");
    	case10.setStyle("-fx-background-color: "+cases[9].getCouleur()+"; ");
    	case11.setStyle("-fx-background-color: "+cases[10].getCouleur()+"; ");
    	case12.setStyle("-fx-background-color: "+cases[11].getCouleur()+"; ");
    	case13.setStyle("-fx-background-color: "+cases[12].getCouleur()+"; ");
    	case14.setStyle("-fx-background-color: "+cases[13].getCouleur()+"; ");
    	case15.setStyle("-fx-background-color: "+cases[14].getCouleur()+"; ");
    	case16.setStyle("-fx-background-color: "+cases[15].getCouleur()+"; ");
    	case17.setStyle("-fx-background-color: "+cases[16].getCouleur()+"; ");
    	case18.setStyle("-fx-background-color: "+cases[17].getCouleur()+"; ");
    	case19.setStyle("-fx-background-color: "+cases[18].getCouleur()+"; ");
    	case20.setStyle("-fx-background-color: "+cases[19].getCouleur()+"; ");
    	case21.setStyle("-fx-background-color: "+cases[20].getCouleur()+"; ");
    	case22.setStyle("-fx-background-color: "+cases[21].getCouleur()+"; ");
    	case23.setStyle("-fx-background-color: "+cases[22].getCouleur()+"; ");
    	case24.setStyle("-fx-background-color: "+cases[23].getCouleur()+"; ");
    	case25.setStyle("-fx-background-color: "+cases[24].getCouleur()+"; ");
    	case26.setStyle("-fx-background-color: "+cases[25].getCouleur()+"; ");
    	case27.setStyle("-fx-background-color: "+cases[26].getCouleur()+"; ");
    	case28.setStyle("-fx-background-color: "+cases[27].getCouleur()+"; ");
    	case29.setStyle("-fx-background-color: "+cases[28].getCouleur()+"; ");
    	case30.setStyle("-fx-background-color: "+cases[29].getCouleur()+"; ");
    	case31.setStyle("-fx-background-color: "+cases[30].getCouleur()+"; ");
    	case32.setStyle("-fx-background-color: "+cases[31].getCouleur()+"; ");
    	case33.setStyle("-fx-background-color: "+cases[32].getCouleur()+"; ");
    	case34.setStyle("-fx-background-color: "+cases[33].getCouleur()+"; ");
    	case35.setStyle("-fx-background-color: "+cases[34].getCouleur()+"; ");
    	case36.setStyle("-fx-background-color: "+cases[35].getCouleur()+"; ");
    	case37.setStyle("-fx-background-color: "+cases[36].getCouleur()+"; ");
    	case38.setStyle("-fx-background-color: "+cases[37].getCouleur()+"; ");
    	case39.setStyle("-fx-background-color: "+cases[38].getCouleur()+"; ");
    	case40.setStyle("-fx-background-color: "+cases[39].getCouleur()+"; ");
    	case41.setStyle("-fx-background-color: "+cases[40].getCouleur()+"; ");
    	case42.setStyle("-fx-background-color: "+cases[41].getCouleur()+"; ");
    	case43.setStyle("-fx-background-color: "+cases[42].getCouleur()+"; ");
    	case44.setStyle("-fx-background-color: "+cases[43].getCouleur()+"; ");
    	case45.setStyle("-fx-background-color: "+cases[44].getCouleur()+"; ");
    	case46.setStyle("-fx-background-color: "+cases[45].getCouleur()+"; ");
    	case47.setStyle("-fx-background-color: "+cases[46].getCouleur()+"; ");
    	case48.setStyle("-fx-background-color: "+cases[47].getCouleur()+"; ");
    	case49.setStyle("-fx-background-color: "+cases[48].getCouleur()+"; ");
    	case50.setStyle("-fx-background-color: "+cases[49].getCouleur()+"; ");
    	case51.setStyle("-fx-background-color: "+cases[50].getCouleur()+"; ");    	
    	case52.setStyle("-fx-background-color: "+cases[51].getCouleur()+"; ");
    	case53.setStyle("-fx-background-color: "+cases[52].getCouleur()+"; ");
    	case54.setStyle("-fx-background-color: "+cases[53].getCouleur()+"; ");
    	case55.setStyle("-fx-background-color: "+cases[54].getCouleur()+"; ");
    	case56.setStyle("-fx-background-color: "+cases[55].getCouleur()+"; ");
    	case57.setStyle("-fx-background-color: "+cases[56].getCouleur()+"; ");
    	case58.setStyle("-fx-background-color: "+cases[57].getCouleur()+"; ");
    	case59.setStyle("-fx-background-color: "+cases[58].getCouleur()+"; ");
    	case60.setStyle("-fx-background-color: "+cases[59].getCouleur()+"; ");
    	case61.setStyle("-fx-background-color: "+cases[60].getCouleur()+"; ");
    	case62.setStyle("-fx-background-color: "+cases[61].getCouleur()+"; ");
    	case63.setStyle("-fx-background-color: "+cases[62].getCouleur()+"; ");
    	case64.setStyle("-fx-background-color: "+cases[63].getCouleur()+"; ");
    	case65.setStyle("-fx-background-color: "+cases[64].getCouleur()+"; ");
    	case66.setStyle("-fx-background-color: "+cases[65].getCouleur()+"; ");
    	case67.setStyle("-fx-background-color: "+cases[66].getCouleur()+"; ");
    	case68.setStyle("-fx-background-color: "+cases[67].getCouleur()+"; ");
    	case69.setStyle("-fx-background-color: "+cases[68].getCouleur()+"; ");
    	case70.setStyle("-fx-background-color: "+cases[69].getCouleur()+"; ");
    	case71.setStyle("-fx-background-color: "+cases[70].getCouleur()+"; ");    	
    	case72.setStyle("-fx-background-color: "+cases[71].getCouleur()+"; ");
    	case73.setStyle("-fx-background-color: "+cases[72].getCouleur()+"; ");
    	case74.setStyle("-fx-background-color: "+cases[73].getCouleur()+"; ");
    	case75.setStyle("-fx-background-color: "+cases[74].getCouleur()+"; ");
    	case76.setStyle("-fx-background-color: "+cases[75].getCouleur()+"; ");
    	case77.setStyle("-fx-background-color: "+cases[76].getCouleur()+"; ");
    	case78.setStyle("-fx-background-color: "+cases[77].getCouleur()+"; ");
    	case79.setStyle("-fx-background-color: "+cases[78].getCouleur()+"; ");
    	case80.setStyle("-fx-background-color: "+cases[79].getCouleur()+"; ");
    	case81.setStyle("-fx-background-color: "+cases[80].getCouleur()+"; ");
    	case82.setStyle("-fx-background-color: "+cases[81].getCouleur()+"; ");
    	case83.setStyle("-fx-background-color: "+cases[82].getCouleur()+"; ");
    	case84.setStyle("-fx-background-color: "+cases[83].getCouleur()+"; ");
    	case85.setStyle("-fx-background-color: "+cases[84].getCouleur()+"; ");
    	case86.setStyle("-fx-background-color: "+cases[85].getCouleur()+"; ");
    	case87.setStyle("-fx-background-color: "+cases[86].getCouleur()+"; ");
    	case88.setStyle("-fx-background-color: "+cases[87].getCouleur()+"; ");
    	case89.setStyle("-fx-background-color: "+cases[88].getCouleur()+"; ");
    	case90.setStyle("-fx-background-color: "+cases[89].getCouleur()+"; ");
    	case91.setStyle("-fx-background-color: "+cases[90].getCouleur()+"; ");
    	case92.setStyle("-fx-background-color: "+cases[91].getCouleur()+"; ");
    	case93.setStyle("-fx-background-color: "+cases[92].getCouleur()+"; ");
    	case94.setStyle("-fx-background-color: "+cases[93].getCouleur()+"; ");
    	case95.setStyle("-fx-background-color: "+cases[94].getCouleur()+"; ");
    	case96.setStyle("-fx-background-color: "+cases[95].getCouleur()+"; ");
    	case97.setStyle("-fx-background-color: "+cases[96].getCouleur()+"; ");
    	case98.setStyle("-fx-background-color: "+cases[97].getCouleur()+"; ");
    	case99.setStyle("-fx-background-color: "+cases[98].getCouleur()+"; ");
    	case100.setStyle("-fx-background-color: "+cases[99].getCouleur()+"; ");
    }
	
	
	public int getID(ActionEvent event) {
		Button btn = (Button) event.getSource();
		//btn.setTextFill(Color.AQUA);
		String id = btn.getId();
        String[] chaine = id.split("e");
		int i = Integer.parseInt(chaine[1]);
		return (i-1);
	}

    public void partieCaseActionDepart(ActionEvent event) {
		lancerDesButton.setDisable(false);
		partieInstructionLabel.setText("Lancez le dés pour commencer");
	}
    
    public void partieCaseActionParcours(ActionEvent event) {
		lancerDesButton.setDisable(false);
		partieInstructionLabel.setText("Lancez le dés pour avancer");
	}
	
    public void partieCaseActionFin(ActionEvent event) throws IOException {
    	Stage stage2 = (Stage)partiePane.getScene().getWindow();
		stage2.close();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Fin.fxml"));
		Parent root1 = (Parent)loader.load();
		Stage stage1 = new Stage();
		stage1.setTitle("Fin!");
		stage1.setScene(new Scene(root1));
		stage1.setResizable(false);
		stage1.show();

    }
    public void partieCaseActionBonus(ActionEvent event) {
    	
		partieScoreLabel.setText(String.valueOf(j.getScoreCourant()));
		partieTopScoreLabel.setText(String.valueOf(j.getMeilleurScore()));
		partieInstructionLabel.setText("Vous avez ganger 10 pts, allez vers la case : "+j.getNumeroCaseCourant());
		
	}

    
    public void partieCaseActionMalus(ActionEvent event) {
		
    	partieScoreLabel.setText(String.valueOf(j.getScoreCourant()));
		partieInstructionLabel.setText("Vous avez perdu 10 pts, allez vers la case : "+j.getNumeroCaseCourant());
	}
	
    public void partieCaseActionSaut(ActionEvent event) {

		partieInstructionLabel.setText("Allez vers la case : "+j.getNumeroCaseCourant());
	}
    public void partieCaseActionDefinition(ActionEvent event) throws IOException {
		
    	partieInstructionLabel.setText("***");
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Definition.fxml"));
		Parent root1 = (Parent)loader.load();
		DefinitionController definitionController = loader.getController();
		definitionController.etatButton(true);
		definitionController.initialiser();
		Stage stage1 = new Stage();
		stage1.setTitle("Definition");
		stage1.setScene(new Scene(root1));
		stage1.setResizable(false);
		stage1.show();
    }
    public void partieCaseActionImage(ActionEvent event) throws IOException {
    	partieInstructionLabel.setText("***");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaceGraphique/Image.fxml"));
		Parent root1 = (Parent)loader.load();
		ImageController imageController = loader.getController();
		imageController.etatButton(true);
		imageController.initialiser();
		Stage stage1 = new Stage();
		stage1.setTitle("Image");
		stage1.setScene(new Scene(root1));
		stage1.setResizable(false);
		stage1.show();
    }
	
	public void partieButtonAction(ActionEvent event) throws IOException{
		Case [] cases = plateau.getCases();
		int i = getID(event);
		try {
			if ((i+1)!=j.getNumeroCaseCourant() && cases[i].toString().equals("Parcours"))
			{
				throw new CaseException("Ce n'est pas la bonne case, Allez vers la case : "+j.getNumeroCaseCourant());
			}
			
			cases[i].action(j);
			String type = cases[i].toString();
			switch(type) {
			case "Depart":{
				partieCaseActionDepart(event);
			} break;
			case "Fin":{
				partieCaseActionFin(event);
			} break;
			case "Saut":{
				partieCaseActionSaut(event);
			} break;
			case "Bonus":{
				partieCaseActionBonus(event);
			} break;
			case "Malus":{
				partieCaseActionMalus(event);
			} break;
			case "Definition":{
				partieCaseActionDefinition(event);
			} break;
			case "Image":{
				partieCaseActionImage(event);
			} break;
			case "Parcours":{
				partieCaseActionParcours(event);
			} break;
			}
	   }
		catch(CaseException e) {
			partieInstructionLabel.setText(e.getMessage());
		}
		
		
	}

	
	
	@FXML
	private BorderPane partiePane;
	public void quitter(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Quitter");
		alert.setHeaderText("you'll quit");
		alert.setContentText("do you want somtheing before ?");
		if(alert.showAndWait().get()==ButtonType.OK) {
		    Stage stage = (Stage)partiePane.getScene().getWindow();
			stage.close();
		}
	}

}

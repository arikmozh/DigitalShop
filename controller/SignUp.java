package controller;

import java.io.IOException;

import code.Client;
import code.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SignUp {

	static Store store = Store.getInstance();

    @FXML
    private AnchorPane anchorPane_anchor;

    @FXML
    private ImageView img_img;

    @FXML
    private TextField userName_txt;

    @FXML
    private Button signUp_btn;

    @FXML
    private Line line1_line;

    @FXML
    private Line line2_line;

    @FXML
    private TextField userYear_txt;

    @FXML
    private TextField userPhone_txt;

    @FXML
    void signUp(ActionEvent event) throws IOException {
    	if(CheckPhone(userPhone_txt.getText()) && CheckYear(userYear_txt.getText())) {
    		Client newC = new Client(userName_txt.getText(), Integer.parseInt(userYear_txt.getText()), userPhone_txt.getText(), null);
        	store.addClient(newC);
        	store.setCurrentClient(newC);
        	OpenStoreAfterSignUp();
    	}
    	else
    		userName_txt.setText("check phone/year");
    	
    }
    
    public void OpenStoreAfterSignUp() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/ShopClient.fxml"));
    	Scene scene = new Scene(root);
   		stage.setTitle("Shop");
  		stage.setScene(scene);
  		stage.setResizable(false);
   		stage.show();
    		
   		Stage old = (Stage)signUp_btn.getScene().getWindow();
   		old.close();
   	}
    
    public boolean CheckPhone(String s) {
    	String regex = "[0-9]+";
    	int len = 10;
    	if (s.matches(regex) && s.length()==len)
    		return true;
    	else
    		return false;
    }
    
    public boolean CheckYear(String s) {
    	String regex = "[0-9]+";
    	int len = 4;
    	if (s.matches(regex) && s.length()==len && Integer.parseInt(s) < 2007 && Integer.parseInt(s) > 1900)
    		return true;
    	else
    		return false;
    }
    
   

}

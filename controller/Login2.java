package controller;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import code.*;
import code.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login2 implements Initializable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Store store = Store.getInstance();
	
    @FXML
    private AnchorPane anchorPane_anchor;

    @FXML
    private TextField userName_txt;

    @FXML
    private PasswordField userPassword_txt;

    @FXML
    private Text shoplogo_txt;

    @FXML
    private Button login_btn;

    @FXML
    private Line line1_line;

    @FXML
    private Line line2_line;

    @FXML
    private ImageView img_img;
    
    @FXML
    private ComboBox<String> combo;
    

    @FXML
    void Loginn(ActionEvent event) throws IOException {
    	
    	if(userName_txt.getText().equals("admin") && userPassword_txt.getText().equals("admin") &&
    			combo.getValue().equals("Admin")) {
    		OpenAdminPanel();
    	}
 	
    	else if(ClientExist() && combo.getValue().equals("Client")){
    		Client current = store.getClients().get(Integer.parseInt(userName_txt.getText()));
    		store.setCurrentClient(current);
    		OpenStoreAfterLogin();
    	}
    	
    	else if(ManagerExist() && combo.getValue().equals("Manager")) {
    		Manager current2 = store.getManagers().get(Integer.parseInt(userName_txt.getText()));
    		store.setCurrentManager(current2);
    		OpenManagerPanel();
    	}
    	else if(combo.getValue().equals(null))
    		userName_txt.setText("wrong input .");
    	else 
    		userName_txt.setText("wrong input .");

    }
    
    public void OpenStoreAfterLogin() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/ShopClient.fxml"));
    	Scene scene = new Scene(root);
   		stage.setTitle("Shop");
  		stage.setScene(scene);
  		stage.setResizable(false);
   		stage.show();
    		
   		Stage old = (Stage)login_btn.getScene().getWindow();
   		old.close();
   	}
    
    public void OpenAdminPanel() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Admin.fxml"));
    	Scene scene = new Scene(root);
   		stage.setTitle("Admin");
  		stage.setScene(scene);
  		stage.setResizable(false);
   		stage.show();
    		
   		Stage old = (Stage)login_btn.getScene().getWindow();
   		old.close();
   	}
    
    public void OpenManagerPanel() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Manager.fxml"));
    	Scene scene = new Scene(root);
   		stage.setTitle("Manager");
  		stage.setScene(scene);
  		stage.setResizable(false);
   		stage.show();
    		
   		Stage old = (Stage)login_btn.getScene().getWindow();
   		old.close();
   	}
    
    public boolean ClientExist() {
    	int userNameKey = Integer.parseInt(userName_txt.getText());
    	int passwordKey = Integer.parseInt(userPassword_txt.getText());
	
    	if(userNameKey == passwordKey) 
    		if(store.getClients().get(userNameKey) !=  null)
    			return true;
    	return false;
    }
    
    public boolean ManagerExist() {
    	int userNameKey = Integer.parseInt(userName_txt.getText());
    	int passwordKey = Integer.parseInt(userPassword_txt.getText());
	
    	if(userNameKey == passwordKey) 
    		if(store.getManagers().get(userNameKey) !=  null)
    			return true;
    	return false;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		combo.getItems().add("Client");
		combo.getItems().add("Manager");
		combo.getItems().add("Admin");

	}
	
	/*
	  public boolean ClientExist() {
    	int userNameKey = Integer.parseInt(userName_txt.getText());
    	int passwordKey = Integer.parseInt(userPassword_txt.getText());
	
    	if(userNameKey == passwordKey) 
    		if(store.getClients().get(userNameKey) !=  null ||
    				store.getManagers().get(userNameKey) !=  null)
    			return true;
    	return false;
    }
	 */

}

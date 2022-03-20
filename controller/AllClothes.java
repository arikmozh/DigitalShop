package controller;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import code.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AllClothes implements Initializable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Store store = Store.getInstance();
	
    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView imgview_img;

    @FXML
    private MenuBar menuBar_menu;

    @FXML
    private Menu menuLogin_menu;

    @FXML
    private MenuItem menuItemLogin;

    @FXML
    private Button loginBtn;

    @FXML
    private MenuItem menuItemSignUp;

    @FXML
    private Button signUpBtn;

    @FXML
    private Menu menuItem3;

    @FXML
    private Button backToStore_btn;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab shirtsTab;

    @FXML
    private AnchorPane shirtsAnchor;

    @FXML
    private Label shirts_lbl;

    @FXML
    private TextArea shirts_txt;

    @FXML
    private Tab tshirtsTab;

    @FXML
    private AnchorPane tshirtsAnchor;

    @FXML
    private Label tshirts_lbl;

    @FXML
    private TextArea tshirts_txt;

    @FXML
    private Tab hoodiesTab;

    @FXML
    private AnchorPane hoodiesAnchor;

    @FXML
    private Label hoodies_lbl;

    @FXML
    private TextArea hoodies_txt;

    @FXML
    private Tab jacketsTab;

    @FXML
    private AnchorPane jacketsAnchor;

    @FXML
    private Label jackets_lbl;

    @FXML
    private TextArea jackets_txt;

    @FXML
    private Tab trousersTab;

    @FXML
    private AnchorPane trousersAnchor;

    @FXML
    private Label trousers_lbl;

    @FXML
    private TextArea trousers_txt;

    @FXML
    private Tab shortsTab;

    @FXML
    private AnchorPane shortsAnchor;

    @FXML
    private Label shorts_lbl;

    @FXML
    private TextArea shorts_txt;

    @FXML
    private Tab jeansTab;

    @FXML
    private AnchorPane jeansAnchor;

    @FXML
    private Label jeans_lbl;

    @FXML
    private TextArea jeans_txt;

    @FXML
    private Tab underwearTab;

    @FXML
    private AnchorPane underwearAnchor;

    @FXML
    private Label underwear_lbl;

    @FXML
    private TextArea underwear_txt;

    @FXML
    private Tab loungwearTab;

    @FXML
    private AnchorPane loungwearAnchor;

    @FXML
    private Label loung_lbl;

    @FXML
    private TextArea lounge_txt;

    @FXML
    private Tab socksTab;

    @FXML
    private AnchorPane socksAnchor;

    @FXML
    private Label socks_lbl;

    @FXML
    private TextArea socks_txt;

    @FXML
    void SignUpBTN(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/SignUp.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Sign-Up");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();
   		
  		Stage old = (Stage)signUpBtn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void backToStore_btn(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Shop.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Store - Shop");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)backToStore_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void loginBTN(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Login2.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Login");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)loginBtn.getScene().getWindow();
   		old.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		shirts_txt.setText(store.printShirts());
		tshirts_txt.setText(store.printTShirts());
		hoodies_txt.setText(store.printHoodies());
		jackets_txt.setText(store.printJackets());
		trousers_txt.setText(store.printTrousers());
		shorts_txt.setText(store.printShorts());
		jeans_txt.setText(store.printJeanss());
		underwear_txt.setText(store.printUnderweares());
		lounge_txt.setText(store.printLoungewears());
		socks_txt.setText(store.printSockss());

	}

}

package controller;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import code.Client;
import code.Item;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AllClothesClient implements Initializable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Store store = Store.getInstance();

    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView imgView;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menu_menu;

    @FXML
    private Label menu_lbl;

    @FXML
    private Menu menu2_menu;

    @FXML
    private Button back_btn;

    @FXML
    private Menu menu3_menu;

    @FXML
    private Button cart_btn;

    @FXML
    private TabPane TabPane;

    @FXML
    private Tab shirtsTab;

    @FXML
    private AnchorPane shirtsAnchor;

    @FXML
    private Button shirtsAdd_btn;

    @FXML
    private Label shirt_lbl;

    @FXML
    private TextArea shirt_txt;

    @FXML
    private TextField shirt_id;

    @FXML
    private Tab tshirtsTab;

    @FXML
    private AnchorPane tshirtAnchor;

    @FXML
    private Button tshirtAdd_btn;

    @FXML
    private Label tshirt_lbl;

    @FXML
    private TextArea tshirt_txt;

    @FXML
    private TextField tshirt_id;

    @FXML
    private Tab hoodiesTab;

    @FXML
    private AnchorPane hoodieAnchor;

    @FXML
    private Button hoodieAdd_btn;

    @FXML
    private Label hoodie_lbl;

    @FXML
    private TextArea hoodie_txt;

    @FXML
    private TextField hoodie_id;

    @FXML
    private Tab jacketsTab;

    @FXML
    private AnchorPane jacketAnchor;

    @FXML
    private Button jacketAdd_btn;

    @FXML
    private Label jacket_lbl;

    @FXML
    private TextArea jacket_txt;

    @FXML
    private TextField jacket_id;

    @FXML
    private Tab trousersTab;

    @FXML
    private AnchorPane trousersAnchor;

    @FXML
    private Button trouserAdd_btn;

    @FXML
    private Label trouser_lbl;

    @FXML
    private TextArea trouser_txt;

    @FXML
    private TextField trouser_id;

    @FXML
    private Tab shortsTab;

    @FXML
    private AnchorPane shortsAnchor;

    @FXML
    private Button shortAdd_btn;

    @FXML
    private Label short_lbl;

    @FXML
    private TextArea short_txt;

    @FXML
    private TextField short_id;

    @FXML
    private Tab jeansTab;

    @FXML
    private AnchorPane jeansAnchor;

    @FXML
    private Button jeansAdd_btn;

    @FXML
    private Label jeans_lbl;

    @FXML
    private TextArea jeans_txt;

    @FXML
    private TextField jeans_id;

    @FXML
    private Tab underwearTab;

    @FXML
    private AnchorPane underwearAnchor;

    @FXML
    private Button underAdd_btn;

    @FXML
    private Label under_lbl;

    @FXML
    private TextArea under_txt;

    @FXML
    private TextField under_id;

    @FXML
    private Tab loungwearTab;

    @FXML
    private AnchorPane loungwearAnchor;

    @FXML
    private Button loungeAdd_btn;

    @FXML
    private Label lounge_lbl;

    @FXML
    private TextArea lounge_txt;

    @FXML
    private TextField lounge_id;

    @FXML
    private Tab socksTab;

    @FXML
    private AnchorPane socksAnchor;

    @FXML
    private Button socksAdd_btn;

    @FXML
    private Label socks_lbl;

    @FXML
    private TextArea socks_txt;

    @FXML
    private TextField socks_id;

    @FXML
    void addHoodie_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(hoodie_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	hoodie_lbl.setText("Added");
    }

    @FXML
    void addJacket_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(jacket_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	jacket_lbl.setText("Added");
    }

    @FXML
    void addJeans_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(jeans_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	jeans_lbl.setText("Added");
    }

    @FXML
    void addLoungewear_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(lounge_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	lounge_lbl.setText("Added");
    }

    @FXML
    void addShirt_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(shirt_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	shirt_lbl.setText("Added");
    }

    @FXML
    void addShort_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(short_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	short_lbl.setText("Added");
    }

    @FXML
    void addSocks_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(socks_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	socks_lbl.setText("Added");
    }

    @FXML
    void addTrouser_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(trouser_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	trouser_lbl.setText("Added");
    }

    @FXML
    void addTshirt_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(tshirt_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	tshirt_lbl.setText("Added");
    }

    @FXML
    void addUnderwear_btn(ActionEvent event) {
    	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(under_id.getText());
    	Item item = store.getTrousers().get(ItemToGet);
    	store.addItemToCart(current, item);
    	under_lbl.setText("Added");
    }

    @FXML
    void backToStore(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/ShopClient.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Store - Shop");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)back_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void goToCart(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Cart.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Shopping-Cart");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)cart_btn.getScene().getWindow();
   		old.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		menu_lbl.setText("Hello, "+store.getCurrentClient().get_name());
		shirt_txt.setText(store.printShirts());
		tshirt_txt.setText(store.printTShirts());
		hoodie_txt.setText(store.printHoodies());
		jacket_txt.setText(store.printJackets());
		trouser_txt.setText(store.printTrousers());
		short_txt.setText(store.printShorts());
		jeans_txt.setText(store.printJeanss());
		under_txt.setText(store.printUnderweares());
		lounge_txt.setText(store.printLoungewears());
		socks_txt.setText(store.printSockss());

	}

}

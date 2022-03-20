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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Cart implements Initializable, Serializable{
	
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
    private Menu menutab1;

    @FXML
    private Label menu_lbl;

    @FXML
    private Menu menuTab2;

    @FXML
    private Button menu_back;

    @FXML
    private TextArea cart_txt;

    @FXML
    private Text cart_logo;

    @FXML
    private Line line1;

    @FXML
    private Line line2;

    @FXML
    private Text totalprice_txt;

    @FXML
    private Label totalcartPrice_lbl;

    @FXML
    private Button Buy_btn;

    @FXML
    private TextField addId_txt;

    @FXML
    private Text Add_logo;

    @FXML
    private Button addItem_btn;

    @FXML
    private TextField removeId_txt;

    @FXML
    private Text remove_logo;

    @FXML
    private Button removeId_btn;

    @FXML
    private ComboBox<String> comboAdd;

    @FXML
    private ComboBox<String> comboDelete;

    @FXML
    void AddItem_btn(ActionEvent event) {
       	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(addId_txt.getText());
    	if(comboAdd.getValue().toString().equals("Shirt")) {
        	Item item = store.getShirt().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("TShirt")) {
        	Item item = store.getTShirt().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Hoodie")) {
        	Item item = store.getHoodies().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Jacket")) {
        	Item item = store.getJackets().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Trouser")) {
        	Item item = store.getTrousers().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Jeans")) {
        	Item item = store.getJeans().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Underweare")) {
        	Item item = store.getUnderweare().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Loungewear")) {
        	Item item = store.getLoungewear().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboAdd.getValue().toString().equals("Socks")) {
        	Item item = store.getSocks().get(ItemToGet);
        	store.addItemToCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));
    	}
    }

    @FXML
    void But_btn(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Billing.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Billing");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)menu_back.getScene().getWindow();
   		old.close();
    }

    @FXML
    void RemoveId_btn(ActionEvent event) {
       	Client current = store.getCurrentClient();
    	int ItemToGet = Integer.parseInt(removeId_txt.getText());
    	if(comboDelete.getValue().toString().equals("Shirt")) {
        	Item item = store.getShirt().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("TShirt")) {
        	Item item = store.getTShirt().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Hoodie")) {
        	Item item = store.getHoodies().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Jacket")) {
        	Item item = store.getJackets().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Trouser")) {
        	Item item = store.getTrousers().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Jeans")) {
        	Item item = store.getJeans().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Underweare")) {
        	Item item = store.getUnderweare().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Loungewear")) {
        	Item item = store.getLoungewear().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));

    	}
    	else if(comboDelete.getValue().toString().equals("Socks")) {
        	Item item = store.getSocks().get(ItemToGet);
        	store.removeItemFromCart(current, item);
        	cart_txt.setText(store.printCart(current));
    		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPrice()));
    	}
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

    	Stage old = (Stage)menu_back.getScene().getWindow();
   		old.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		totalcartPrice_lbl.setText(Double.toString(store.getTotalCartPriceClient()));
		cart_txt.setText(store.printCart(store.getCurrentClient()));
		comboAdd.getItems().add("Shirt");
		comboAdd.getItems().add("TShirt");
		comboAdd.getItems().add("Hoodie");
		comboAdd.getItems().add("Jacket");
		comboAdd.getItems().add("Trouser");
		comboAdd.getItems().add("Short");
		comboAdd.getItems().add("Jeans");
		comboAdd.getItems().add("Underweare");
		comboAdd.getItems().add("Loungewear");
		comboAdd.getItems().add("Socks");
		
		comboDelete.getItems().add("Shirt");
		comboDelete.getItems().add("TShirt");
		comboDelete.getItems().add("Hoodie");
		comboDelete.getItems().add("Jacket");
		comboDelete.getItems().add("Trouser");
		comboDelete.getItems().add("Short");
		comboDelete.getItems().add("Jeans");
		comboDelete.getItems().add("Underweare");
		comboDelete.getItems().add("Loungewear");
		comboDelete.getItems().add("Socks");


		


	}

}

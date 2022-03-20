package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import code.Client;
import code.Cloths;
import code.Colors;
import code.Item;
import code.Sizes;
import code.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Manager implements Initializable{

	static Store store = Store.getInstance();

    @FXML
    private AnchorPane anchor;

    @FXML
    private MenuBar menubar;

    @FXML
    private Menu menu;

    @FXML
    private Button backtologin_btn;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab userTab;

    @FXML
    private SplitPane split1;

    @FXML
    private AnchorPane userAnchor1;

    @FXML
    private Text addClient_txt;

    @FXML
    private TextField Cname_txt;

    @FXML
    private TextField Cyear_txt;

    @FXML
    private TextField Cphone_txt;

    @FXML
    private Button addC_btn;

    @FXML
    private Text editClient_txt;

    @FXML
    private TextField edtCname_txt;

    @FXML
    private TextField edtCyear_txt;

    @FXML
    private TextField edtCphone_txt;

    @FXML
    private Button edtC_btn;

    @FXML
    private Text enterId_txt;

    @FXML
    private TextField id_txt;

    @FXML
    private AnchorPane userAnchor2;

    @FXML
    private Text Show_txt;

    @FXML
    private TextArea show_txt;

    @FXML
    private ComboBox<String> combo_combo;

    @FXML
    private Button show_btn;

    @FXML
    private Tab clothTab;

    @FXML
    private SplitPane clothSplitPane;

    @FXML
    private AnchorPane clothAnchor1;

    @FXML
    private Text addItem_txt;

    @FXML
    private TextField AdditemDesc_txt;

    @FXML
    private TextField AddpriceItem_txt;

    @FXML
    private Button clothAdd_btn;

    @FXML
    private Text edtItem_txt;

    @FXML
    private TextField editDesc_txt;

    @FXML
    private TextField editPrice_txt;

    @FXML
    private Button ClothEdit_btn;

    @FXML
    private TextField edtId_txt;

    @FXML
    private ComboBox<String> addItemCombo;

    @FXML
    private ComboBox<String> addColorCombo;

    @FXML
    private ComboBox<String> addSizeCombo;

    @FXML
    private ComboBox<String> editItemCombo;

    @FXML
    private ComboBox<String> editColorCombo;

    @FXML
    private ComboBox<String> editSizeCombo;

    @FXML
    private AnchorPane clothAnchor2;

    @FXML
    private Text ClothPickItem_txt;

    @FXML
    private TextArea clothShow_area;

    @FXML
    private ComboBox<String> ClothPick_combo;

    @FXML
    private Button ClothShow_btn;

    @FXML
    void ClothEdit_btn(ActionEvent event) {
    	Cloths cloth =null;
    	Colors color =null;
    	Sizes size =null;
    	
    	if(editColorCombo.getValue().equals("Black")){
    		 color = Colors.Black;
    		 
    	}
    	if(editColorCombo.getValue().equals("White")){
    		 color = Colors.White;
    	}
    	if(editColorCombo.getValue().equals("Blue")){
    		 color = Colors.Blue;
    	}
    	if(editColorCombo.getValue().equals("Red")){
    		 color = Colors.Red;
    	}
    	if(editColorCombo.getValue().equals("Pink")){
    		 color = Colors.Pink;
    	}
    	if(editColorCombo.getValue().equals("Orange")){
    		 color = Colors.Orange;
    	}
    	if(editColorCombo.getValue().equals("Yellow")){
    		 color = Colors.Yellow;
    	}
    	if(editColorCombo.getValue().equals("Purple")){
    		 color = Colors.Purple;
    	}
    	if(editColorCombo.getValue().equals("Green")){
    		 color = Colors.Green;
    	}
    	if(editColorCombo.getValue().equals("Brown")){
    		 color = Colors.Brown;
    	}
    	if(editColorCombo.getValue().equals("Grey")){
    		 color = Colors.Grey;
    	}
    	if(editColorCombo.getValue().equals("Multicolor")){
    		 color = Colors.Multicolor;
    	}
    	if(editSizeCombo.getValue().equals("XS")){
    		 size = Sizes.XS;
    	}
    	if(editSizeCombo.getValue().equals("S")){
    		 size = Sizes.S;
    	}
    	if(editSizeCombo.getValue().equals("M")){
    		 size = Sizes.M;
    	}
    	if(editSizeCombo.getValue().equals("L")){
    		 size = Sizes.L;
    	}
    	if(editSizeCombo.getValue().equals("XL")){
    		 size = Sizes.XL;
    	}
    	if(editSizeCombo.getValue().equals("XXL")){
    		 size = Sizes.XXL;
    	}
    	if(editSizeCombo.getValue().equals("XXXL")){
    		 size = Sizes.XXXL;
    	}
    	if(editItemCombo.getValue().equals("Shirt")){
    		 cloth = Cloths.Shirt;
    		 store.getShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getShirt().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("TShirt")){
    		 cloth = Cloths.TShirt;
    		 store.getTShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getTShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getTShirt().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getTShirt().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Hoodie")){
    		 cloth = Cloths.Hoodie;
    		 store.getHoodies().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getHoodies().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getHoodies().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getHoodies().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Jacket")){
    		 cloth = Cloths.Jacket;
    		 store.getJackets().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getJackets().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getJackets().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getJackets().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Trouser")){
    		 cloth = Cloths.Trouser;
    		 store.getTrousers().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getTrousers().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getTrousers().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getTrousers().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Short")){
    		 cloth = Cloths.Short;
    		 store.getShorts().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getShorts().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getShorts().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getShorts().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Jeans")){
    		 cloth = Cloths.Jeans;
    		 store.getJeans().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getJeans().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getJeans().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getJeans().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Underweare")){
    		 cloth = Cloths.Underweare;
    		 store.getUnderweare().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getUnderweare().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getUnderweare().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getUnderweare().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Loungewear")){
    		 cloth = Cloths.Loungewear;
    		 store.getLoungewear().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getLoungewear().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getLoungewear().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getLoungewear().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));

    	}
    	if(editItemCombo.getValue().equals("Socks")){
    		 cloth = Cloths.Socks;
    		 store.getSocks().get(Integer.parseInt(edtId_txt.getText())).set_itemColor(color);
    		 store.getSocks().get(Integer.parseInt(edtId_txt.getText())).set_itemSize(size);
    		 store.getSocks().get(Integer.parseInt(edtId_txt.getText())).set_desc(editDesc_txt.getText());
    		 store.getSocks().get(Integer.parseInt(edtId_txt.getText())).set_itemPrice(Double.parseDouble(editPrice_txt.getText()));
    	}
    	
    	
    }

    @FXML
    void ClothShow_btn(ActionEvent event) {
    	if(ClothPick_combo.getValue().equals("Shirt")){
    		clothShow_area.setText(store.printShirts());
   	}
   	else if(ClothPick_combo.getValue().equals("TShirt")){
		clothShow_area.setText(store.printTShirts());
   	}
   	else if(ClothPick_combo.getValue().equals("Hoodie")){
		clothShow_area.setText(store.printHoodies());
   	}
   	else if(ClothPick_combo.getValue().equals("Jacket")){
		clothShow_area.setText(store.printJackets());
   	}
   	else if(ClothPick_combo.getValue().equals("Trouser")){
		clothShow_area.setText(store.printTrousers());
   	}
   	else if(ClothPick_combo.getValue().equals("Short")){
		clothShow_area.setText(store.printShorts());
   	}
   	else if(ClothPick_combo.getValue().equals("Jeans")){
		clothShow_area.setText(store.printJeanss());
   	}
   	else if(ClothPick_combo.getValue().equals("Underweare")){
		clothShow_area.setText(store.printUnderweares());
   	}
   	else if(ClothPick_combo.getValue().equals("Loungewear")){
		clothShow_area.setText(store.printLoungewears());
   	}
   	else if(ClothPick_combo.getValue().equals("Socks")){
		clothShow_area.setText(store.printSockss());
   	}

    }

    @FXML
    void addC_btn(ActionEvent event) {
    	store.addClient(new Client(Cname_txt.getText(), Integer.parseInt(Cyear_txt.getText()), Cphone_txt.getText(),null));

    }

    @FXML
    void backtoLogin_btn(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Login2.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Login");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)backtologin_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void clothAdd_btn(ActionEvent event) {
    	Cloths cloth = null;
    	Colors color = null;
    	Sizes size = null;
    	if(addItemCombo.getValue().equals("Shirt")){
    		 cloth = Cloths.Shirt;
    	}
    	if(addItemCombo.getValue().equals("TShirt")){
    		 cloth = Cloths.TShirt;
    	}
    	if(addItemCombo.getValue().equals("Hoodie")){
    		 cloth = Cloths.Hoodie;
    	}
    	if(addItemCombo.getValue().equals("Jacket")){
    		 cloth = Cloths.Jacket;
    	}
    	if(addItemCombo.getValue().equals("Trouser")){
    		 cloth = Cloths.Trouser;
    	}
    	if(addItemCombo.getValue().equals("Short")){
    		 cloth = Cloths.Short;
    	}
    	if(addItemCombo.getValue().equals("Jeans")){
    		 cloth = Cloths.Jeans;
    	}
    	if(addItemCombo.getValue().equals("Underweare")){
    		 cloth = Cloths.Underweare;
    	}
    	if(addItemCombo.getValue().equals("Loungewear")){
    		 cloth = Cloths.Loungewear;
    	}
    	if(addItemCombo.getValue().equals("Socks")){
    		 cloth = Cloths.Socks;
    	}
    	
    	if(addColorCombo.getValue().equals("Black")){
    		 color = Colors.Black;
    	}
    	if(addColorCombo.getValue().equals("White")){
    		 color = Colors.White;
    	}
    	if(addColorCombo.getValue().equals("Blue")){
    		 color = Colors.Blue;
    	}
    	if(addColorCombo.getValue().equals("Red")){
    		 color = Colors.Red;
    	}
    	if(addColorCombo.getValue().equals("Pink")){
    		 color = Colors.Pink;
    	}
    	if(addColorCombo.getValue().equals("Orange")){
    		 color = Colors.Orange;
    	}
    	if(addColorCombo.getValue().equals("Yellow")){
    		 color = Colors.Yellow;
    	}
    	if(addColorCombo.getValue().equals("Purple")){
    		 color = Colors.Purple;
    	}
    	if(addColorCombo.getValue().equals("Green")){
    		 color = Colors.Green;
    	}
    	if(addColorCombo.getValue().equals("Brown")){
    		 color = Colors.Brown;
    	}
    	if(addColorCombo.getValue().equals("Grey")){
    		 color = Colors.Grey;
    	}
    	if(addColorCombo.getValue().equals("Multicolor")){
    		 color = Colors.Multicolor;
    	}
    	if(addSizeCombo.getValue().equals("XS")){
    		 size = Sizes.XS;
    	}
    	if(addSizeCombo.getValue().equals("S")){
    		 size = Sizes.S;
    	}
    	if(addSizeCombo.getValue().equals("M")){
    		 size = Sizes.M;
    	}
    	if(addSizeCombo.getValue().equals("L")){
    		 size = Sizes.L;
    	}
    	if(addSizeCombo.getValue().equals("XL")){
    		 size = Sizes.XL;
    	}
    	if(addSizeCombo.getValue().equals("XXL")){
    		 size = Sizes.XXL;
    	}
    	if(addSizeCombo.getValue().equals("XXXL")){
    		 size = Sizes.XXXL;
    	}
    	store.addItem(new Item(cloth, size, color, AdditemDesc_txt.getText(), Double.parseDouble(AddpriceItem_txt.getText())));

    }

    @FXML
    void editC_btn(ActionEvent event) {
    	store.getClients().get(Integer.parseInt(id_txt.getText())).set_name(edtCname_txt.getText());
    	store.getClients().get(Integer.parseInt(id_txt.getText())).set_birthYear(Integer.parseInt(edtCyear_txt.getText()));
    	store.getClients().get(Integer.parseInt(id_txt.getText())).set_phone(edtCphone_txt.getText());

    }

    @FXML
    void show_btn(ActionEvent event) {
     	if(combo_combo.getValue().equals("Clients"))
    		show_txt.setText(store.printClients());
    	else if(combo_combo.getValue().equals("Managers"))
    		show_txt.setText(store.printManagers());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		combo_combo.getItems().add("Clients");
		combo_combo.getItems().add("Managers");
		
		addItemCombo.getItems().add("Shirt");
		addItemCombo.getItems().add("TShirt");
		addItemCombo.getItems().add("Hoodie");
		addItemCombo.getItems().add("Jacket");
		addItemCombo.getItems().add("Trouser");
		addItemCombo.getItems().add("Short");
		addItemCombo.getItems().add("Jeans");
		addItemCombo.getItems().add("Underweare");
		addItemCombo.getItems().add("Loungewear");
		addItemCombo.getItems().add("Socks");

		addColorCombo.getItems().add("Black");
		addColorCombo.getItems().add("White");
		addColorCombo.getItems().add("Blue");
		addColorCombo.getItems().add("Red");
		addColorCombo.getItems().add("Pink");
		addColorCombo.getItems().add("Orange");
		addColorCombo.getItems().add("Yellow");
		addColorCombo.getItems().add("Purple");
		addColorCombo.getItems().add("Green");
		addColorCombo.getItems().add("Brown");
		addColorCombo.getItems().add("Grey");
		addColorCombo.getItems().add("Multicolor");

		addSizeCombo.getItems().add("XS");
		addSizeCombo.getItems().add("S");
		addSizeCombo.getItems().add("M");
		addSizeCombo.getItems().add("L");
		addSizeCombo.getItems().add("XL");
		addSizeCombo.getItems().add("XXL");
		addSizeCombo.getItems().add("XXL");
		
		editItemCombo.getItems().add("Shirt");
		editItemCombo.getItems().add("TShirt");
		editItemCombo.getItems().add("Hoodie");
		editItemCombo.getItems().add("Jacket");
		editItemCombo.getItems().add("Trouser");
		editItemCombo.getItems().add("Short");
		editItemCombo.getItems().add("Jeans");
		editItemCombo.getItems().add("Underweare");
		editItemCombo.getItems().add("Loungewear");
		editItemCombo.getItems().add("Socks");

		editColorCombo.getItems().add("Black");
		editColorCombo.getItems().add("White");
		editColorCombo.getItems().add("Blue");
		editColorCombo.getItems().add("Red");
		editColorCombo.getItems().add("Pink");
		editColorCombo.getItems().add("Orange");
		editColorCombo.getItems().add("Yellow");
		editColorCombo.getItems().add("Purple");
		editColorCombo.getItems().add("Green");
		editColorCombo.getItems().add("Brown");
		editColorCombo.getItems().add("Grey");
		editColorCombo.getItems().add("Multicolor");
		
		editSizeCombo.getItems().add("XS");
		editSizeCombo.getItems().add("S");
		editSizeCombo.getItems().add("M");
		editSizeCombo.getItems().add("L");
		editSizeCombo.getItems().add("XL");
		editSizeCombo.getItems().add("XXL");
		editSizeCombo.getItems().add("XXL");
		
		ClothPick_combo.getItems().add("Shirt");
		ClothPick_combo.getItems().add("TShirt");
		ClothPick_combo.getItems().add("Hoodie");
		ClothPick_combo.getItems().add("Jacket");
		ClothPick_combo.getItems().add("Trouser");
		ClothPick_combo.getItems().add("Short");
		ClothPick_combo.getItems().add("Jeans");
		ClothPick_combo.getItems().add("Underweare");
		ClothPick_combo.getItems().add("Loungewear");
		ClothPick_combo.getItems().add("Socks");

	}

}

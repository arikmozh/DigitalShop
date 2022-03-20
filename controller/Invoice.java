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
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Invoice implements Initializable, Serializable{
	
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
    private Text invoice_logo;

    @FXML
    private Button Back_btn;

    @FXML
    private Line line1;

    @FXML
    private Line line2;

    @FXML
    private Label nameLable_lbl;

    @FXML
    private Label priceLable_lbl;

    @FXML
    private TextArea invoice_txt;

    @FXML
    void pay_btn(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/ShopClient.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Store - Shop");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)Back_btn.getScene().getWindow();
   		old.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		invoice_txt.setText(store.printInvoices(store.getCurrentClient()));
	}

}

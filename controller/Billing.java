package controller;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import code.Credit;
import code.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Billing implements Initializable, Serializable{
	
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
    private TextField cardnumber_txt;

    @FXML
    private Text billing_logo;

    @FXML
    private Button pay_btn;

    @FXML
    private Line line1;

    @FXML
    private Line line2;

    @FXML
    private TextField cardmonth_txt;

    @FXML
    private TextField cardcvv_txt;

    @FXML
    private TextField cardyear_txt;

    @FXML
    private Label nameLable_lbl;

    @FXML
    private Label priceLable_lbl;

    @FXML
    void pay_btn(ActionEvent event) throws IOException {
    	if( CheckVisaNumber(cardnumber_txt.getText()) && CheckVisaMonth(cardmonth_txt.getText()) && 
    			CheckVisaYear(cardyear_txt.getText()) && CheckVisaCvv(cardcvv_txt.getText())) {
    		Credit card = new Credit(cardnumber_txt.getText(), cardmonth_txt.getText(), cardyear_txt.getText(), cardcvv_txt.getText());
        	store.getCurrentClient().set_credit(card);
        	store.getInvoice(store.getCurrentClient());      	
        	Stage stage = new Stage();
           	Parent root = FXMLLoader.load(getClass().getResource("/ui/Invoice.fxml"));
        	Scene scene = new Scene(root);
      		stage.setTitle("Invoice");
       		stage.setScene(scene);
       		stage.setResizable(false);
      		stage.show();

        	Stage old = (Stage)pay_btn.getScene().getWindow();
       		old.close();
    	}
    	else
    		cardnumber_txt.setText("check your card info again.");
    	
    }
    
    public boolean CheckVisaNumber(String s) {
    	String regex = "[0-9]+";
    	int len = 16;
    	if (s.matches(regex) && s.length()==len)
    		return true;
    	else
    		return false;
    }

    public boolean CheckVisaMonth(String s) {
    	String regex = "[0-9]+";
    	int len = 2;
    	if (s.matches(regex) && s.length()==len && Integer.parseInt(s) <= 12 && Integer.parseInt(s) >= 1)
    		return true;
    	else
    		return false;
    }
    
    public boolean CheckVisaYear(String s) {
    	String regex = "[0-9]+";
    	int len = 4;
    	if (s.matches(regex) && s.length()==len && Integer.parseInt(s) >= 2020)
    		return true;
    	else
    		return false;
    }
    
    public boolean CheckVisaCvv(String s) {
    	String regex = "[0-9]+";
    	int len = 3;
    	if (s.matches(regex) && s.length()==len)
    		return true;
    	else
    		return false;
    }

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		nameLable_lbl.setText(store.getCurrentClient().get_name());
		priceLable_lbl.setText(Double.toString(store.getTotalCartPriceClient()));
	}

}

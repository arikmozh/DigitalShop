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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Shop implements Initializable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Store store = Store.getInstance();
	
	 @FXML
	 private MenuItem menuItemSignIn_menu;

	 @FXML
	 private Button menuSignIn_btn;
	 
	 @FXML
	 private MenuItem menuItemSignUp_menu;
	
	 @FXML
	 private Button menuSignUp_btn;

    @FXML
    private AnchorPane anchorPane_anchor;

    @FXML
    private ImageView imageView_img;

    @FXML
    private MenuBar menuBar_menu;

    @FXML
    private Menu menuLogin_menu;

    @FXML
    private Menu menuCart_menu;

    @FXML
    private TabPane tabPane_tab;

    @FXML
    private Tab tabShirts_tab;

    @FXML
    private AnchorPane ShirtsPane_anchor;

    @FXML
    private GridPane shirtsGrid_grid;

    @FXML
    private AnchorPane shirtsGridAnchor1;

    @FXML
    private ImageView shirtsImgView1_img;

    @FXML
    private Label shirtsDesc_lbl1;

    @FXML
    private Text shirtDesc_txt1;

    @FXML
    private Label shirtsPrice_lbl1;

    @FXML
    private Text shirtsPrice_txt1;

    @FXML
    private Button addToCartShirts_btn1;

    @FXML
    private AnchorPane shirtsGridAnchor2;

    @FXML
    private ImageView shirtsImgView2_img;

    @FXML
    private Label shirtsDesc_lbl2;

    @FXML
    private Text shirtDesc_text2;

    @FXML
    private Label shirtsPrice_lbl2;

    @FXML
    private Text shirtsPrice_txt2;

    @FXML
    private Button addToCartShirts_btn2;

    @FXML
    private AnchorPane shirtsGridAnchor3;

    @FXML
    private ImageView shirtsImgView3_img;

    @FXML
    private Label shirtsDesc_lbl3;

    @FXML
    private Text shirtDesc_text3;

    @FXML
    private Label shirtsPrice_lbl3;

    @FXML
    private Text shirtsPrice_txt3;

    @FXML
    private Button addToCartShirts_btn3;

    @FXML
    private AnchorPane shirtsGridAnchor4;

    @FXML
    private ImageView shirtsImgView4_img;

    @FXML
    private Label shirtsDesc_lbl4;

    @FXML
    private Text shirtDesc_text4;

    @FXML
    private Label shirtsPrice_lbl4;

    @FXML
    private Text shirtsPrice_txt4;

    @FXML
    private Button addToCartShirts_btn4;

    @FXML
    private AnchorPane shirtsGridAnchor5;

    @FXML
    private ImageView shirtsImgView5_img;

    @FXML
    private Label shirtsDesc_lbl5;

    @FXML
    private Text shirtDesc_text5;

    @FXML
    private Label shirtsPrice_lbl5;

    @FXML
    private Text shirtsPrice_txt5;

    @FXML
    private Button addToCartShirts_btn5;

    @FXML
    private AnchorPane shirtsGridAnchor6;

    @FXML
    private ImageView shirtsImgView6_img;

    @FXML
    private Label shirtsDesc_lbl6;

    @FXML
    private Text shirtDesc_text6;

    @FXML
    private Label shirtsPrice_lbl6;

    @FXML
    private Text shirtsPrice_txt6;

    @FXML
    private Button addToCartShirts_btn6;

    @FXML
    private AnchorPane shirtsGridAnchor7;

    @FXML
    private ImageView shirtsImgView7_img;

    @FXML
    private Label shirtsDesc_lbl7;

    @FXML
    private Text shirtDesc_text7;

    @FXML
    private Label shirtsPrice_lbl7;

    @FXML
    private Text shirtsPrice_txt7;

    @FXML
    private Button addToCartShirts_btn7;

    @FXML
    private AnchorPane shirtsGridAnchor8;

    @FXML
    private ImageView shirtsImgView8_img;

    @FXML
    private Label shirtsDesc_lbl8;

    @FXML
    private Text shirtDesc_text8;

    @FXML
    private Label shirtsPrice_lbl8;

    @FXML
    private Text shirtsPrice_txt8;

    @FXML
    private Button addToCartShirts_btn8;

    @FXML
    private AnchorPane shirtsGridAnchor9;

    @FXML
    private ImageView shirtsImgView9_img;

    @FXML
    private Label shirtsDesc_lbl9;

    @FXML
    private Text shirtDesc_text9;

    @FXML
    private Label shirtsPrice_lbl9;

    @FXML
    private Text shirtsPrice_txt9;

    @FXML
    private Button addToCartShirts_btn9;

    @FXML
    private Label shirtsGeneralLable_lbl;

    @FXML
    private Button showAllShirts_btn;

    @FXML
    private Tab tabTShirts_tab;

    @FXML
    private AnchorPane TshirtsPane_anchor;

    @FXML
    private GridPane TshirtsGrid_grid;

    @FXML
    private AnchorPane TshirtsGridAnchor1;

    @FXML
    private ImageView TshirtsImgView1_img;

    @FXML
    private Label TshirtsDesc_lbl1;

    @FXML
    private Text TshirtDesc_txt1;

    @FXML
    private Label TshirtsPrice_lbl1;

    @FXML
    private Text TshirtsPrice_txt1;

    @FXML
    private Button addToCartTshirt_btn1;

    @FXML
    private AnchorPane TshirtsGridAnchor2;

    @FXML
    private ImageView TshirtsImgView2_img;

    @FXML
    private Label TshirtsDesc_lbl2;

    @FXML
    private Text TshirtDesc_text2;

    @FXML
    private Label TshirtsPrice_lbl2;

    @FXML
    private Text TshirtsPrice_txt2;

    @FXML
    private Button addToCartTshirt_btn2;

    @FXML
    private AnchorPane TshirtsGridAnchor3;

    @FXML
    private ImageView TshirtsImgView3_img;

    @FXML
    private Label TshirtsDesc_lbl3;

    @FXML
    private Text TshirtDesc_text3;

    @FXML
    private Label TshirtsPrice_lbl3;

    @FXML
    private Text TshirtsPrice_txt3;

    @FXML
    private Button addToCartTshirt_btn3;

    @FXML
    private AnchorPane TshirtsGridAnchor4;

    @FXML
    private ImageView TshirtsImgView4_img;

    @FXML
    private Label TshirtsDesc_lbl4;

    @FXML
    private Text TshirtDesc_text4;

    @FXML
    private Label TshirtsPrice_lbl4;

    @FXML
    private Text TshirtsPrice_txt4;

    @FXML
    private Button addToCartTshirt_btn4;

    @FXML
    private AnchorPane TshirtsGridAnchor5;

    @FXML
    private ImageView TshirtsImgView5_img;

    @FXML
    private Label TshirtsDesc_lbl5;

    @FXML
    private Text TshirtDesc_text5;

    @FXML
    private Label TshirtsPrice_lbl5;

    @FXML
    private Text TshirtsPrice_txt5;

    @FXML
    private Button addToCartTshirt_btn5;

    @FXML
    private AnchorPane TshirtsGridAnchor6;

    @FXML
    private ImageView TshirtsImgView6_img;

    @FXML
    private Label TshirtsDesc_lbl6;

    @FXML
    private Text TshirtDesc_text6;

    @FXML
    private Label TshirtsPrice_lbl6;

    @FXML
    private Text TshirtsPrice_txt6;

    @FXML
    private Button addToCartTshirt_btn6;

    @FXML
    private AnchorPane TshirtsGridAnchor7;

    @FXML
    private ImageView TshirtsImgView7_img;

    @FXML
    private Label TshirtsDesc_lbl7;

    @FXML
    private Text TshirtDesc_text7;

    @FXML
    private Label TshirtsPrice_lbl7;

    @FXML
    private Text TshirtsPrice_txt7;

    @FXML
    private Button addToCartTshirt_btn7;

    @FXML
    private AnchorPane TshirtsGridAnchor8;

    @FXML
    private ImageView TshirtsImgView8_img;

    @FXML
    private Label TshirtsDesc_lbl8;

    @FXML
    private Text TshirtDesc_text8;

    @FXML
    private Label TshirtsPrice_lbl8;

    @FXML
    private Text TshirtsPrice_txt8;

    @FXML
    private Button addToCartTshirt_btn8;

    @FXML
    private AnchorPane TshirtsGridAnchor9;

    @FXML
    private ImageView TshirtsImgView9_img;

    @FXML
    private Label TshirtsDesc_lbl9;

    @FXML
    private Text TshirtDesc_text9;

    @FXML
    private Label TshirtsPrice_lbl9;

    @FXML
    private Text TshirtsPrice_txt9;

    @FXML
    private Button addToCartTshirt_btn9;

    @FXML
    private Label TshirtsGeneralLable_lbl;

    @FXML
    private Button showAllTShirts_btn;

    @FXML
    private Tab tabHoodies_tab;

    @FXML
    private AnchorPane HoodiesPane_anchor;

    @FXML
    private GridPane hoodiesGrid_grid;

    @FXML
    private AnchorPane hoodiesGridAnchor1;

    @FXML
    private ImageView hoodiesImgView1_img;

    @FXML
    private Label hoodiesDesc_lbl1;

    @FXML
    private Text hoodiesDesc_txt1;

    @FXML
    private Label hoodiesPrice_lbl1;

    @FXML
    private Text hoodiesPrice_txt1;

    @FXML
    private Button addToCartHoodies_btn1;

    @FXML
    private AnchorPane hoodiesGridAnchor2;

    @FXML
    private ImageView hoodiesImgView2_img;

    @FXML
    private Label hoodiesDesc_lbl2;

    @FXML
    private Text hoodiesDesc_text2;

    @FXML
    private Label hoodiesPrice_lbl2;

    @FXML
    private Text hoodiesPrice_txt2;

    @FXML
    private Button addToCartHoodies_btn2;

    @FXML
    private AnchorPane hoodiesGridAnchor3;

    @FXML
    private ImageView hoodiesImgView3_img;

    @FXML
    private Label hoodiesDesc_lbl3;

    @FXML
    private Text hoodiesDesc_text3;

    @FXML
    private Label hoodiesPrice_lbl3;

    @FXML
    private Text hoodiesPrice_txt3;

    @FXML
    private Button addToCartHoodies_btn3;

    @FXML
    private AnchorPane hoodiesGridAnchor4;

    @FXML
    private ImageView hoodiesImgView4_img;

    @FXML
    private Label hoodiesDesc_lbl4;

    @FXML
    private Text hoodiesDesc_text4;

    @FXML
    private Label hoodiesPrice_lbl4;

    @FXML
    private Text hoodiesPrice_txt4;

    @FXML
    private Button addToCartHoodies_btn4;

    @FXML
    private AnchorPane hoodiesGridAnchor5;

    @FXML
    private ImageView hoodiesImgView5_img;

    @FXML
    private Label hoodiesDesc_lbl5;

    @FXML
    private Text hoodiesDesc_text5;

    @FXML
    private Label hoodiesPrice_lbl5;

    @FXML
    private Text hoodiesPrice_txt5;

    @FXML
    private Button addToCartHoodies_btn5;

    @FXML
    private AnchorPane hoodiesGridAnchor6;

    @FXML
    private ImageView hoodiesImgView6_img;

    @FXML
    private Label hoodiesDesc_lbl6;

    @FXML
    private Text hoodiesDesc_text6;

    @FXML
    private Label hoodiesPrice_lbl6;

    @FXML
    private Text hoodiesPrice_txt6;

    @FXML
    private Button addToCartHoodies_btn6;

    @FXML
    private AnchorPane hoodiesGridAnchor7;

    @FXML
    private ImageView hoodiesImgView7_img;

    @FXML
    private Label hoodiesDesc_lbl7;

    @FXML
    private Text hoodiesDesc_text7;

    @FXML
    private Label hoodiesPrice_lbl7;

    @FXML
    private Text hoodiesPrice_txt7;

    @FXML
    private Button addToCartHoodies_btn7;

    @FXML
    private AnchorPane hoodiesGridAnchor8;

    @FXML
    private ImageView hoodiesImgView8_img;

    @FXML
    private Label hoodiesDesc_lbl8;

    @FXML
    private Text hoodiesDesc_text8;

    @FXML
    private Label hoodiesPrice_lbl8;

    @FXML
    private Text hoodiesPrice_txt8;

    @FXML
    private Button addToCartHoodies_btn8;

    @FXML
    private AnchorPane hoodiesGridAnchor9;

    @FXML
    private ImageView hoodiesImgView9_img;

    @FXML
    private Label hoodiesDesc_lbl9;

    @FXML
    private Text hoodiesDesc_text9;

    @FXML
    private Label hoodiesPrice_lbl9;

    @FXML
    private Text hoodiesPrice_txt9;

    @FXML
    private Button addToCartHoodies_btn9;

    @FXML
    private Label hoodiesGeneralLable_lbl;

    @FXML
    private Button showAllHoodies_btn;

    @FXML
    private Tab tabJackets_tab;

    @FXML
    private AnchorPane JacketsPane_anchor;

    @FXML
    private GridPane jacketsGrid_grid;

    @FXML
    private AnchorPane jacketsGridAnchor1;

    @FXML
    private ImageView jacketsImgView1_img;

    @FXML
    private Label jacketsDesc_lbl1;

    @FXML
    private Text jacketsDesc_txt1;

    @FXML
    private Label jacketsPrice_lbl1;

    @FXML
    private Text jacketsPrice_txt1;

    @FXML
    private Button addToCartJackets_btn1;

    @FXML
    private AnchorPane jacketsGridAnchor2;

    @FXML
    private ImageView jacketsImgView2_img;

    @FXML
    private Label jacketsDesc_lbl2;

    @FXML
    private Text jacketsDesc_text2;

    @FXML
    private Label jacketsPrice_lbl2;

    @FXML
    private Text jacketsPrice_txt2;

    @FXML
    private Button addToCartJackets_btn2;

    @FXML
    private AnchorPane jacketsGridAnchor3;

    @FXML
    private ImageView jacketsImgView3_img;

    @FXML
    private Label jacketsDesc_lbl3;

    @FXML
    private Text jacketsDesc_text3;

    @FXML
    private Label jacketsPrice_lbl3;

    @FXML
    private Text jacketsPrice_txt3;

    @FXML
    private Button addToCartJackets_btn3;

    @FXML
    private AnchorPane jacketsGridAnchor4;

    @FXML
    private ImageView jacketsImgView4_img;

    @FXML
    private Label jacketsDesc_lbl4;

    @FXML
    private Text jacketsDesc_text4;

    @FXML
    private Label jacketsPrice_lbl4;

    @FXML
    private Text jacketsPrice_txt4;

    @FXML
    private Button addToCartJackets_btn4;

    @FXML
    private AnchorPane jacketsGridAnchor5;

    @FXML
    private ImageView jacketsImgView5_img;

    @FXML
    private Label jacketsDesc_lbl5;

    @FXML
    private Text jacketsDesc_text5;

    @FXML
    private Label jacketsPrice_lbl5;

    @FXML
    private Text jacketsPrice_txt5;

    @FXML
    private Button addToCartJackets_btn5;

    @FXML
    private AnchorPane jacketsGridAnchor6;

    @FXML
    private ImageView jacketsImgView6_img;

    @FXML
    private Label jacketsDesc_lbl6;

    @FXML
    private Text jacketsDesc_text6;

    @FXML
    private Label jacketsPrice_lbl6;

    @FXML
    private Text jacketsPrice_txt6;

    @FXML
    private Button addToCartJackets_btn6;

    @FXML
    private AnchorPane jacketsGridAnchor7;

    @FXML
    private ImageView jacketsImgView7_img;

    @FXML
    private Label jacketsDesc_lbl7;

    @FXML
    private Text jacketsDesc_text7;

    @FXML
    private Label jacketsPrice_lbl7;

    @FXML
    private Text jacketsPrice_txt7;

    @FXML
    private Button addToCartJackets_btn7;

    @FXML
    private AnchorPane jacketsGridAnchor8;

    @FXML
    private ImageView jacketsImgView8_img;

    @FXML
    private Label jacketsDesc_lbl8;

    @FXML
    private Text jacketsDesc_text8;

    @FXML
    private Label jacketsPrice_lbl8;

    @FXML
    private Text jacketsPrice_txt8;

    @FXML
    private Button addToCartJackets_btn8;

    @FXML
    private AnchorPane jacketsGridAnchor9;

    @FXML
    private ImageView jacketsImgView9_img;

    @FXML
    private Label jacketsDesc_lbl9;

    @FXML
    private Text jacketsDesc_text9;

    @FXML
    private Label jacketsPrice_lbl9;

    @FXML
    private Text jacketsPrice_txt9;

    @FXML
    private Button addToCartJackets_btn9;

    @FXML
    private Label JacketsGeneralLable_lbl;

    @FXML
    private Button showAllJackets_btn;

    @FXML
    private Tab tabTrousers_tab;

    @FXML
    private AnchorPane TrousersPane_anchor;

    @FXML
    private GridPane trousersGrid_grid;

    @FXML
    private AnchorPane trousersGridAnchor1;

    @FXML
    private ImageView trousersImgView1_img;

    @FXML
    private Label trousersDesc_lbl1;

    @FXML
    private Text trousersDesc_txt1;

    @FXML
    private Label trousersPrice_lbl1;

    @FXML
    private Text trousersPrice_txt1;

    @FXML
    private Button addToCartTrousers_btn1;

    @FXML
    private AnchorPane trousersGridAnchor2;

    @FXML
    private ImageView trousersImgView2_img;

    @FXML
    private Label trousersDesc_lbl2;

    @FXML
    private Text trousersDesc_text2;

    @FXML
    private Label trousersPrice_lbl2;

    @FXML
    private Text trousersPrice_txt2;

    @FXML
    private Button addToCartTrousers_btn2;

    @FXML
    private AnchorPane trousersGridAnchor3;

    @FXML
    private ImageView trousersImgView3_img;

    @FXML
    private Label trousersDesc_lbl3;

    @FXML
    private Text trousersDesc_text3;

    @FXML
    private Label trousersPrice_lbl3;

    @FXML
    private Text trousersPrice_txt3;

    @FXML
    private Button addToCartTrousers_btn3;

    @FXML
    private AnchorPane trousersGridAnchor4;

    @FXML
    private ImageView trousersImgView4_img;

    @FXML
    private Label trousersDesc_lbl4;

    @FXML
    private Text trousersDesc_text4;

    @FXML
    private Label trousersPrice_lbl4;

    @FXML
    private Text trousersPrice_txt4;

    @FXML
    private Button addToCartTrousers_btn4;

    @FXML
    private AnchorPane trousersGridAnchor5;

    @FXML
    private ImageView trousersImgView5_img;

    @FXML
    private Label trousersDesc_lbl5;

    @FXML
    private Text trousersDesc_text5;

    @FXML
    private Label trousersPrice_lbl5;

    @FXML
    private Text trousersPrice_txt5;

    @FXML
    private Button addToCartTrousers_btn5;

    @FXML
    private AnchorPane trousersGridAnchor6;

    @FXML
    private ImageView trousersImgView6_img;

    @FXML
    private Label trousersDesc_lbl6;

    @FXML
    private Text trousersDesc_text6;

    @FXML
    private Label trousersPrice_lbl6;

    @FXML
    private Text trousersPrice_txt6;

    @FXML
    private Button addToCartTrousers_btn6;

    @FXML
    private AnchorPane trousersGridAnchor7;

    @FXML
    private ImageView trousersImgView7_img;

    @FXML
    private Label trousersDesc_lbl7;

    @FXML
    private Text trousersDesc_text7;

    @FXML
    private Label trousersPrice_lbl7;

    @FXML
    private Text trousersPrice_txt7;

    @FXML
    private Button addToCartTrousers_btn7;

    @FXML
    private AnchorPane trousersGridAnchor8;

    @FXML
    private ImageView trousersImgView8_img;

    @FXML
    private Label trousersDesc_lbl8;

    @FXML
    private Text trousersDesc_text8;

    @FXML
    private Label trousersPrice_lbl8;

    @FXML
    private Text trousersPrice_txt8;

    @FXML
    private Button addToCartTrousers_btn8;

    @FXML
    private AnchorPane trousersGridAnchor9;

    @FXML
    private ImageView trousersImgView9_img;

    @FXML
    private Label trousersDesc_lbl9;

    @FXML
    private Text trousersDesc_text9;

    @FXML
    private Label trousersPrice_lbl9;

    @FXML
    private Text trousersPrice_txt9;

    @FXML
    private Button addToCartTrousers_btn9;

    @FXML
    private Label TrousersGeneralLable_lbl;

    @FXML
    private Button showAllTrousers_btn;

    @FXML
    private Tab tabShorts_tab;

    @FXML
    private AnchorPane ShortsPane_anchor;

    @FXML
    private GridPane shortsGrid_grid;

    @FXML
    private AnchorPane shortsGridAnchor1;

    @FXML
    private ImageView shortsImgView1_img;

    @FXML
    private Label shortsDesc_lbl1;

    @FXML
    private Text shortsDesc_txt1;

    @FXML
    private Label shortsPrice_lbl1;

    @FXML
    private Text shortsPrice_txt1;

    @FXML
    private Button addToCartShorts_btn1;

    @FXML
    private AnchorPane shortsGridAnchor2;

    @FXML
    private ImageView shortsImgView2_img;

    @FXML
    private Label shortsDesc_lbl2;

    @FXML
    private Text shortsDesc_text2;

    @FXML
    private Label shortsPrice_lbl2;

    @FXML
    private Text shortsPrice_txt2;

    @FXML
    private Button addToCartShorts_btn2;

    @FXML
    private AnchorPane shortsGridAnchor3;

    @FXML
    private ImageView shortsImgView3_img;

    @FXML
    private Label shortsDesc_lbl3;

    @FXML
    private Text shortsDesc_text3;

    @FXML
    private Label shortsPrice_lbl3;

    @FXML
    private Text shortsPrice_txt3;

    @FXML
    private Button addToCartShorts_btn3;

    @FXML
    private AnchorPane shortsGridAnchor4;

    @FXML
    private ImageView shortsImgView4_img;

    @FXML
    private Label shortsDesc_lbl4;

    @FXML
    private Text shortsDesc_text4;

    @FXML
    private Label shortsPrice_lbl4;

    @FXML
    private Text shortsPrice_txt4;

    @FXML
    private Button addToCartShorts_btn4;

    @FXML
    private AnchorPane shortsGridAnchor5;

    @FXML
    private ImageView shortsImgView5_img;

    @FXML
    private Label shortsDesc_lbl5;

    @FXML
    private Text shortsDesc_text5;

    @FXML
    private Label shortsPrice_lbl5;

    @FXML
    private Text shortsPrice_txt5;

    @FXML
    private Button addToCartShorts_btn5;

    @FXML
    private AnchorPane shortsGridAnchor6;

    @FXML
    private ImageView shortsImgView6_img;

    @FXML
    private Label shortsDesc_lbl6;

    @FXML
    private Text shortsDesc_text6;

    @FXML
    private Label shortsPrice_lbl6;

    @FXML
    private Text shortsPrice_txt6;

    @FXML
    private Button addToCartShorts_btn6;

    @FXML
    private AnchorPane shortsGridAnchor7;

    @FXML
    private ImageView shortsImgView7_img;

    @FXML
    private Label shortsDesc_lbl7;

    @FXML
    private Text shortsDesc_text7;

    @FXML
    private Label shortsPrice_lbl7;

    @FXML
    private Text shortsPrice_txt7;

    @FXML
    private Button addToCartShorts_btn7;

    @FXML
    private AnchorPane shortsGridAnchor8;

    @FXML
    private ImageView shortsImgView8_img;

    @FXML
    private Label shortsDesc_lbl8;

    @FXML
    private Text shortsDesc_text8;

    @FXML
    private Label shortsPrice_lbl8;

    @FXML
    private Text shortsPrice_txt8;

    @FXML
    private Button addToCartShorts_btn8;

    @FXML
    private AnchorPane shortsGridAnchor9;

    @FXML
    private ImageView shortsImgView9_img;

    @FXML
    private Label shortsDesc_lbl9;

    @FXML
    private Text shortsDesc_text9;

    @FXML
    private Label shortsPrice_lbl9;

    @FXML
    private Text shortsPrice_txt9;

    @FXML
    private Button addToCartShorts_btn9;

    @FXML
    private Label shortsGeneralLable_lbl;

    @FXML
    private Button showAllShorts_btn;

    @FXML
    private Tab tabJeans_tab;

    @FXML
    private AnchorPane JeansPane_anchor;

    @FXML
    private GridPane jeansGrid_grid;

    @FXML
    private AnchorPane jeansGridAnchor1;

    @FXML
    private ImageView jeansImgView1_img;

    @FXML
    private Label jeansDesc_lbl1;

    @FXML
    private Text jeansDesc_txt1;

    @FXML
    private Label jeansPrice_lbl1;

    @FXML
    private Text jeansPrice_txt1;

    @FXML
    private Button addToCartJeans_btn1;

    @FXML
    private AnchorPane jeansGridAnchor2;

    @FXML
    private ImageView jeansImgView2_img;

    @FXML
    private Label jeansDesc_lbl2;

    @FXML
    private Text jeansDesc_text2;

    @FXML
    private Label jeansPrice_lbl2;

    @FXML
    private Text jeansPrice_txt2;

    @FXML
    private Button addToCartJeans_btn2;

    @FXML
    private AnchorPane jeansGridAnchor3;

    @FXML
    private ImageView jeansImgView3_img;

    @FXML
    private Label jeansDesc_lbl3;

    @FXML
    private Text jeansDesc_text3;

    @FXML
    private Label jeansPrice_lbl3;

    @FXML
    private Text jeansPrice_txt3;

    @FXML
    private Button addToCartJeans_btn3;

    @FXML
    private AnchorPane jeansGridAnchor4;

    @FXML
    private ImageView jeansImgView4_img;

    @FXML
    private Label jeansDesc_lbl4;

    @FXML
    private Text jeansDesc_text4;

    @FXML
    private Label jeansPrice_lbl4;

    @FXML
    private Text jeansPrice_txt4;

    @FXML
    private Button addToCartJeans_btn4;

    @FXML
    private AnchorPane jeansGridAnchor5;

    @FXML
    private ImageView jeansImgView5_img;

    @FXML
    private Label jeansDesc_lbl5;

    @FXML
    private Text jeansDesc_text5;

    @FXML
    private Label jeansPrice_lbl5;

    @FXML
    private Text jeansPrice_txt5;

    @FXML
    private Button addToCartJeans_btn5;

    @FXML
    private AnchorPane jeansGridAnchor6;

    @FXML
    private ImageView jeansImgView6_img;

    @FXML
    private Label jeansDesc_lbl6;

    @FXML
    private Text jeansDesc_text6;

    @FXML
    private Label jeansPrice_lbl6;

    @FXML
    private Text jeansPrice_txt6;

    @FXML
    private Button addToCartJeans_btn6;

    @FXML
    private AnchorPane jeansGridAnchor7;

    @FXML
    private ImageView jeansImgView7_img;

    @FXML
    private Label jeansDesc_lbl7;

    @FXML
    private Text jeansDesc_text7;

    @FXML
    private Label jeansPrice_lbl7;

    @FXML
    private Text jeansPrice_txt7;

    @FXML
    private Button addToCartJeans_btn7;

    @FXML
    private AnchorPane jeansGridAnchor8;

    @FXML
    private ImageView jeansImgView8_img;

    @FXML
    private Label jeansDesc_lbl8;

    @FXML
    private Text jeansDesc_text8;

    @FXML
    private Label jeansPrice_lbl8;

    @FXML
    private Text jeansPrice_txt8;

    @FXML
    private Button addToCartJeans_btn8;

    @FXML
    private AnchorPane jeansGridAnchor9;

    @FXML
    private ImageView jeansImgView9_img;

    @FXML
    private Label jeansDesc_lbl9;

    @FXML
    private Text jeansDesc_text9;

    @FXML
    private Label jeansPrice_lbl9;

    @FXML
    private Text jeansPrice_txt9;

    @FXML
    private Button addToCartJeans_btn9;

    @FXML
    private Label jeansGeneralLable_lbl;

    @FXML
    private Button showAllJeans_btn;

    @FXML
    private Tab tabUnderweare_tab;

    @FXML
    private AnchorPane UnderwearePane_anchor;

    @FXML
    private GridPane underweareGrid_grid;

    @FXML
    private AnchorPane underweareGridAnchor1;

    @FXML
    private ImageView underweareImgView1_img;

    @FXML
    private Label underweareDesc_lbl1;

    @FXML
    private Text underweareDesc_txt1;

    @FXML
    private Label underwearePrice_lbl1;

    @FXML
    private Text underwearePrice_txt1;

    @FXML
    private Button addToCartUnderweare_btn1;

    @FXML
    private AnchorPane underweareGridAnchor2;

    @FXML
    private ImageView underweareImgView2_img;

    @FXML
    private Label underweareDesc_lbl2;

    @FXML
    private Text underweareDesc_text2;

    @FXML
    private Label underwearePrice_lbl2;

    @FXML
    private Text underwearePrice_txt2;

    @FXML
    private Button addToCartUnderweare_btn2;

    @FXML
    private AnchorPane underweareGridAnchor3;

    @FXML
    private ImageView underweareImgView3_img;

    @FXML
    private Label underweareDesc_lbl3;

    @FXML
    private Text underweareDesc_text3;

    @FXML
    private Label underwearePrice_lbl3;

    @FXML
    private Text underwearePrice_txt3;

    @FXML
    private Button addToCartUnderweare_btn3;

    @FXML
    private AnchorPane underweareGridAnchor4;

    @FXML
    private ImageView underweareImgView4_img;

    @FXML
    private Label underweareDesc_lbl4;

    @FXML
    private Text underweareDesc_text4;

    @FXML
    private Label underwearePrice_lbl4;

    @FXML
    private Text underwearePrice_txt4;

    @FXML
    private Button addToCartUnderweare_btn4;

    @FXML
    private AnchorPane underweareGridAnchor5;

    @FXML
    private ImageView underweareImgView5_img;

    @FXML
    private Label underweareDesc_lbl5;

    @FXML
    private Text underweareDesc_text5;

    @FXML
    private Label underwearePrice_lbl5;

    @FXML
    private Text underwearePrice_txt5;

    @FXML
    private Button addToCartUnderweare_btn5;

    @FXML
    private AnchorPane underweareGridAnchor6;

    @FXML
    private ImageView underweareImgView6_img;

    @FXML
    private Label underweareDesc_lbl6;

    @FXML
    private Text underweareDesc_text6;

    @FXML
    private Label underwearePrice_lbl6;

    @FXML
    private Text underwearePrice_txt6;

    @FXML
    private Button addToCartUnderweare_btn6;

    @FXML
    private AnchorPane underweareGridAnchor7;

    @FXML
    private ImageView underweareImgView7_img;

    @FXML
    private Label underweareDesc_lbl7;

    @FXML
    private Text underweareDesc_text7;

    @FXML
    private Label underwearePrice_lbl7;

    @FXML
    private Text underwearePrice_txt7;

    @FXML
    private Button addToCartUnderweare_btn7;

    @FXML
    private AnchorPane underweareGridAnchor8;

    @FXML
    private ImageView underweareImgView8_img;

    @FXML
    private Label underweareDesc_lbl8;

    @FXML
    private Text underweareDesc_text8;

    @FXML
    private Label underwearePrice_lbl8;

    @FXML
    private Text underwearePrice_txt8;

    @FXML
    private Button addToCartUnderweare_btn8;

    @FXML
    private AnchorPane underweareGridAnchor9;

    @FXML
    private ImageView underweareImgView9_img;

    @FXML
    private Label underweareDesc_lbl9;

    @FXML
    private Text underweareDesc_text9;

    @FXML
    private Label underwearePrice_lbl9;

    @FXML
    private Text underwearePrice_txt9;

    @FXML
    private Button addToCartUnderweare_btn9;

    @FXML
    private Label underweareGeneralLable_lbl;

    @FXML
    private Button showAllUnderweare_btn;

    @FXML
    private Tab tabLoungwear_tab;

    @FXML
    private AnchorPane LoungwearPane_anchor;

    @FXML
    private GridPane loungwearGrid_grid;

    @FXML
    private AnchorPane loungwearGridAnchor1;

    @FXML
    private ImageView loungwearImgView1_img;

    @FXML
    private Label loungwearDesc_lbl1;

    @FXML
    private Text loungwearDesc_txt1;

    @FXML
    private Label loungwearPrice_lbl1;

    @FXML
    private Text loungwearPrice_txt1;

    @FXML
    private Button addToCartLoungwear_btn1;

    @FXML
    private AnchorPane loungwearGridAnchor2;

    @FXML
    private ImageView loungwearImgView2_img;

    @FXML
    private Label loungwearDesc_lbl2;

    @FXML
    private Text loungwearDesc_text2;

    @FXML
    private Label loungwearPrice_lbl2;

    @FXML
    private Text loungwearPrice_txt2;

    @FXML
    private Button addToCartLoungwear_btn2;

    @FXML
    private AnchorPane loungwearGridAnchor3;

    @FXML
    private ImageView loungwearImgView3_img;

    @FXML
    private Label loungwearDesc_lbl3;

    @FXML
    private Text loungwearDesc_text3;

    @FXML
    private Label loungwearPrice_lbl3;

    @FXML
    private Text loungwearPrice_txt3;

    @FXML
    private Button addToCartLoungwear_btn3;

    @FXML
    private AnchorPane loungwearGridAnchor4;

    @FXML
    private ImageView loungwearImgView4_img;

    @FXML
    private Label loungwearDesc_lbl4;

    @FXML
    private Text loungwearDesc_text4;

    @FXML
    private Label loungwearPrice_lbl4;

    @FXML
    private Text loungwearPrice_txt4;

    @FXML
    private Button addToCartLoungwear_btn4;

    @FXML
    private AnchorPane loungwearGridAnchor5;

    @FXML
    private ImageView loungwearImgView5_img;

    @FXML
    private Label loungwearDesc_lbl5;

    @FXML
    private Text loungwearDesc_text5;

    @FXML
    private Label loungwearPrice_lbl5;

    @FXML
    private Text loungwearPrice_txt5;

    @FXML
    private Button addToCartLoungwear_btn5;

    @FXML
    private AnchorPane loungwearGridAnchor6;

    @FXML
    private ImageView loungwearImgView6_img;

    @FXML
    private Label loungwearDesc_lbl6;

    @FXML
    private Text loungwearDesc_text6;

    @FXML
    private Label loungwearPrice_lbl6;

    @FXML
    private Text loungwearPrice_txt6;

    @FXML
    private Button addToCartLoungwear_btn6;

    @FXML
    private AnchorPane loungwearGridAnchor7;

    @FXML
    private ImageView loungwearImgView7_img;

    @FXML
    private Label loungwearDesc_lbl7;

    @FXML
    private Text loungwearDesc_text7;

    @FXML
    private Label loungwearPrice_lbl7;

    @FXML
    private Text loungwearPrice_txt7;

    @FXML
    private Button addToCartLoungwear_btn7;

    @FXML
    private AnchorPane loungwearGridAnchor8;

    @FXML
    private ImageView loungwearImgView8_img;

    @FXML
    private Label loungwearDesc_lbl8;

    @FXML
    private Text loungwearDesc_text8;

    @FXML
    private Label loungwearPrice_lbl8;

    @FXML
    private Text loungwearPrice_txt8;

    @FXML
    private Button addToCartLoungwear_btn8;

    @FXML
    private AnchorPane loungwearGridAnchor9;

    @FXML
    private ImageView loungwearImgView9_img;

    @FXML
    private Label loungwearDesc_lbl9;

    @FXML
    private Text loungwearDesc_text9;

    @FXML
    private Label loungwearPrice_lbl9;

    @FXML
    private Text loungwearPrice_txt9;

    @FXML
    private Button addToCartLoungwear_btn9;

    @FXML
    private Label loungwearGeneralLable_lbl;

    @FXML
    private Button showAllLoungwear_btn;

    @FXML
    private Tab tabSocks_tab;

    @FXML
    private AnchorPane SocksPane_anchor;

    @FXML
    private GridPane socksGrid_grid;

    @FXML
    private AnchorPane socksGridAnchor1;

    @FXML
    private ImageView socksImgView1_img;

    @FXML
    private Label socksDesc_lbl1;

    @FXML
    private Text socksDesc_txt1;

    @FXML
    private Label socksPrice_lbl1;

    @FXML
    private Text socksPrice_txt1;

    @FXML
    private Button addToCartSocks_btn1;

    @FXML
    private AnchorPane socksGridAnchor2;

    @FXML
    private ImageView socksImgView2_img;

    @FXML
    private Label socksDesc_lbl2;

    @FXML
    private Text socksDesc_text2;

    @FXML
    private Label socksPrice_lbl2;

    @FXML
    private Text socksPrice_txt2;

    @FXML
    private Button addToCartSocks_btn2;

    @FXML
    private AnchorPane socksGridAnchor3;

    @FXML
    private ImageView socksImgView3_img;

    @FXML
    private Label socksDesc_lbl3;

    @FXML
    private Text socksDesc_text3;

    @FXML
    private Label socksPrice_lbl3;

    @FXML
    private Text socksPrice_txt3;

    @FXML
    private Button addToCartSocks_btn3;

    @FXML
    private AnchorPane socksGridAnchor4;

    @FXML
    private ImageView socksImgView4_img;

    @FXML
    private Label socksDesc_lbl4;

    @FXML
    private Text socksDesc_text4;

    @FXML
    private Label socksPrice_lbl4;

    @FXML
    private Text socksPrice_txt4;

    @FXML
    private Button addToCartSocks_btn4;

    @FXML
    private AnchorPane socksGridAnchor5;

    @FXML
    private ImageView socksImgView5_img;

    @FXML
    private Label socksDesc_lbl5;

    @FXML
    private Text socksDesc_text5;

    @FXML
    private Label socksPrice_lbl5;

    @FXML
    private Text socksPrice_txt5;

    @FXML
    private Button addToCartSocks_btn5;

    @FXML
    private AnchorPane socksGridAnchor6;

    @FXML
    private ImageView socksImgView6_img;

    @FXML
    private Label socksDesc_lbl6;

    @FXML
    private Text socksDesc_text6;

    @FXML
    private Label socksPrice_lbl6;

    @FXML
    private Text socksPrice_txt6;

    @FXML
    private Button addToCartSocks_btn6;

    @FXML
    private AnchorPane socksGridAnchor7;

    @FXML
    private ImageView socksImgView7_img;

    @FXML
    private Label socksDesc_lbl7;

    @FXML
    private Text socksDesc_text7;

    @FXML
    private Label socksPrice_lbl7;

    @FXML
    private Text socksPrice_txt7;

    @FXML
    private Button addToCartSocks_btn7;

    @FXML
    private AnchorPane socksGridAnchor8;

    @FXML
    private ImageView socksImgView8_img;

    @FXML
    private Label socksDesc_lbl8;

    @FXML
    private Text socksDesc_text8;

    @FXML
    private Label socksPrice_lbl8;

    @FXML
    private Text socksPrice_txt8;

    @FXML
    private Button addToCartSocks_btn8;

    @FXML
    private AnchorPane socksGridAnchor9;

    @FXML
    private ImageView socksImgView9_img;

    @FXML
    private Label socksDesc_lbl9;

    @FXML
    private Text socksDesc_text9;

    @FXML
    private Label socksPrice_lbl9;

    @FXML
    private Text socksPrice_txt9;

    @FXML
    private Button addToCartSocks_btn9;

    @FXML
    private Label socksGeneralLable_lbl;

    @FXML
    private Button showAllSocks_btn;

    @FXML
    void addToCartHoodies_btn1(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartHoodies_btn2(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn3(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn4(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn5(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn6(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn7(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn8(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartHoodies_btn9(ActionEvent event) {
    	hoodiesGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn1(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartJackets_btn2(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn3(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn4(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }
    
    @FXML
    void addToCartJackets_btn5(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn6(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn8(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJackets_btn9(ActionEvent event) {
    	JacketsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn1(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartJeans_btn2(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn3(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn4(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }
    
    @FXML
    void addToCartJeans_btn5(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn6(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn7(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn8(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartJeans_btn9(ActionEvent event) {
    	jeansGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn1(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartLoungwear_btn2(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn3(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn4(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn5(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn6(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn7(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn8(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartLoungwear_btn9(ActionEvent event) {
    	loungwearGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn1(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartShirts_btn2(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartShirts_btn3(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn5(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn6(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn7(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn8(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShirts_btn9(ActionEvent event) {
    	shirtsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartShorts_btn1(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn2(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn3(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn4(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn5(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn6(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn7(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn8(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartShorts_btn9(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn1(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartSocks_btn2(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn3(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn4(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn5(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn6(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn7(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn8(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartSocks_btn9(ActionEvent event) {
    	socksGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn1(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn2(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn3(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn4(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }
    
    @FXML
    void addToCartTrousers_btn5(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn6(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn7(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn8(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTrousers_btn9(ActionEvent event) {
    	TrousersGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn1(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartTshirt_btn2(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn3(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn4(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn5(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn6(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn7(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn8(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartTshirt_btn9(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn1(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void addToCartUnderweare_btn2(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn3(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn4(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn5(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn6(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn7(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn8(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCartUnderweare_btn9(ActionEvent event) {
    	underweareGeneralLable_lbl.setText("First Sign-in or Sign-up");

    }

    @FXML
    void addToCart_btn4(ActionEvent event) {
    	shortsGeneralLable_lbl.setText("First Sign-in or Sign-up");
    }

    @FXML
    void showAllHoodies(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllHoodies_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllJackets(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllJackets_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllJeans(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllJeans_btn.getScene().getWindow();
   		old.close();    }

    @FXML
    void showAllLoungwear(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllLoungwear_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllShirts(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllShirts_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllShorts(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllShorts_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllSocks(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllSocks_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllTShirts(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllTShirts_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllTrousers(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllTrousers_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void showAllUnderweare(ActionEvent event) throws IOException {
       	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/AllClothes.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("All-Clothes");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)showAllUnderweare_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void signIn(ActionEvent event) throws IOException {
    	//signInn();
      	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Login2.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Login");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)menuSignIn_btn.getScene().getWindow();
   		old.close();
    }

    @FXML
    void signUp(ActionEvent event) throws IOException {
    	signUp();
    }
    
   /* public void signInn() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/Login.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Login");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();

    	Stage old = (Stage)menuSignIn_btn.getScene().getWindow();
   		old.close();
   		}*/
    
    public void signUp() throws IOException {
    	Stage stage = new Stage();
       	Parent root = FXMLLoader.load(getClass().getResource("/ui/SignUp.fxml"));
    	Scene scene = new Scene(root);
  		stage.setTitle("Sign-Up");
   		stage.setScene(scene);
   		stage.setResizable(false);
  		stage.show();
   		
  		Stage old = (Stage)menuSignUp_btn.getScene().getWindow();
   		old.close();
   		}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		//Shirts
		shirtsDesc_lbl1.setText(store.getShirt().get(1).get_desc());
		shirtsDesc_lbl2.setText(store.getShirt().get(2).get_desc());
		shirtsDesc_lbl3.setText(store.getShirt().get(3).get_desc());
		shirtsDesc_lbl4.setText(store.getShirt().get(4).get_desc());
		shirtsDesc_lbl5.setText(store.getShirt().get(5).get_desc());
		shirtsDesc_lbl6.setText(store.getShirt().get(6).get_desc());
		shirtsDesc_lbl7.setText(store.getShirt().get(7).get_desc());
		shirtsDesc_lbl8.setText(store.getShirt().get(8).get_desc());
		shirtsDesc_lbl9.setText(store.getShirt().get(9).get_desc());
		shirtsPrice_lbl1.setText(Double.toString(store.getShirt().get(1).get_itemPrice()));
		shirtsPrice_lbl2.setText(Double.toString(store.getShirt().get(2).get_itemPrice()));
		shirtsPrice_lbl3.setText(Double.toString(store.getShirt().get(3).get_itemPrice()));
		shirtsPrice_lbl4.setText(Double.toString(store.getShirt().get(4).get_itemPrice()));
		shirtsPrice_lbl5.setText(Double.toString(store.getShirt().get(5).get_itemPrice()));
		shirtsPrice_lbl6.setText(Double.toString(store.getShirt().get(6).get_itemPrice()));
		shirtsPrice_lbl7.setText(Double.toString(store.getShirt().get(7).get_itemPrice()));
		shirtsPrice_lbl8.setText(Double.toString(store.getShirt().get(8).get_itemPrice()));
		shirtsPrice_lbl9.setText(Double.toString(store.getShirt().get(9).get_itemPrice()));
		
		//Tshirts
		TshirtsDesc_lbl1.setText(store.getTShirt().get(1).get_desc());
		TshirtsDesc_lbl2.setText(store.getTShirt().get(2).get_desc());
		TshirtsDesc_lbl3.setText(store.getTShirt().get(3).get_desc());
		TshirtsDesc_lbl4.setText(store.getTShirt().get(4).get_desc());
		TshirtsDesc_lbl5.setText(store.getTShirt().get(5).get_desc());
		TshirtsDesc_lbl6.setText(store.getTShirt().get(6).get_desc());
		TshirtsDesc_lbl7.setText(store.getTShirt().get(7).get_desc());
		TshirtsDesc_lbl8.setText(store.getTShirt().get(8).get_desc());
		TshirtsDesc_lbl9.setText(store.getTShirt().get(9).get_desc());
		TshirtsPrice_lbl1.setText(Double.toString(store.getTShirt().get(1).get_itemPrice()));
		TshirtsPrice_lbl2.setText(Double.toString(store.getTShirt().get(2).get_itemPrice()));
		TshirtsPrice_lbl3.setText(Double.toString(store.getTShirt().get(3).get_itemPrice()));
		TshirtsPrice_lbl4.setText(Double.toString(store.getTShirt().get(4).get_itemPrice()));
		TshirtsPrice_lbl5.setText(Double.toString(store.getTShirt().get(5).get_itemPrice()));
		TshirtsPrice_lbl6.setText(Double.toString(store.getTShirt().get(6).get_itemPrice()));
		TshirtsPrice_lbl7.setText(Double.toString(store.getTShirt().get(7).get_itemPrice()));
		TshirtsPrice_lbl8.setText(Double.toString(store.getTShirt().get(8).get_itemPrice()));
		TshirtsPrice_lbl9.setText(Double.toString(store.getTShirt().get(9).get_itemPrice()));
		
		//Hoodies
		hoodiesDesc_lbl1.setText(store.getHoodies().get(1).get_desc());
		hoodiesDesc_lbl2.setText(store.getHoodies().get(2).get_desc());
		hoodiesDesc_lbl3.setText(store.getHoodies().get(3).get_desc());
		hoodiesDesc_lbl4.setText(store.getHoodies().get(4).get_desc());
		hoodiesDesc_lbl5.setText(store.getHoodies().get(5).get_desc());
		hoodiesDesc_lbl6.setText(store.getHoodies().get(6).get_desc());
		hoodiesDesc_lbl7.setText(store.getHoodies().get(7).get_desc());
		hoodiesDesc_lbl8.setText(store.getHoodies().get(8).get_desc());
		hoodiesDesc_lbl9.setText(store.getHoodies().get(9).get_desc());
		hoodiesPrice_lbl1.setText(Double.toString(store.getHoodies().get(1).get_itemPrice()));
		hoodiesPrice_lbl2.setText(Double.toString(store.getHoodies().get(2).get_itemPrice()));
		hoodiesPrice_lbl3.setText(Double.toString(store.getHoodies().get(3).get_itemPrice()));
		hoodiesPrice_lbl4.setText(Double.toString(store.getHoodies().get(4).get_itemPrice()));
		hoodiesPrice_lbl5.setText(Double.toString(store.getHoodies().get(5).get_itemPrice()));
		hoodiesPrice_lbl6.setText(Double.toString(store.getHoodies().get(6).get_itemPrice()));
		hoodiesPrice_lbl7.setText(Double.toString(store.getHoodies().get(7).get_itemPrice()));
		hoodiesPrice_lbl8.setText(Double.toString(store.getHoodies().get(8).get_itemPrice()));
		hoodiesPrice_lbl9.setText(Double.toString(store.getHoodies().get(9).get_itemPrice()));

		//Jackets
		jacketsDesc_lbl1.setText(store.getJackets().get(1).get_desc());
		jacketsDesc_lbl2.setText(store.getJackets().get(2).get_desc());
		jacketsDesc_lbl3.setText(store.getJackets().get(3).get_desc());
		jacketsDesc_lbl4.setText(store.getJackets().get(4).get_desc());
		jacketsDesc_lbl5.setText(store.getJackets().get(5).get_desc());
		jacketsDesc_lbl6.setText(store.getJackets().get(6).get_desc());
		jacketsDesc_lbl7.setText(store.getJackets().get(7).get_desc());
		jacketsDesc_lbl8.setText(store.getJackets().get(8).get_desc());
		jacketsDesc_lbl9.setText(store.getJackets().get(9).get_desc());
		jacketsPrice_txt1.setText(Double.toString(store.getJackets().get(1).get_itemPrice()));
		jacketsPrice_txt2.setText(Double.toString(store.getJackets().get(2).get_itemPrice()));
		jacketsPrice_txt3.setText(Double.toString(store.getJackets().get(3).get_itemPrice()));
		jacketsPrice_txt4.setText(Double.toString(store.getJackets().get(4).get_itemPrice()));
		jacketsPrice_txt5.setText(Double.toString(store.getJackets().get(5).get_itemPrice()));
		jacketsPrice_txt6.setText(Double.toString(store.getJackets().get(6).get_itemPrice()));
		jacketsPrice_txt7.setText(Double.toString(store.getJackets().get(7).get_itemPrice()));
		jacketsPrice_txt8.setText(Double.toString(store.getJackets().get(8).get_itemPrice()));
		jacketsPrice_txt9.setText(Double.toString(store.getJackets().get(9).get_itemPrice()));

		//Trousers
		trousersDesc_lbl1.setText(store.getTrousers().get(1).get_desc());
		trousersDesc_lbl2.setText(store.getTrousers().get(2).get_desc());
		trousersDesc_lbl3.setText(store.getTrousers().get(3).get_desc());
		trousersDesc_lbl4.setText(store.getTrousers().get(4).get_desc());
		trousersDesc_lbl5.setText(store.getTrousers().get(5).get_desc());
		trousersDesc_lbl6.setText(store.getTrousers().get(6).get_desc());
		trousersDesc_lbl7.setText(store.getTrousers().get(7).get_desc());
		trousersDesc_lbl8.setText(store.getTrousers().get(8).get_desc());
		trousersDesc_lbl9.setText(store.getTrousers().get(9).get_desc());
		trousersPrice_lbl1.setText(Double.toString(store.getTrousers().get(1).get_itemPrice()));
		trousersPrice_lbl2.setText(Double.toString(store.getTrousers().get(2).get_itemPrice()));
		trousersPrice_lbl3.setText(Double.toString(store.getTrousers().get(3).get_itemPrice()));
		trousersPrice_lbl4.setText(Double.toString(store.getTrousers().get(4).get_itemPrice()));
		trousersPrice_lbl5.setText(Double.toString(store.getTrousers().get(5).get_itemPrice()));
		trousersPrice_lbl6.setText(Double.toString(store.getTrousers().get(6).get_itemPrice()));
		trousersPrice_lbl7.setText(Double.toString(store.getTrousers().get(7).get_itemPrice()));
		trousersPrice_lbl8.setText(Double.toString(store.getTrousers().get(8).get_itemPrice()));
		trousersPrice_lbl9.setText(Double.toString(store.getTrousers().get(9).get_itemPrice()));

		//Shorts
		shortsDesc_lbl1.setText(store.getShorts().get(1).get_desc());
		shortsDesc_lbl2.setText(store.getShorts().get(2).get_desc());
		shortsDesc_lbl3.setText(store.getShorts().get(3).get_desc());
		shortsDesc_lbl4.setText(store.getShorts().get(4).get_desc());
		shortsDesc_lbl5.setText(store.getShorts().get(5).get_desc());
		shortsDesc_lbl6.setText(store.getShorts().get(6).get_desc());
		shortsDesc_lbl7.setText(store.getShorts().get(7).get_desc());
		shortsDesc_lbl8.setText(store.getShorts().get(8).get_desc());
		shortsDesc_lbl9.setText(store.getShorts().get(9).get_desc());
		shortsPrice_lbl1.setText(Double.toString(store.getShorts().get(1).get_itemPrice()));
		shortsPrice_lbl2.setText(Double.toString(store.getShorts().get(2).get_itemPrice()));
		shortsPrice_lbl3.setText(Double.toString(store.getShorts().get(3).get_itemPrice()));
		shortsPrice_lbl4.setText(Double.toString(store.getShorts().get(4).get_itemPrice()));
		shortsPrice_lbl5.setText(Double.toString(store.getShorts().get(5).get_itemPrice()));
		shortsPrice_lbl6.setText(Double.toString(store.getShorts().get(6).get_itemPrice()));
		shortsPrice_lbl7.setText(Double.toString(store.getShorts().get(7).get_itemPrice()));
		shortsPrice_lbl8.setText(Double.toString(store.getShorts().get(8).get_itemPrice()));
		shortsPrice_lbl9.setText(Double.toString(store.getShorts().get(9).get_itemPrice()));

		//Jeans
		jeansDesc_lbl1.setText(store.getJeans().get(1).get_desc());
		jeansDesc_lbl2.setText(store.getJeans().get(2).get_desc());
		jeansDesc_lbl3.setText(store.getJeans().get(3).get_desc());
		jeansDesc_lbl4.setText(store.getJeans().get(4).get_desc());
		jeansDesc_lbl5.setText(store.getJeans().get(5).get_desc());
		jeansDesc_lbl6.setText(store.getJeans().get(6).get_desc());
		jeansDesc_lbl7.setText(store.getJeans().get(7).get_desc());
		jeansDesc_lbl8.setText(store.getJeans().get(8).get_desc());
		jeansDesc_lbl9.setText(store.getJeans().get(9).get_desc());
		jeansPrice_lbl1.setText(Double.toString(store.getJeans().get(1).get_itemPrice()));
		jeansPrice_lbl2.setText(Double.toString(store.getJeans().get(2).get_itemPrice()));
		jeansPrice_lbl3.setText(Double.toString(store.getJeans().get(3).get_itemPrice()));
		jeansPrice_lbl4.setText(Double.toString(store.getJeans().get(4).get_itemPrice()));
		jeansPrice_lbl5.setText(Double.toString(store.getJeans().get(5).get_itemPrice()));
		jeansPrice_lbl6.setText(Double.toString(store.getJeans().get(6).get_itemPrice()));
		jeansPrice_lbl7.setText(Double.toString(store.getJeans().get(7).get_itemPrice()));
		jeansPrice_lbl8.setText(Double.toString(store.getJeans().get(8).get_itemPrice()));
		jeansPrice_lbl9.setText(Double.toString(store.getJeans().get(9).get_itemPrice()));

		//Underwear
		underweareDesc_lbl1.setText(store.getUnderweare().get(1).get_desc());
		underweareDesc_lbl2.setText(store.getUnderweare().get(2).get_desc());
		underweareDesc_lbl3.setText(store.getUnderweare().get(3).get_desc());
		underweareDesc_lbl4.setText(store.getUnderweare().get(4).get_desc());
		underweareDesc_lbl5.setText(store.getUnderweare().get(5).get_desc());
		underweareDesc_lbl6.setText(store.getUnderweare().get(6).get_desc());
		underweareDesc_lbl7.setText(store.getUnderweare().get(7).get_desc());
		underweareDesc_lbl8.setText(store.getUnderweare().get(8).get_desc());
		underweareDesc_lbl9.setText(store.getUnderweare().get(9).get_desc());
		underwearePrice_lbl1.setText(Double.toString(store.getUnderweare().get(1).get_itemPrice()));
		underwearePrice_lbl2.setText(Double.toString(store.getUnderweare().get(2).get_itemPrice()));
		underwearePrice_lbl3.setText(Double.toString(store.getUnderweare().get(3).get_itemPrice()));
		underwearePrice_lbl4.setText(Double.toString(store.getUnderweare().get(4).get_itemPrice()));
		underwearePrice_lbl5.setText(Double.toString(store.getUnderweare().get(5).get_itemPrice()));
		underwearePrice_lbl6.setText(Double.toString(store.getUnderweare().get(6).get_itemPrice()));
		underwearePrice_lbl7.setText(Double.toString(store.getUnderweare().get(7).get_itemPrice()));
		underwearePrice_lbl8.setText(Double.toString(store.getUnderweare().get(8).get_itemPrice()));
		underwearePrice_lbl9.setText(Double.toString(store.getUnderweare().get(9).get_itemPrice()));

		//Loungwear
		loungwearDesc_lbl1.setText(store.getLoungewear().get(1).get_desc());
		loungwearDesc_lbl2.setText(store.getLoungewear().get(2).get_desc());
		loungwearDesc_lbl3.setText(store.getLoungewear().get(3).get_desc());
		loungwearDesc_lbl4.setText(store.getLoungewear().get(4).get_desc());
		loungwearDesc_lbl5.setText(store.getLoungewear().get(5).get_desc());
		loungwearDesc_lbl6.setText(store.getLoungewear().get(6).get_desc());
		loungwearDesc_lbl7.setText(store.getLoungewear().get(7).get_desc());
		loungwearDesc_lbl8.setText(store.getLoungewear().get(8).get_desc());
		loungwearDesc_lbl9.setText(store.getLoungewear().get(9).get_desc());
		loungwearPrice_lbl1.setText(Double.toString(store.getLoungewear().get(1).get_itemPrice()));
		loungwearPrice_lbl2.setText(Double.toString(store.getLoungewear().get(2).get_itemPrice()));
		loungwearPrice_lbl3.setText(Double.toString(store.getLoungewear().get(3).get_itemPrice()));
		loungwearPrice_lbl4.setText(Double.toString(store.getLoungewear().get(4).get_itemPrice()));
		loungwearPrice_lbl5.setText(Double.toString(store.getLoungewear().get(5).get_itemPrice()));
		loungwearPrice_lbl6.setText(Double.toString(store.getLoungewear().get(6).get_itemPrice()));
		loungwearPrice_lbl7.setText(Double.toString(store.getLoungewear().get(7).get_itemPrice()));
		loungwearPrice_lbl8.setText(Double.toString(store.getLoungewear().get(8).get_itemPrice()));
		loungwearPrice_lbl9.setText(Double.toString(store.getLoungewear().get(9).get_itemPrice()));

		//Socks
		socksDesc_lbl1.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl2.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl3.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl4.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl5.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl6.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl7.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl8.setText(store.getSocks().get(1).get_desc());
		socksDesc_lbl9.setText(store.getSocks().get(1).get_desc());
		socksPrice_lbl1.setText(Double.toString(store.getSocks().get(1).get_itemPrice()));
		socksPrice_lbl2.setText(Double.toString(store.getSocks().get(2).get_itemPrice()));
		socksPrice_lbl3.setText(Double.toString(store.getSocks().get(3).get_itemPrice()));
		socksPrice_lbl4.setText(Double.toString(store.getSocks().get(4).get_itemPrice()));
		socksPrice_lbl5.setText(Double.toString(store.getSocks().get(5).get_itemPrice()));
		socksPrice_lbl6.setText(Double.toString(store.getSocks().get(6).get_itemPrice()));
		socksPrice_lbl7.setText(Double.toString(store.getSocks().get(7).get_itemPrice()));
		socksPrice_lbl8.setText(Double.toString(store.getSocks().get(8).get_itemPrice()));
		socksPrice_lbl9.setText(Double.toString(store.getSocks().get(9).get_itemPrice()));

		
	}
    

}

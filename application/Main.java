package application;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import code.Client;
import code.Cloths;
import code.Colors;
import code.Invoice;
import code.Item;
import code.Manager;
import code.Sizes;
import code.Store;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	static Store store = Store.getInstance();

	
	@Override
	public void start(Stage primaryStage) throws IOException {
		//קריאה למתודת יצירת הקבצים 
		//להשאיר ככה כי קוראים מקובץ ser 
		//setSomeData(); 

		Parent root = FXMLLoader.load(getClass().getResource("/ui/Shop.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Store - Shop");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		store.load();
		launch(args);

	}
	
	@Override
	public void stop() {
		store.save();
	}
	
	//לא להתיחס הטעינה מתבצעת מהקובץ עצמו
	public static void setSomeData() {
		// Add Manager
		store.addManager(new Manager("Arik", 1995,"0544959211"));
		
		// Add Clients
		store.addClient(new Client("Tal", 1994,"0544959211", null)); // ID : 1
		store.addClient(new Client("Moshe", 1994,"0544959211", null)); // ID : 2
		store.addClient(new Client("Lior", 1995,"0544959211", null)); // ID : 3
		
		// Add Clothes
		store.addItem(new Item(Cloths.Shirt, Sizes.L, Colors.Black,"Black shirt ,L", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.XL, Colors.Blue,"Blue shirt, XL", 150));
		store.addItem(new Item(Cloths.Shirt, Sizes.L, Colors.Brown,"Brown shirt, L", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.S, Colors.Grey,"Grey shirt, S", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.L, Colors.Orange,"Orange shirt, L", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.M, Colors.Pink,"Pink shirt, M", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.L, Colors.Red,"Red shirt, L", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.XXL, Colors.White,"White shirt, XXL", 120));
		store.addItem(new Item(Cloths.Shirt, Sizes.L, Colors.Yellow,"Yellow shirt, L", 120));

		store.addItem(new Item(Cloths.TShirt, Sizes.L, Colors.Black,"Black Tshirt ,L", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.XL, Colors.Blue,"Blue Tshirt, XL", 150));
		store.addItem(new Item(Cloths.TShirt, Sizes.L, Colors.Brown,"Brown Tshirt, L", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.S, Colors.Grey,"Grey Tshirt, S", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.L, Colors.Orange,"Orange Tshirt, L", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.M, Colors.Pink,"Pink Tshirt, M", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.L, Colors.Red,"Red Tshirt, L", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.XXL, Colors.White,"White Tshirt, XXL", 120));
		store.addItem(new Item(Cloths.TShirt, Sizes.L, Colors.Yellow,"Yellow Tshirt, L", 120));

		store.addItem(new Item(Cloths.Hoodie, Sizes.L, Colors.Black,"Black Hoodie ,L", 200));
		store.addItem(new Item(Cloths.Hoodie, Sizes.XL, Colors.Blue,"Blue Hoodie, XL", 220));
		store.addItem(new Item(Cloths.Hoodie, Sizes.L, Colors.Brown,"Brown Hoodie, L", 220));
		store.addItem(new Item(Cloths.Hoodie, Sizes.S, Colors.Grey,"Grey Hoodie, S", 250));
		store.addItem(new Item(Cloths.Hoodie, Sizes.L, Colors.Orange,"Orange Hoodie, L", 250));
		store.addItem(new Item(Cloths.Hoodie, Sizes.M, Colors.Pink,"Pink Hoodie, M", 220));
		store.addItem(new Item(Cloths.Hoodie, Sizes.L, Colors.Red,"Red Hoodie, L", 200));
		store.addItem(new Item(Cloths.Hoodie, Sizes.XXL, Colors.White,"White Hoodie, XXL", 240));
		store.addItem(new Item(Cloths.Hoodie, Sizes.L, Colors.Yellow,"Yellow Hoodie, L", 250));
		
		store.addItem(new Item(Cloths.Jacket, Sizes.L, Colors.Black,"Black Jacket ,L", 200));
		store.addItem(new Item(Cloths.Jacket, Sizes.XL, Colors.Blue,"Blue Jacket, XL", 220));
		store.addItem(new Item(Cloths.Jacket, Sizes.L, Colors.Brown,"Brown Jacket, L", 220));
		store.addItem(new Item(Cloths.Jacket, Sizes.S, Colors.Grey,"Grey Jacket, S", 250));
		store.addItem(new Item(Cloths.Jacket, Sizes.L, Colors.Orange,"Orange Jacket, L", 250));
		store.addItem(new Item(Cloths.Jacket, Sizes.M, Colors.Pink,"Pink Jacket, M", 220));
		store.addItem(new Item(Cloths.Jacket, Sizes.L, Colors.Red,"Red Jacket, L", 200));
		store.addItem(new Item(Cloths.Jacket, Sizes.XXL, Colors.White,"White Jacket, XXL", 240));
		store.addItem(new Item(Cloths.Jacket, Sizes.L, Colors.Yellow,"Yellow Jacket, L", 250));
		
		store.addItem(new Item(Cloths.Jeans, Sizes.L, Colors.Black,"Black Jeans ,L", 200));
		store.addItem(new Item(Cloths.Jeans, Sizes.XL, Colors.Blue,"Blue Jeans, XL", 220));
		store.addItem(new Item(Cloths.Jeans, Sizes.L, Colors.Brown,"Brown Jeans, L", 220));
		store.addItem(new Item(Cloths.Jeans, Sizes.S, Colors.Grey,"Grey Jeans, S", 250));
		store.addItem(new Item(Cloths.Jeans, Sizes.L, Colors.Orange,"Orange Jeans, L", 250));
		store.addItem(new Item(Cloths.Jeans, Sizes.M, Colors.Pink,"Pink Jeans, M", 220));
		store.addItem(new Item(Cloths.Jeans, Sizes.L, Colors.Red,"Red Jeans, L", 200));
		store.addItem(new Item(Cloths.Jeans, Sizes.S, Colors.White,"White Jeans, S", 240));
		store.addItem(new Item(Cloths.Jeans, Sizes.L, Colors.Yellow,"Yellow Jeans, L", 250));
		
		store.addItem(new Item(Cloths.Trouser, Sizes.L, Colors.Black,"Black Trouser ,L", 200));
		store.addItem(new Item(Cloths.Trouser, Sizes.XL, Colors.Blue,"Blue Trouser, XL", 220));
		store.addItem(new Item(Cloths.Trouser, Sizes.L, Colors.Brown,"Brown Trouser, L", 220));
		store.addItem(new Item(Cloths.Trouser, Sizes.S, Colors.Grey,"Grey Trouser, S", 250));
		store.addItem(new Item(Cloths.Trouser, Sizes.L, Colors.Orange,"Orange Trouser, L", 250));
		store.addItem(new Item(Cloths.Trouser, Sizes.M, Colors.Pink,"Pink Trouser, M", 220));
		store.addItem(new Item(Cloths.Trouser, Sizes.L, Colors.Red,"Red Trouser, L", 200));
		store.addItem(new Item(Cloths.Trouser, Sizes.S, Colors.White,"White Trouser, S", 240));
		store.addItem(new Item(Cloths.Trouser, Sizes.L, Colors.Yellow,"Yellow Trouser, L", 250));

		store.addItem(new Item(Cloths.Short, Sizes.L, Colors.Black,"Black Short ,L", 200));
		store.addItem(new Item(Cloths.Short, Sizes.XL, Colors.Blue,"Blue Short, XL", 220));
		store.addItem(new Item(Cloths.Short, Sizes.L, Colors.Brown,"Brown Short, L", 220));
		store.addItem(new Item(Cloths.Short, Sizes.S, Colors.Grey,"Grey Short, S", 250));
		store.addItem(new Item(Cloths.Short, Sizes.L, Colors.Orange,"Orange Short, L", 250));
		store.addItem(new Item(Cloths.Short, Sizes.M, Colors.Pink,"Pink Short, M", 220));
		store.addItem(new Item(Cloths.Short, Sizes.L, Colors.Red,"Red Short, L", 200));
		store.addItem(new Item(Cloths.Short, Sizes.S, Colors.White,"White Short, S", 240));
		store.addItem(new Item(Cloths.Short, Sizes.L, Colors.Yellow,"Yellow Short, L", 250));

		store.addItem(new Item(Cloths.Loungewear, Sizes.L, Colors.Black,"Black Loungewear ,L", 200));
		store.addItem(new Item(Cloths.Loungewear, Sizes.XL, Colors.Blue,"Blue Loungewear, XL", 220));
		store.addItem(new Item(Cloths.Loungewear, Sizes.L, Colors.Brown,"Brown Loungewear, L", 220));
		store.addItem(new Item(Cloths.Loungewear, Sizes.S, Colors.Grey,"Grey Loungewear, S", 250));
		store.addItem(new Item(Cloths.Loungewear, Sizes.L, Colors.Orange,"Orange Loungewear, L", 250));
		store.addItem(new Item(Cloths.Loungewear, Sizes.M, Colors.Pink,"Pink Loungewear, M", 220));
		store.addItem(new Item(Cloths.Loungewear, Sizes.L, Colors.Red,"Red Loungewear, L", 200));
		store.addItem(new Item(Cloths.Loungewear, Sizes.S, Colors.White,"White Loungewear, S", 240));
		store.addItem(new Item(Cloths.Loungewear, Sizes.L, Colors.Yellow,"Yellow Loungewear, L", 250));
		
		store.addItem(new Item(Cloths.Underweare, Sizes.L, Colors.Black,"Black Underweare ,L", 200));
		store.addItem(new Item(Cloths.Underweare, Sizes.XL, Colors.Blue,"Blue Underweare, XL", 220));
		store.addItem(new Item(Cloths.Underweare, Sizes.L, Colors.Brown,"Brown Underweare, L", 220));
		store.addItem(new Item(Cloths.Underweare, Sizes.S, Colors.Grey,"Grey Underweare, S", 250));
		store.addItem(new Item(Cloths.Underweare, Sizes.L, Colors.Orange,"Orange Underweare, L", 250));
		store.addItem(new Item(Cloths.Underweare, Sizes.M, Colors.Pink,"Pink Underweare, M", 220));
		store.addItem(new Item(Cloths.Underweare, Sizes.L, Colors.Red,"Red Underweare, L", 200));
		store.addItem(new Item(Cloths.Underweare, Sizes.S, Colors.White,"White Underweare, S", 240));
		store.addItem(new Item(Cloths.Underweare, Sizes.L, Colors.Yellow,"Yellow Underweare, L", 250));
				
		store.addItem(new Item(Cloths.Socks, Sizes.L, Colors.Black,"Black Socks ,L", 200));
		store.addItem(new Item(Cloths.Socks, Sizes.XL, Colors.Blue,"Blue Socks, XL", 220));
		store.addItem(new Item(Cloths.Socks, Sizes.L, Colors.Brown,"Brown Socks, L", 220));
		store.addItem(new Item(Cloths.Socks, Sizes.S, Colors.Grey,"Grey Socks, S", 250));
		store.addItem(new Item(Cloths.Socks, Sizes.L, Colors.Orange,"Orange Socks, L", 250));
		store.addItem(new Item(Cloths.Socks, Sizes.M, Colors.Pink,"Pink Socks, M", 220));
		store.addItem(new Item(Cloths.Socks, Sizes.L, Colors.Red,"Red Socks, L", 200));
		store.addItem(new Item(Cloths.Socks, Sizes.S, Colors.White,"White Socks, S", 240));
		store.addItem(new Item(Cloths.Socks, Sizes.L, Colors.Yellow,"Yellow Socks, L", 250));
	}
}
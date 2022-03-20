package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Store store = new Store();
	
	// Attributes
	private HashMap<Integer, Item> Shirts = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> TShirts = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Hoodies = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Jackets = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Trousers = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Shorts = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Jeanss = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Underweares = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Loungewears = new HashMap<Integer, Item>();
	private HashMap<Integer, Item> Sockss = new HashMap<Integer, Item>();
	
	private HashMap<Integer, Client> Clients = new HashMap<Integer, Client>();
	private HashMap<Integer, Manager> Managers = new HashMap<Integer, Manager>();
	
	private HashMap<Client, Cart> Cart = new HashMap<Client, Cart>();
	private HashMap<Client, Invoice> Invoices = new HashMap<Client, Invoice>();

	// Constructor
	public Store() {
		
	}

	public static Store getInstance() {
		return store;
	}
	
	// Current Users
	private Client currentClient;
	private Manager currentManager;

	public Client getCurrentClient() {
		return currentClient;
	}

	public void setCurrentClient(Client currentClient) {
		this.currentClient = currentClient;
	}

	public Manager getCurrentManager() {
		return currentManager;
	}

	public void setCurrentManager(Manager currentManager) {
		this.currentManager = currentManager;
	}
	
	// Add Clients / Managers
	public void addManager(Manager manager) {
		Managers.put(manager.get_personId(), manager);
	}
	
	public void addClient(Client client) {
		Clients.put(client.get_personId(), client);
		Cart.put(client, new Cart());
	}
	
	// Cart Methods
	// Add Item's to cart
	public void addItemToCart(Client client,Item item) {
		Cart.forEach((Client,Cart) -> {
			if(Client.equals(client)) {
				Cart.addItemToCart(item);
			}
		});
	}
	
	public void removeItemFromCart(Client client,Item item) {
		Cart.forEach((Client,Cart) -> {
			if(Client.equals(client)) {
				Cart.deleteItemFromCart(item);
			}
		});
	}
	
	public void getClientTotalPrice(Client client) {
		Cart.forEach((Client,Cart) -> {
			if(Client.equals(client)) {
				Cart.get_cartPrice();
			}
		});
	}
	
	public double getTotalCartPriceClient() {
		double totalClientCart=0;
		Client current = store.getCurrentClient();
		for (Entry<Client, Cart> c : Cart.entrySet()) {
				if(c.getKey().equals(current)) {
					totalClientCart += c.getValue().get_cartPrice(); 
				}
			
		}
		return totalClientCart;
	}
	
	public double getTotalCartPrice() {
		double total=0;
		for (Entry<Client, Cart> c : Cart.entrySet()) {
			total += c.getValue().get_cartPrice(); 
		}
		return total;
	}
	
	public String printCart(Client client) {
		String ans="";
		for (Entry<Client, Cart> c : Cart.entrySet()) {
			if(c.getKey().equals(client))
				ans += c.getKey().get_personId() + " " + c.getValue().toString(); 
		}
		return ans;
	}

	
	public void setCart(HashMap<Client, Cart> cart) {
		Cart = cart;
	}
	
	public HashMap<Client, Cart> getCart() {
		return Cart;
	}
	
	// Invoice
	public void getInvoice(Client client) {
		double totalPrice = 0;
		String items="";
		Invoice invoice = null;
		for (Entry<Client, Cart> c : Cart.entrySet()) {
			if(c.getKey().equals(client)) {
				totalPrice = c.getValue().get_cartPrice();
				items = c.getValue().toString();
			}
		}
		if(client.get_credit().get_balance() >= totalPrice) {
			invoice = new Invoice(items,totalPrice,client.get_name());
			Invoices.put(client, invoice);
		}
		client.get_credit().set_balance(client.get_credit().get_balance() - totalPrice);
		
	}
	
	public String getTotalCash() {
		int total=0;
		String ans="";
		for (Entry<Client, Invoice> c : Invoices.entrySet()) {
			total+=c.getValue().get_price();
		}
		ans+=total;
		return ans;
	}
	
	public void addCreditToClient(Client client,String visaNumber,String visaMonth, String visaYear, String cvv) {
		Credit credit = new  Credit(visaNumber, visaMonth, visaYear, cvv);
		client.set_credit(credit);
	}
	
	public void addBalanceToClient(Client client,double money) {
		double balance = client.get_credit().get_balance();
		client.get_credit().set_balance(balance + money);
	}
	public double getClientBalance(Client client) {
		return client.get_credit().get_balance();
	}

	public String getInvoiceId(Client client,Cart c) {
		String ans = "";
		for (Entry<Client, Invoice> x : Invoices.entrySet()) {
			if(x.getKey().equals(client)) {
				
			}
		}
		return ans;
	}
	
	// -------- Manager methods --------
	public void addItem(Item item) {
		if(item.get_itemName().equals(Cloths.Shirt)) 
			Shirts.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.TShirt)) 
			TShirts.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Hoodie)) 
			Hoodies.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Jacket)) 
			Jackets.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Trouser)) 
			Trousers.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Short)) 
			Shorts.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Jeans)) 
			Jeanss.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Underweare)) 
			Underweares.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Loungewear)) 
			Loungewears.put(item.get_catalogNumber(), item);
		
		else if(item.get_itemName().equals(Cloths.Socks)) 
			Sockss.put(item.get_catalogNumber(), item);	
	}
	
	public void removeItem(Item item) {
		if(item.get_itemName().equals(Cloths.Shirt)) 
			Shirts.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.TShirt)) 
			TShirts.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Hoodie)) 
			Hoodies.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Jacket)) 
			Jackets.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Trouser)) 
			Trousers.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Short)) 
			Shorts.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Jeans)) 
			Jeanss.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Underweare)) 
			Underweares.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Loungewear)) 
			Loungewears.remove(item.get_catalogNumber());
		
		else if(item.get_itemName().equals(Cloths.Socks)) 
			Sockss.remove(item.get_catalogNumber());
	}
	
	
	// Getter's
	public HashMap<Integer, Client> getClients() {
		return Clients;
	}
	
	public HashMap<Client, Invoice> getInvoices() {
		return Invoices;
	}

	public HashMap<Integer, Manager> getManagers() {
		return Managers;
	}
	
	
	public HashMap<Integer, Item> getShirt() {
		return Shirts;
	}

	public HashMap<Integer, Item> getTShirt() {
		return TShirts;
	}

	public HashMap<Integer, Item> getHoodies() {
		return Hoodies;
	}

	public HashMap<Integer, Item> getJackets() {
		return Jackets;
	}

	public HashMap<Integer, Item> getTrousers() {
		return Trousers;
	}

	public HashMap<Integer, Item> getShorts() {
		return Shorts;
	}

	public HashMap<Integer, Item> getJeans() {
		return Jeanss;
	}

	public HashMap<Integer, Item> getUnderweare() {
		return Underweares;
	}

	public HashMap<Integer, Item> getLoungewear() {
		return Loungewears;
	}

	public HashMap<Integer, Item> getSocks() {
		return Sockss;
	}

	// Print Methods
	public String printInvoices(Client client) {
		String ans = "";
		for (Entry<Client, Invoice> c : Invoices.entrySet()) {
			if(c.getKey().equals(client))
				ans +=   c.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printClients() {
		String ans = "";
		for (Entry<Integer, Client> c : Clients.entrySet()) {
			ans +=   c.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printManagers() {
		String ans = "";
		for (Entry<Integer, Manager> m : Managers.entrySet()) {
			ans += m.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printShirts() {
		String ans = "";
		for (Entry<Integer, Item> i : Shirts.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printTShirts() {
		String ans = "";
		for (Entry<Integer, Item> i : TShirts.entrySet()) {
			ans += i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printHoodies() {
		String ans = "";
		for (Entry<Integer, Item> i : Hoodies.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printJackets() {
		String ans = "";
		for (Entry<Integer, Item> i : Jackets.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printTrousers() {
		String ans = "";
		for (Entry<Integer, Item> i : Trousers.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printShorts() {
		String ans = "";
		for (Entry<Integer, Item> i : Shorts.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printJeanss() {
		String ans = "";
		for (Entry<Integer, Item> i : Jeanss.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printUnderweares() {
		String ans = "";
		for (Entry<Integer, Item> i : Underweares.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printLoungewears() {
		String ans = "";
		for (Entry<Integer, Item> i : Loungewears.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	public String printSockss() {
		String ans = "";
		for (Entry<Integer, Item> i : Sockss.entrySet()) {
			ans += i.getKey().toString() + i.getValue().toString() + "\n";
		}
		return ans;
	}
	
	// Save data to SER file
	public void save() {
		try {
			FileOutputStream fo = new FileOutputStream("database.ser");
			ObjectOutputStream obj = new ObjectOutputStream(fo);
			
			obj.writeObject(Shirts);
			obj.writeObject(TShirts);
			obj.writeObject(Hoodies);
			obj.writeObject(Jackets);
			obj.writeObject(Trousers);
			obj.writeObject(Shorts);
			obj.writeObject(Jeanss);
			obj.writeObject(Underweares);
			obj.writeObject(Loungewears);
			obj.writeObject(Sockss);
			obj.writeObject(Clients);
			obj.writeObject(Managers);
			obj.writeObject(Cart);
			obj.writeObject(Invoices);
					
			obj.close();
			fo.close();
			
			System.out.println("Database saved successfully!");
			
		}
		catch(IOException e) {
			System.out.println("ERROR");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void load() {
		try {
			FileInputStream fi = new FileInputStream("database.ser");
			@SuppressWarnings("resource")
			ObjectInputStream objIn = new ObjectInputStream(fi);
			
			Shirts = (HashMap<Integer, Item>)objIn.readObject();
			TShirts = (HashMap<Integer, Item>)objIn.readObject();
			Hoodies = (HashMap<Integer, Item>)objIn.readObject();
			Jackets = (HashMap<Integer, Item>)objIn.readObject();
			Trousers = (HashMap<Integer, Item>)objIn.readObject();
			Shorts = (HashMap<Integer, Item>)objIn.readObject();
			Jeanss = (HashMap<Integer, Item>)objIn.readObject();
			Underweares = (HashMap<Integer, Item>)objIn.readObject();
			Loungewears = (HashMap<Integer, Item>)objIn.readObject();
			Sockss = (HashMap<Integer, Item>)objIn.readObject();
			Clients = (HashMap<Integer, Client>)objIn.readObject();
			Managers = (HashMap<Integer, Manager>)objIn.readObject();
			Cart = (HashMap<Client, Cart>)objIn.readObject();
			Invoices = (HashMap<Client, Invoice>)objIn.readObject();
			
			objIn.close();
			fi.close();
			
			System.out.println("Database loaded successfully!");

		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("Initialize error");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found");
		}
		
	}
	

}

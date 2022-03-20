package code;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attributes
	private int _cartId;
	private static int counter;
	private ArrayList<Item> Items = new ArrayList<Item>();;
	private double _cartPrice = 0;
	
	public Cart() {
		_cartId = ++counter;
	}
	
	//add items to cart
	public void addItemToCart(Item item) {
		Items.add(item);
		_cartPrice += item.get_itemPrice();
	}
	
	//delete item from cart
	public void deleteItemFromCart(Item item) {
		Items.remove(Items.indexOf(item));
		_cartPrice -= item.get_itemPrice();
	}

	//Setter's
	public void set_cartPrice(double _cartPrice) {
		this._cartPrice = _cartPrice;
	}

	public void setItems(ArrayList<Item> items) {
		Items = items;
	}

	//Getter's
	public double get_cartPrice() {
		return _cartPrice;
	}
	
	public ArrayList<Item> getItems() {
		return Items;
	}
	
	public int getCartId() {
		return _cartId;
	}
	
	public String toString() {
		return Items.toString() + "\n" + "Total Cart price = " + _cartPrice ;
	}
}

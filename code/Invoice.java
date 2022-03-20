package code;

import java.io.Serializable;

public class Invoice implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private String _items;
	private double _price;
	private int _invoiceID;
	private static int counter = 0;
	private String _clientName;
	
	public Invoice(String items,double price,String clientName) {
		set_items(items);
		set_price(price);
		_invoiceID = ++counter;
		_clientName = clientName;
	}

	public String get_items() {
		return _items;
	}

	public void set_items(String _items) {
		this._items = _items;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}
	
	public double get_invoiceID() {
		return _invoiceID;
	}

	/*
	@Override
	public String toString() {
		return "Client : "+ _clientName + " Invoice Number: " + _invoiceID + " Items = " + _items + ", Total price = " + _price;
	}  */
	
	@Override
	public String toString() {
		return "Client : "+ _clientName + " Invoice Number: " + _invoiceID + " Items = " + _items ;
	}
	
	
	

}

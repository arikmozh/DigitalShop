package code;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private int _catalogNumber;
	private static int ShirtCounter = 0;
	private static int TShirtCounter = 0;
	private static int HoodieCounter = 0;
	private static int JacketCounter = 0;
	private static int TrouserCounter = 0;
	private static int ShortCounter = 0;
	private static int JeansCounter = 0;
	private static int UnderweareCounter = 0;
	private static int LoungewearCounter = 0;
	private static int SocksCounter = 0;
	
	private Cloths _itemName;
	private Sizes _itemSize;
	private Colors _itemColor;
	private String _itemDesc;
	private double _itemPrice;
	
	// Constructor
	public Item(Cloths itemName,Sizes itemSize, Colors itemColor, String desc, double itemPrice) {
		set_itemName(itemName);
		set_itemSize(itemSize);
		set_itemColor(itemColor);
		set_desc(desc);
		set_itemPrice(itemPrice);
		if(itemName.equals(Cloths.Shirt))
			_catalogNumber = ++ShirtCounter;
		else if(itemName.equals(Cloths.TShirt))
			_catalogNumber = ++TShirtCounter;
		else if(itemName.equals(Cloths.Hoodie))
			_catalogNumber = ++HoodieCounter;
		else if(itemName.equals(Cloths.Jacket))
			_catalogNumber = ++JacketCounter;
		else if(itemName.equals(Cloths.Trouser))
			_catalogNumber = ++TrouserCounter;
		else if(itemName.equals(Cloths.Short))
			_catalogNumber = ++ShortCounter;
		else if(itemName.equals(Cloths.Jeans))
			_catalogNumber = ++JeansCounter;
		else if(itemName.equals(Cloths.Underweare))
			_catalogNumber = ++UnderweareCounter;
		else if(itemName.equals(Cloths.Loungewear))
			_catalogNumber = ++LoungewearCounter;
		else if(itemName.equals(Cloths.Socks))
			_catalogNumber = ++SocksCounter;
	}

	// Setter's
	public void set_catalogNumber(int _catalogNumber) {
		this._catalogNumber = _catalogNumber;
	}

	public void set_itemName(Cloths _itemName) {
		this._itemName = _itemName;
	}

	public void set_itemSize(Sizes _itemSize) {
		this._itemSize = _itemSize;
	}

	public void set_itemColor(Colors _itemColor) {
		this._itemColor = _itemColor;
	}
	
	public void set_desc(String _desc) {
		this._itemDesc = _desc;
	}

	public void set_itemPrice(double _itemPrice) {
		this._itemPrice = _itemPrice;
	}
 
	// Getter's
	public int get_catalogNumber() {
		return _catalogNumber;
	}

	public Cloths get_itemName() {
		return _itemName;
	}

	public Sizes get_itemSize() {
		return _itemSize;
	}

	public Colors get_itemColor() {
		return _itemColor;
	}

	public String get_desc() {
		return _itemDesc;
	}
	
	public double get_itemPrice() {
		return _itemPrice;
	}

	// toString
	@Override
	public String toString() {
		return "\nItem Catalog number = " + _catalogNumber + ", Item Name = " + _itemName + ", Item size = " + _itemSize
				+ ", Item color = " + _itemColor + ", Item description = " + _itemDesc  + ", Item price = " + _itemPrice + " NIS";
	}
	
	
	
	
	
	

}

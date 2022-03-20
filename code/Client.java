package code;

import java.io.Serializable;

public class Client extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private Credit _credit;
	
	// Constructor
	public Client(String name,int birthYear,String phone, Credit credit) {
		super(name, birthYear,phone);
		credit = null;
	}

	// Setter's
	public void set_credit(Credit _credit) {
		this._credit = _credit;
	}
	
	// Getter's
	public Credit get_credit() {
		return _credit;
	}
	
	// toString
	@Override
	public String toString() {
		return super.toString();
	}
	
}

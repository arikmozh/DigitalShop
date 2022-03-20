package code;

import java.io.Serializable;

public class Manager extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor
	public Manager(String name,int BirthYear, String phone) {
		super(name,BirthYear,phone);
	}
	
	// toString
	@Override
	public String toString() {
		return super.toString();
	}
}

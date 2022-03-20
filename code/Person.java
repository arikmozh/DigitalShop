package code;

import java.io.Serializable;

public abstract class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private String _name;
	private int _birthYear;
	private String _phone;
	private int _personId;
	private static int counter = 0;
		
	// Constructor
	public Person(String name,int birthYear, String phone) {
		set_name(name);
		set_birthYear(birthYear);
		set_phone(phone);
		_personId = ++counter;
		}

	// Setter's
	public void set_name(String name) {
		this._name = name;
		}

	public void set_birthYear(int birthYear) {
		this._birthYear = birthYear;
		}
	
	public void set_phone(String phone) {
		this._phone = phone;
		}

	// Getter's
	public int get_personId() {
		return _personId;
	}
		
	public String get_name() {
		return _name;
	}

	public int get_birthYear() {
		return _birthYear;
	}

	public String get_phone() {
		return _phone;
	}
	
	// toString
	@Override
	public String toString() {
		return "\nID : " + _personId + ", Name : "+ _name + ", birthYear : " + _birthYear + ", phone : " +_phone + " ";
	}

}

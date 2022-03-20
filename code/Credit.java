package code;

import java.io.Serializable;

public class Credit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private String _visaNumber;
	private String _visaMonth;
	private String _visaYear;
	private String _cvv;
	private double _balance;
	
	// Constructor
	public Credit(String visaNumber,String visaMonth, String visaYear, String cvv) {
		set_visaNumber(visaNumber);
		set_visaMonth(visaMonth);
		set_visaYear(visaYear);
		set_cvv(cvv);
		_balance = 100000;
	}

	// Setter's
	public void set_visaNumber(String _visaNumber) {
		this._visaNumber = _visaNumber;
	}

	public void set_visaMonth(String _visaMonth) {
		this._visaMonth = _visaMonth;
	}

	public void set_visaYear(String _visaYear) {
		this._visaYear = _visaYear;
	}

	public void set_cvv(String _cvv) {
		this._cvv = _cvv;
	}
	
	public void set_balance(double _balance) {
		this._balance = _balance;
	}

	// Getter's
	public String get_visaNumber() {
		return _visaNumber;
	}

	public String get_visaMonth() {
		return _visaMonth;
	}

	public String get_visaYear() {
		return _visaYear;
	}
	
	public String get_cvv() {
		return _cvv;
	}
	
	public double get_balance() {
		return _balance;
	}

	// toString
	@Override
	public String toString() {
		return "\nCredit: visa Number = " + _visaNumber + ", visa Month = " + _visaMonth + " visa Year = " + _visaYear
				+ " cvv = " + _cvv + " Balance = " + _balance;
	}
	
	
	
}

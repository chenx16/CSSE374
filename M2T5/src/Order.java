import java.util.ArrayList;

import javax.swing.text.html.Option;

public class Order {
	String orderID;
	String street;
	String zip;
	String drink;
	ArrayList<Condiment> condiments;
	
	public Order(String orderID, String street, String zip, String drink) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = new ArrayList<>();
	}
	
	public Order(String orderID, String streetAddress, String zipcode, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = streetAddress;
		this.zip = zipcode;
		this.drink = drink;
		this.condiments = condiments;
	}
	
	public String getOrderID() { 
		return this.orderID;
	}
	
	public String getStreetAddress() {
		return this.street;
	}
	
	public String getZipcode() {
		return this.zip;
	}
	
	public String getDrink() {
		return this.drink;
	}
	
	public ArrayList<Condiment> getCondiments(){
		return this.condiments;
	}
 
}
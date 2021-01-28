import java.util.ArrayList;

import javax.swing.text.html.Option;

public class Order {
	int orderID;
	String street;
	int zip;
	String drink;
	ArrayList<Condiment> condiments;
	
	public Order(int orderID, String street, int zip, String drink) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = new ArrayList<>();
	}
	
	public Order(int orderID, String streetAddress, int zipcode, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = streetAddress;
		this.zip = zipcode;
		this.drink = drink;
		this.condiments = condiments;
	}
	
	public int getOrderID() { 
		return this.orderID;
	}
	
	public String getStreetAddress() {
		return this.street;
	}
	
	public int getZipcode() {
		return this.zip;
	}
	
	public String getDrink() {
		return this.drink;
	}
	
	public ArrayList<Condiment> getCondiments(){
		return this.condiments;
	}
 
}
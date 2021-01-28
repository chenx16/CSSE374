import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.text.html.Option;

public class Order implements Observer{
	private int orderID;
	private String street;
	private int zip;
	private String drink;
	private ArrayList<Condiment> condiments;
    private CoffeeMachineController controller;
	
	
	public Order(int orderID, String street, int zip, String drink) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = new ArrayList<>();
		this.controller = new SimpleController(zip, drink, zip);
	}
	
	public Order(int orderID, String streetAddress, int zipcode, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = streetAddress;
		this.zip = zipcode;
		this.drink = drink;
		this.condiments = condiments;
		this.controller = new AdvancedController(zipcode, drink, zipcode);
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

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
 
}
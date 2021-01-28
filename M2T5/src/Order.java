import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.text.html.Option;


public class Order implements Observer{
	protected int orderID;
	protected String street;
	protected String zip;
	protected String drink;
	protected ArrayList<Condiment> condiments;
	protected CoffeeMachineController controller;

	
	public Order(int orderID, String street, String zip, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = condiments;
		this.condiments = new ArrayList<>();
		this.controller = new SimpleController(orderID);
	}
	

	
	public int getOrderID() { 
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

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
 
}
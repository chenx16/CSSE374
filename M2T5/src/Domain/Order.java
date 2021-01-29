package Domain;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.text.html.Option;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Order extends Observable {
	protected int orderID;
	protected String street;
	protected String zip;
	protected String drink;
	protected ArrayList<Condiment> condiments;

//	private static JSONObject Orders = new JSONObject();
//	protected CoffeeMachineController controller;

	s
	public Order(int orderID, String street, String zip, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = condiments;
		
//		this.controller = new SimpleController(orderID);
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


 
}
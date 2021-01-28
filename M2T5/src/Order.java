import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.text.html.Option;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Order {
	protected int orderID;
	protected String street;
	protected String zip;
	protected String drink;
	protected ArrayList<Condiment> condiments;
	private static JSONArray orderArrays = new JSONArray();
//	private static JSONObject Orders = new JSONObject();
//	protected CoffeeMachineController controller;

	
	public Order(int orderID, String street, String zip, String drink, ArrayList<Condiment> condiments) {
		this.orderID = orderID;
		this.street = street;
		this.zip = zip;
		this.drink = drink;
		this.condiments = condiments;
		this.condiments = new ArrayList<>();
//		this.controller = new SimpleController(orderID);
	}
	
	public void importOrder() {
		 JSONObject orderObj = new JSONObject();
		   
		   JSONObject addressObj = new JSONObject();
		   
		   
		   
		  
		   JSONArray conArray = new JSONArray();
		   for(int i = 0; i < condiments.size(); i++) {
		   JSONObject conObj = new JSONObject();
		   conObj.put("qty", condiments.get(i).qty);
		   conObj.put("name", condiments.get(i).name);
		   
		   conArray.add(conObj);
		   }
		   addressObj.put("ZIP", String.valueOf(this.orderID));
		   addressObj.put("street", String.valueOf(this.street));
		   orderObj.put("orderId", String.valueOf(this.orderID));
		   orderObj.put("condiments", conArray);
		   orderObj.put("address", addressObj);
		   
		  
		   orderArrays.add(orderObj);
//		   Orders.put("", orderArrays);
		   System.out.println("orderID:"+ this.orderID + " drink: "+ this.drink + " street: "+ street + " ZIP: " + this.zip);
		   System.out.println("System: Processing");
		   try (FileWriter file = new FileWriter("order-input.json")) {
			   System.out.print("Hello");
	            file.write(orderArrays.toString());
	            file.flush();
	            return;
	 
	        } catch (IOException e) {
	        	System.out.print("Hello");
	            e.printStackTrace();
	            return;
	        }
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
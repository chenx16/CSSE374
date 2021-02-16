package Domain;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.text.html.Option;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Data.CondimentDecorator;


public class RecipeOrder extends AbstractOrder {
	protected int orderID;
	protected String street;
	protected String zip;
	protected String drink;
	protected ArrayList<CondimentDecorator> condiments;

//	private static JSONObject Orders = new JSONObject();
//	protected CoffeeMachineController controller;

	
//	public RecipeOrder(int orderID, String street, String zip, String drink, ArrayList<CondimentDecorator> condiments) {
		
		
//		this.controller = new SimpleController(orderID);
//	}
	
	
	












	public RecipeOrder(int orderID, String address, String zip, String drinktype,
			ArrayList<CondimentDecorator> arrayList) {
		this.orderID = orderID;
		this.street = address;
		this.zip = zip;
		this.drink = drinktype;
		this.condiments = arrayList;
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
	
	public ArrayList<CondimentDecorator> getCondiments(){
		return this.condiments;
	}



	@Override
	public double makeCoffee() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "RecipeOrder starts";
	}


 
}

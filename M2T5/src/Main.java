import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.*;

import com.github.cliftonlabs.json_simple.JsonArray;

public class Main {
	
	private static HashMap<Integer, Integer> orders = new HashMap<>();
	private static int orderId = 1;
	private static JSONObject Orders = new JSONObject();
	private static JsonArray orderArrays = new JsonArray();
	public static void main(String[] args) {
		 while(true) {
			   System.out.println("--------------------------------------------");
			   System.out.println("System: Start order");
			   System.out.println("OrderId"+ orderId);
			   
			  
			   Scanner scanner = new Scanner(System.in);
			   System.out.println("Please enter your street address");
			   String street = scanner.nextLine();
			   System.out.println("Please enter your zip address");
			   String zip = scanner.next();
			   System.out.println("Please enter your drink type");
			   String drinktype = scanner.next();
			   System.out.println("Please enter your condiment");
			   String condiment = scanner.next();
			   System.out.println("Please enter quantity");
			   int qty = scanner.nextInt();
			   Condiment c1 = new Condiment(condiment, qty);
			   ArrayList<Condiment> condiments = new ArrayList<Condiment>();
			   condiments.add(c1);
			   Order order = new Order(String.valueOf(orderId), street,zip, drinktype, condiments);
			   orderId = orderId + 1;
			   JSONObject orderObj = new JSONObject();
			   
			   JSONObject addressObj = new JSONObject();
			   
			   
			   
			  
			   JsonArray conArray = new JsonArray();
			   for(int i = 0; i < condiments.size(); i++) {
			   JSONObject conObj = new JSONObject();
			   conObj.put("qty", condiments.get(i).qty);
			   conObj.put("name", condiments.get(i).name);
			   
			   conArray.add(conObj);
			   }
			   orderObj.put("orderId", order.orderID);
			   orderObj.put("condiments", conArray);
			   orderObj.put("address", addressObj);
			   addressObj.put("ZIP", order.orderID);
			   addressObj.put("street", order.street);
			  
			   orderArrays.add(orderObj);
			   Orders.put("", orderArrays);
			   try (FileWriter file = new FileWriter("order-input.json")) {
				   
		            file.write(orderArrays.toString());
		            file.flush();
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			   System.out.println("orderID:"+ order.orderID + " drink: "+ order.drink + " street: "+ street + " ZIP: " + order.zip);
			   System.out.println("System: Processing");
			   System.out.println("System: Your coffee order has been cancelled.");
			   System.out.println("System: Reason: Out of milk, drink cancelled.");
			   

			}
	}
	  
}


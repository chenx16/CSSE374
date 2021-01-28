import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public abstract class CoffeeMachineController{
	produceDrinkBehavior producedrink;
	int id;
	String type;
	int status;
	int coffeemachineid;
	ArrayList<Order> orders;
	private static JSONArray responseArrays = new JSONArray();
	private static JSONArray userResponse = new JSONArray();
	private static JSONArray commandsArray = new JSONArray();
	private static int orderId;
	public CoffeeMachineController(int id, String type, int status) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.orders = new ArrayList<Order>();
		this.orderId = 1;
	}
	
	public void importResponse() {
		  JSONObject controllerResponse = new JSONObject();
		  JSONObject orderId = new JSONObject();
		  orderId.put("orderID", this.orders.size()+1);
		  orderId.put("status", 0);
		  controllerResponse.put("drinkResponse", orderId);
		  responseArrays.add(controllerResponse);
		  try (FileWriter file = new FileWriter("controller-response.json")) {
			   
	            file.write(responseArrays.toString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		  
	}
	public void remove(Order order) {
		orders.remove(order);
		
	}
	
	public void askForOrder() {
		Scanner scanner = new Scanner(System.in);
		 String condiment = "None";
		 int qty = 0;
		 System.out.println("Please enter your street address");
		   String street = scanner.nextLine();
		   System.out.println("Please enter your zip address");
		   String zip = scanner.next();
		   System.out.println("Please enter your drink type");
		   String drinktype = scanner.next();
		   System.out.println(this.type);
		   if(this.type == "Automated") {
		   System.out.println("Please enter your condiment");
		   condiment = scanner.next();
		   System.out.println("Please enter quantity");
		   qty = scanner.nextInt();
		   }
		   Condiment c1 = new Condiment(condiment, qty);
		   ArrayList<Condiment> condiments = new ArrayList<Condiment>();
		   condiments.add(c1);
		   Order order = new Order(this.orderId, street,zip, drinktype, condiments);
		   this.addOrder(order);
		   this.orderId++;
		   order.importOrder();
		   return;
	}
	
	public void pushCommand() {
		JSONObject command = new JSONObject();
		command.put("controller_id", this.id);
		this.coffeemachineid = (int) Math.round(Math.random()*10+1);
		command.put("coffee_machine_id", this.coffeemachineid);
		command.put("orderID", this.orders.get(orders.size()-1).orderID);
		command.put("DrinkName", this.orders.get(orders.size()-1).drink);
		command.put("Requesttype", this.type);
		if(this.type =="Automated") {
		JSONArray condiments = new JSONArray();
		for(int i = 0; i < this.orders.get(orders.size()-1).condiments.size(); i++) {
		JSONObject c1 = new JSONObject();
		c1.put("Name", this.orders.get(orders.size()-1).condiments.get(i));
		condiments.add(c1);
		}
		command.put("Options", condiments);}
		else {
			command.put("Options", null);
		}
		JSONObject wrapup = new JSONObject();
		wrapup.put("command", command);
		commandsArray.add(wrapup);
		 try (FileWriter file = new FileWriter("Command_stream.json")) {
			   
	            file.write(commandsArray.toString());
	            file.flush();
	            file.close();
	            return;
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	public void userResponse() {
		JSONObject response = new JSONObject();
		response.put("orderID", this.orders.get(orders.size()-1).orderID);
		response.put("coffee_machine_id", this.coffeemachineid);
		response.put("status", 0);
		response.put("status-message", "Your coffee has been prepared with your desired options.");
		JSONObject wrapup = new JSONObject();
		wrapup.put("user-response", wrapup);
		userResponse.add(wrapup);
		try (FileWriter file = new FileWriter("App-response.json")) {
			   
            file.write(userResponse.toString());
            file.flush();
            file.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}

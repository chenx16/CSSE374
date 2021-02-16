package Domain;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Data.CondimentDecorator;
public abstract class ProgrammableController{
	int id;
	String type;
	int status;
	int coffeemachineid;
	ArrayList<AbstractOrder> orders;
	private static JSONArray responseArrays = new JSONArray();
	private static JSONArray userArray = new JSONArray();
	private static JSONArray commandsArray = new JSONArray();
	private static JSONArray orderArrays = new JSONArray();
	private static int orderId=1;
	public ProgrammableController(int id, String type, int status) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.orders = new ArrayList<AbstractOrder>();
	}
	
	public void importResponse() {
//		System.out.print("Hello10");
		  JSONObject controllerResponse = new JSONObject();
		  JSONObject orderId = new JSONObject();
		  orderId.put("orderID", this.orders.get(orders.size()-1).orderID);
		  orderId.put("status", 0);
		  controllerResponse.put("drinkResponse", orderId);
		  responseArrays.add(controllerResponse);
		  try (FileWriter file = new FileWriter("controller-response.json")) {
//			    System.out.print("Hello9");
	            file.write(responseArrays.toString());
	            file.flush();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		  
	}
	public void remove(AbstractOrder order) {
		orders.remove(order);
		
	}
	
//	public void askForOrder() {
//		Scanner scanner = new Scanner(System.in);
//		 String condiment = "None";
//		 int qty = 0;
//		 System.out.println("Please enter your street address");
//		   String street = scanner.nextLine();
//		   System.out.println("Please enter your zip address");
//		   String zip = scanner.next();
//		   System.out.println("Please enter your drink type");
//		   String drinktype = scanner.next();
//		   System.out.println(this.type);
//		   
//		   
//		   if(this.type.equals("Automated")) {
//
//		   System.out.println("Please enter your condiment");
//		   condiment = scanner.next();
//		   System.out.println("Please enter quantity");
//		   qty = scanner.nextInt();
//		   
//		   System.out.print("condiment: "+condiment);
//		   System.out.println();
//		   System.out.print("quantity: "+qty);
//		   System.out.println();
//		   CondimentDecorator c1 = new CondimentDecorator(condiment, qty);
//		   ArrayList<Condiment> condiments = new ArrayList<Condiment>();
//		   condiments.add(c1);
//		  
//		   while(true) {
//			System.out.println("Do you still want to add condiment? (Y=Yes/N=No)");
//			String answer =  scanner.next();
//			if(answer.equals("N")) break;
//			else if(answer.equals("Y")){
//				System.out.println("Please enter your condiment");
//				   condiment = scanner.next();
//				   System.out.println("Please enter quantity");
//				   qty = scanner.nextInt();
//				   
//				   System.out.print("condiment: "+condiment);
//				   System.out.println();
//				   System.out.print("quantity: "+qty);
//				   System.out.println();
//				   Condiment c = new Condiment(condiment, qty);
//				   condiments.add(c);
//			}
//			else {
//				System.out.print("Incorrect Information. Please enter again");
//				System.out.println();
//			}
//
//		   }
//		   
//		   
//		   
//		   
//		   System.out.println("Size in ask for order "+condiments.size());
//		   Order order = new Order(this.orderId, street,zip, drinktype, condiments);
//		   System.out.print("Order condiment" + order.condiments.get(0).getName());
//		   this.addOrder(order);
//		   this.orderId++;
//		   this.importOrder(order);
//		   }
//		   else {
//			   ArrayList<Condiment> condiments = new ArrayList<Condiment>();
//			   Order order = new Order(this.orderId, street,zip, drinktype, condiments);
//			   this.addOrder(order);
//			   this.orderId++;
//			   this.importOrder(order);
//		   
//		   }
////		   System.out.print("CONDIMENT"+condiment);
////		   Condiment c1 = new Condiment(condiment, qty);
//		   
//		   
//		   
//		   
//	}
//	
//	public void importOrder(Order order){
//		 JSONObject orderObj = new JSONObject();
//		   
//		   JSONObject addressObj = new JSONObject();
//		   
//		   
//		   
//		  
//		   JSONArray conArray = new JSONArray();
//		   System.out.println("Size in import order "+order.condiments.size());
//		   for(int i = 0; i < order.condiments.size(); i++) {
//		   JSONObject conObj = new JSONObject();
//		   conObj.put("qty", order.condiments.get(i).getQty());
//		   conObj.put("name", order.condiments.get(i).getName());
//		   System.out.print(order.condiments.get(i).getName());
//		   conArray.add(conObj);
//		   }
//		   addressObj.put("ZIP", String.valueOf(order.orderID));
//		   addressObj.put("street", String.valueOf(order.street));
//		   orderObj.put("orderId", String.valueOf(order.orderID));
//		   orderObj.put("condiments", conArray);
//		   orderObj.put("address", addressObj);
//		   
//		  
//		   orderArrays.add(orderObj);
////		   Orders.put("", orderArrays);
//		   System.out.println("orderID:"+ order.orderID + " drink: "+ order.drink + " street: "+ order.street + " ZIP: " + order.zip);
//		   System.out.println("System: Processing");
//		   try (FileWriter file = new FileWriter("order-input.json")) {
////			   System.out.print("Hello");
//	            file.write(orderArrays.toString());
//	            file.flush();
//	            return;
//	 
//	        } catch (IOException e) {
////	        	System.out.print("Hello");
//	            e.printStackTrace();
//	            return;
//	        }
//	}
//	
//	public void pushCommand() {
////		System.out.print("Hello2");
//		JSONObject command = new JSONObject();
//		command.put("controller_id", this.id);
//		this.coffeemachineid = (int) Math.round(Math.random()*10+1);
//		command.put("coffee_machine_id", this.coffeemachineid);
//		command.put("orderID", this.orders.get(orders.size()-1).orderID);
//		command.put("DrinkName", this.orders.get(orders.size()-1).drink);
//		command.put("Requesttype", this.type);
//		if(this.type.equals("Automated")) {
//		JSONArray condiments = new JSONArray();
//		for(int i = 0; i < this.orders.get(orders.size()-1).condiments.size(); i++) {
//		JSONObject c1 = new JSONObject();
//		JSONObject c2 = new JSONObject();
//		c1.put("Name", this.orders.get(orders.size()-1).condiments.get(i).getName());
//		c2.put("qty", this.orders.get(orders.size()-1).condiments.get(i).getQty());
//		condiments.add(c1);
//		condiments.add(c2);
//		}
//		command.put("Options", condiments);}
//		else {
//			command.put("Options", null);
//		}
//		JSONObject wrapup = new JSONObject();
//		wrapup.put("command", command);
//		commandsArray.add(wrapup);
//		 try (FileWriter file = new FileWriter("Command_stream.json")) {
////			   System.out.print("Hello3");
//	            file.write(commandsArray.toString());
//	            file.flush();
//	            file.close();
//	            return;
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	}
//	
//	public void userResponse() {
//		JSONObject response = new JSONObject();
//		response.put("orderID", this.orders.get(orders.size()-1).orderID);
//		response.put("coffee_machine_id", this.coffeemachineid);
//		response.put("status", 0);
//		response.put("status-message", "Your coffee has been prepared with your desired options.");
////		JSONObject wrapup = new JSONObject();
////		wrapup.put("user-response", wrapup);
//		userArray.add(response);
//		try (FileWriter file = new FileWriter("App-response.json")) {
////			   System.out.print("Hello7");
//			file.write(userArray.toString());
////            (response.toJSONString());
//            file.flush();
//            file.close();
////            System.out.print("Hello8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//		
//	}
//	public void addOrder(Order order) {
////		System.out.print("Order condiment" + order.condiments.get(0).getName());
//		this.orders.add(order);
//	}
	

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

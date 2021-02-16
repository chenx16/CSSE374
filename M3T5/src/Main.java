import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;
import Data.Americano;
import Data.Coffee;
import Data.ColumbiaDark;
import Data.CondimentDecorator;
import Data.Cream;
import Data.Decaf;
import Data.DecafCoffee;
import Data.DrinkType;
import Data.Expresso;
import Data.Hazelnut;
import Data.HazelnutCond;
import Data.Latte;
import Data.Milk;
import Data.Nutmeg;
import Data.NutraSweet;
import Data.PumpkinSpiceDrink;
import Data.PumpkinSpiceIng;
import Data.SoyMilk;
import Data.SugarCond;
import Data.SugarIng;
import Data.WhippedCream;
import Domain.AbstractOrder;
import Domain.RecipeOrderFactory;
import Domain.SpecifiedOrderFactory;

public class Main {
	static int orderID = 0;
	static HashMap<String, Integer> condMap;
	static HashMap<String, String> ingreMap;
	static AbstractOrder order;

	public static void main(String[] args) throws IOException {
		while (true) {
			String error = null;
			int status;
			condMap = new HashMap<String, Integer>();
			ingreMap = new HashMap<String, String>();
			Scanner scanner = new Scanner(System.in);
			System.out.println("--------------------------------------------");
			System.out.println("System: Start the order");
			System.out.println("Enter your address");
			String address = scanner.nextLine();
			System.out.println("Enter your zipcode please");
			String zip = scanner.nextLine();

			DrinkType beverage = null;

			// FactoryA mFactoryA = new FactoryA();
			// mFactoryA.Manufacture().Show();

			// FactoryB mFactoryB = new FactoryB();
			// mFactoryB.Manufacture().Show();

			SpecifiedOrderFactory specifiedfact = new SpecifiedOrderFactory();
			RecipeOrderFactory recipefact = new RecipeOrderFactory();
			System.out.println(orderID);
			System.out.println("Please type in your drink name:");
			String drinktype = scanner.nextLine();
			System.out.println("Do you want to DIY order (Y/N)");
			String de = scanner.nextLine();
			ArrayList<CondimentDecorator> condiments = new ArrayList<CondimentDecorator>();
			if (de.equals("Y")) {
				order = specifiedfact.OrderCoffee(orderID, address, zip, drinktype, condiments);
				order.toString();
			} else {
				order = recipefact.OrderCoffee(orderID, address, zip, drinktype, condiments);
				order.toString();
			}
			orderID++;
			switch (drinktype) {
			case "Columbia Dark":
				beverage = new ColumbiaDark();
				break;
			case "Americano":
				beverage = new Americano();
				break;
			case "Latte":
				beverage = new Latte();
				break;
			case "Decaf":
				beverage = new Decaf();
				break;
			case "Expresso":
				beverage = new Expresso();
				break;
			case "Pumpkin Spice":
				beverage = new PumpkinSpiceDrink();
				break;
			default:
				System.out.println("no match");
				continue;
			}

			if (de.equals("Y")) {
				System.out.println("Please enter your ingredients");
				String ingredient = scanner.nextLine();
				switch (ingredient) {
				case "Soy Milk":
					ingreMap.put("steam", "Soy Milk");
					beverage = new SoyMilk(beverage);
					break;
				case "Whipped Cream":
					ingreMap.put("top", "Whipped Cream");
					beverage = new WhippedCream(beverage);
					break;
				case "Milk":
					ingreMap.put("steam", "Milk");
					beverage = new Milk(beverage);
					break;
				case "Sugar":
					ingreMap.put("add", "Sugar");
					beverage = new SugarIng(beverage);
					break;
				case "Coffee":
					ingreMap.put("add", "Coffee");
					beverage = new Coffee(beverage);
					break;
				case "Pumpkin Spice":
					ingreMap.put("add", "Pumpkin Spice");
					beverage = new PumpkinSpiceIng(beverage);
					break;
				case "Hazelnut":
					ingreMap.put("add", "Hazelnut");
					beverage = new Hazelnut(beverage);
					break;
				default:
					System.out.println("no match");
					continue;
				}

				while (true) {
					System.out.println("Do you still want add ingredient? (Y/N)");
					String ans1 = scanner.nextLine();
					if (ans1.equals("Y")) {
						System.out.println("Please enter your ingredient:");
						String ingredient2 = scanner.nextLine();
						if (ingredient2.equals("Soy Milk")) {
							ingreMap.put("steam", "Soy Milk");
							beverage = new SoyMilk(beverage);
						} else if (ingredient2.equals("Whipped Cream")) {
							ingreMap.put("top", "Whipped Cream");
							beverage = new WhippedCream(beverage);
						} else if (ingredient2.equals("Milk")) {
							ingreMap.put("steam", "Milk");
							beverage = new Milk(beverage);
						} else if (ingredient2.equals("Sugar")) {
							ingreMap.put("add", "Sugar");
							beverage = new SugarIng(beverage);
						} else if (ingredient2.equals("Coffee")) {
							ingreMap.put("add", "Coffee");
							beverage = new Coffee(beverage);
						} else if (ingredient2.equals("Pumpkin Spice")) {
							ingreMap.put("add", "Pumpkin Spice");
							beverage = new PumpkinSpiceIng(beverage);
						} else if (ingredient2.equals("Hazelnut")) {
							ingreMap.put("add", "Hazelnut");
							beverage = new Hazelnut(beverage);
						} else {
							System.out.println("no match");
							continue;
						}
					} else if (ans1.equals("N")) {
						break;
					} else {
						System.out.print("Incorrect Information. Please enter again");
						System.out.println();
						continue;
					}
				}
			}

			while (true) {
				System.out.println("Do you still want add condiment? (Y/N)");
				String ans2 = scanner.next();
				if (ans2.equals("N"))
					break;
				else if (ans2.equals("Y")) {
					System.out.println("Please enter your condiment");
					String condiment = scanner.next();
					System.out.println("Please quantity of the condiment");
					int qty = scanner.nextInt();
					switch (condiment) {

					case "Sugar":
						condMap.put("Sugar", qty);
						beverage = new SugarCond(beverage, qty);
						break;
					case "Cream":
						condMap.put("Cream", qty);
						beverage = new Cream(beverage, qty);
						break;
					case "NutraSweet":
						condMap.put("NutraSweet", qty);
						beverage = new NutraSweet(beverage, qty);
						break;
					case "Hazelnut":
						condMap.put("Hazelnut", qty);
						beverage = new HazelnutCond(beverage, qty);
						break;
					default:
						System.out.println("no match");
					}
				} else {
					System.out.print("Incorrect Information. Please enter again");
					System.out.println();
				}
			}

			System.out.println(beverage.getRecipe());
			/*
			 * DrinkType beverage3 = new Latte(); beverage3 = new SoyMilk(beverage3);
			 * beverage3 = new SugarIng(beverage3); beverage3 = new SoyMilk(beverage3);
			 * beverage3 = new HazelnutCond(beverage3); beverage3 = new
			 * SugarCond(beverage3); beverage3 = new Cream(beverage3);
			 * System.out.println(beverage3.getRecipe());
			 */
			
			Random random = new Random();
			int temp = random.nextInt(3 - 1 + 1) + 1;
			String ele = null;
			if (temp == 1) {
				status = 1;
				if (condMap.size() != 0) {
					for (String key : condMap.keySet()) {
						ele = key;
					}
					error = "Out of " + ele + ", drink cancelled";
				}

				else if (ingreMap.size() != 0) {
					for (String key : ingreMap.keySet()) {
						ele = key;
					}
					error = "Out of " + ele + ", drink cancelled";
				}

				else {
					status = 0;
				}

			} else if (temp == 2) {
				status = 1;
				error = "Machine jammed";
			} else {
				status = 0;
			}
//			JSONArray responseArrays = new JSONArray();
//			 JSONObject controllerResponse = new JSONObject();
//			  JSONObject orderId = new JSONObject();
//			  try {
//				orderId.put("orderID", orderID);
//				orderId.put("status", 0);
//			  controllerResponse.put("drinkResponse", orderId);
//			 
//			} catch (JSONException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			 
//			 // responseArrays.add(controllerResponse);
//			  try (FileWriter file = new FileWriter("controller-response.json")) {
////				    System.out.print("Hello9");
//		            file.write(responseArrays.toString());
//		            file.flush();
//		            
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
//	 
//	        try (FileWriter file = new FileWriter("order-input.json")) {
//	        	 
//	            file.write(order.toString());
//	            file.flush();
//	 
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
		}
		
	}

}

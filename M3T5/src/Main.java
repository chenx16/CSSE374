import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
import Domain.RecipeOrder;
import Domain.SpecifiedOrder;

public class Main {
	static int orderID = 0;
	static HashMap<String, Integer> condMap;
	static HashMap<String, String> ingreMap;
	static AbstractOrder order;
	public static void main(String[] args) {
		 while(true) {
		condMap = new HashMap<String, Integer>();
		ingreMap = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("System: Start order");
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your zipcode please");
		String zip = scanner.nextLine();
		
		DrinkType beverage = null;
		
		System.out.println("Please type in your drink name:");
		String drinktype = scanner.nextLine();
		System.out.println("Do you want to DIY order (Y/N)");
		String de = scanner.nextLine();
		ArrayList<CondimentDecorator> condiments = new ArrayList<CondimentDecorator>();
		if(de.equals("Y")) {
			 order = new SpecifiedOrder(orderID,address,zip, drinktype, condiments);
			 order.toString();
		}else {
			 order = new RecipeOrder(orderID,address,zip, drinktype, condiments);
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
		
		if(de.equals("Y")) {
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
					continue;}
		}else if(ans1.equals("N")){
			break;
		}
			else {System.out.print("Incorrect Information. Please enter again");
			System.out.println();
			continue;
			}
		}}

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
					beverage = new SugarCond(beverage,qty);
					break;
				case "Cream":
					condMap.put("Cream", qty);
					beverage = new Cream(beverage,qty);
					break;
				case "NutraSweet":
					condMap.put("NutraSweet", qty);
					beverage = new NutraSweet(beverage,qty);
					break;
				case "Hazelnut":
					condMap.put("Hazelnut", qty);
					beverage = new HazelnutCond(beverage,qty);
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
		 DrinkType beverage3 = new Latte(); 
		 beverage3 = new SoyMilk(beverage3);
		 beverage3 = new SugarIng(beverage3); 
		 beverage3 = new SoyMilk(beverage3);
		 beverage3 = new HazelnutCond(beverage3); 
		 beverage3 = new SugarCond(beverage3); beverage3 = new Cream(beverage3);
		 System.out.println(beverage3.getRecipe());
		 */

		 }
	}

}

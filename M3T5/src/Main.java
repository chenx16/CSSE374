import java.util.Scanner;

import Data.Americano;
import Data.Coffee;
import Data.ColumbiaDark;
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

public class Main {

	public static void main(String[] args) {
		 while(true) {
		System.out.println("--------------------------------------------");
		System.out.println("System: Start order");
		DrinkType beverage = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in your drink name:");
		String drinktype = scanner.nextLine();
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

		System.out.println("Please enter your ingredients");
		String ingredient = scanner.nextLine();
		switch (ingredient) {
		case "Soy Milk":
			beverage = new SoyMilk(beverage);
			break;
		case "Whipped Cream":
			beverage = new WhippedCream(beverage);
			break;
		case "Milk":
			beverage = new Milk(beverage);
			break;
		case "Sugar":
			beverage = new SugarIng(beverage);
			break;
		case "Coffee":
			beverage = new Coffee(beverage);
			break;
		case "Pumpkin Spice":
			beverage = new PumpkinSpiceIng(beverage);
			break;
		case "Hazelnut":
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
					beverage = new SoyMilk(beverage);
				} else if (ingredient2.equals("Whipped Cream")) {
					beverage = new WhippedCream(beverage);
				} else if (ingredient2.equals("Milk")) {
					beverage = new Milk(beverage);
				} else if (ingredient2.equals("Sugar")) {
					beverage = new SugarIng(beverage);
				} else if (ingredient2.equals("Coffee")) {
					beverage = new Coffee(beverage);
				} else if (ingredient2.equals("Pumpkin Spice")) {
					beverage = new PumpkinSpiceIng(beverage);
				} else if (ingredient2.equals("Hazelnut")) {
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
		}

		while (true) {
			System.out.println("Do you still want add condiment? (Y/N)");
			String ans2 = scanner.next();
			if (ans2.equals("N"))
				break;
			else if (ans2.equals("Y")) {
				System.out.println("Please enter your condiment");
				String condiment = scanner.next();
				switch (condiment) {
				case "Sugar":
					beverage = new SugarCond(beverage);
					break;
				case "Cream":
					beverage = new Cream(beverage);
					break;
				case "NutraSweet":
					beverage = new NutraSweet(beverage);
					break;
				case "Hazelnut":
					beverage = new Hazelnut(beverage);
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

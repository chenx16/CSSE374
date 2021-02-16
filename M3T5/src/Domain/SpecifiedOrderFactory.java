package Domain;

import java.util.ArrayList;

import Data.CondimentDecorator;

public class SpecifiedOrderFactory extends OrderFactory{
	
	@Override
	public AbstractOrder OrderCoffee(int orderID, String address, String zip, String drinktype, ArrayList<CondimentDecorator> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("You ordered coffee with diy recipe");
		return new SpecifiedOrder(orderID, address, zip, drinktype, arrayList);
	}




//	private static JSONObject Orders = new JSONObject();
//	protected CoffeeMachineController controller;

	
//	public RecipeOrder(int orderID, String street, String zip, String drink, ArrayList<CondimentDecorator> condiments) {
		
		
//		this.controller = new SimpleController(orderID);
//	}



}

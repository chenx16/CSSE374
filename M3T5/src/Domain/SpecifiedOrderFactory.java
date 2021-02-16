package Domain;

import java.util.ArrayList;

import Data.CondimentDecorator;

public class SpecifiedOrderFactory extends OrderFactory{
	
	@Override
	public AbstractOrder OrderCoffee(int orderID, String address,String zip, String drinktype, ArrayList<CondimentDecorator>condiments) {
		// TODO Auto-generated method stub
		System.out.println("You ordered coffee with existing recipe");
		return new RecipeOrder(orderID,address,zip, drinktype, condiments);
		
	}
}

package Domain;

import java.util.ArrayList;

import Data.CondimentDecorator;

public class RecipeOrderFactory extends OrderFactory{


	@Override
	public AbstractOrder OrderCoffee(int orderID, String address, String zip, String drinktype, ArrayList<CondimentDecorator> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("You ordered coffee with diy recipe");
		return new SpecifiedOrder(orderID, address, zip, drinktype, arrayList);
	}


}

package Domain;

import java.util.ArrayList;

import Data.CondimentDecorator;

abstract class OrderFactory {

	public abstract  AbstractOrder OrderCoffee(int orderID, String address, String zip, String drinktype,
			ArrayList<CondimentDecorator> arrayList);
}

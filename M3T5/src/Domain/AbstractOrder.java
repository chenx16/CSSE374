package Domain;

import java.util.ArrayList;

import Data.DrinkType;

public abstract class AbstractOrder {
	 int orderID;
	private DrinkType drinktype;
	
	public abstract double makeCoffee();

}


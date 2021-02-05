package Domain;

import java.util.ArrayList;

import Data.DrinkType;

public abstract class AbstractOrder {
	private int orderID;
	private DrinkType drinktype;
	
	public abstract double makeCoffee();

}


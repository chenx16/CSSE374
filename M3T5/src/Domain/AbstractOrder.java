package Domain;

import java.util.ArrayList;

import Data.DrinkType;

public abstract class AbstractOrder {
	 public int orderID;
	private DrinkType drinktype;
	
	public abstract double makeCoffee();

}


package Domain;

public class RecipeOrderFactory extends OrderFactory{

	@Override
	public AbstractOrder OrderCoffee() {
		// TODO Auto-generated method stub
		System.out.println("You ordered coffee with existing recipe");
		return new RecipeOrder();
	}


}

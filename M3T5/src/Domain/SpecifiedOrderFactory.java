package Domain;

public class SpecifiedOrderFactory extends OrderFactory{

	@Override
	public AbstractOrder OrderCoffee() {
		// TODO Auto-generated method stub
		System.out.println("You ordered coffee with diy recipe");
		return null;
	}

}

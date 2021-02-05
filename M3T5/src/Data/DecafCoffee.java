package Data;

public class DecafCoffee extends IngrendientDecorator {
DrinkType d;
	
	public DecafCoffee (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " +  DecafCoffee Ing";
	}

}

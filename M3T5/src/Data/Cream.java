package Data;

public class Cream extends CondimentDecorator {
DrinkType d;
	
	public Cream (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + 1 Ounce serving Cream";
	}

}

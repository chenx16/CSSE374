package Data;

public class SugarCond extends CondimentDecorator {
DrinkType d;
	
	public SugarCond (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + 1 teaspoon Sugar";
	}

}
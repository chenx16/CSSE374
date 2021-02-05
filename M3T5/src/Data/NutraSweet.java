package Data;

public class NutraSweet extends CondimentDecorator {
DrinkType d;
	
	public NutraSweet (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + 1 teaspoon NutraSweet";
	}

}

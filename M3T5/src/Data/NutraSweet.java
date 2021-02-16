package Data;

public class NutraSweet extends CondimentDecorator {
DrinkType d;
int qty;
String name;
	public NutraSweet (DrinkType d, int qty) {
		this.d = d;
		this.qty = qty;
		this.name = "NutraSweet";
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + 1 teaspoon NutraSweet";
	}

}

package Data;

public class Cream extends CondimentDecorator {
DrinkType d;
int qty;
String name;
	public Cream (DrinkType d, int qty) {
		this.d = d;
		this.qty = qty;
		this.name = name;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() +" + "+ this.qty + " Ounce serving Cream";
	}

}

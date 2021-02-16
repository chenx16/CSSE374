package Data;

public class HazelnutCond extends CondimentDecorator  {
DrinkType d;
int qty;
String name;
	public HazelnutCond (DrinkType d, int qty) {
		this.d = d;
		this.qty = qty;
		this.name = "Hazelnut";
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() +" + "+ this.qty + " "+ "squirt Hazelnut";
	}

}

package Data;

public class HazelnutCond extends CondimentDecorator {
DrinkType d;
	
	public HazelnutCond (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + 1 squirt Hazelnut";
	}

}

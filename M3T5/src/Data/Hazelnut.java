package Data;

public class Hazelnut extends IngrendientDecorator {
DrinkType d;
	
	public Hazelnut (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + Hazelnut Ing";
	}

}

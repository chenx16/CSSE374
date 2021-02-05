package Data;

public class Milk extends IngrendientDecorator {
DrinkType d;
	
	public Milk (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " +  Milk Ing";
	}
}

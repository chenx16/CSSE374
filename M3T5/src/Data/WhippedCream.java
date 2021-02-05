package Data;

public class WhippedCream extends IngrendientDecorator {
DrinkType d;
	
	public WhippedCream (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " +  WhippedCream Ing";
	}

}

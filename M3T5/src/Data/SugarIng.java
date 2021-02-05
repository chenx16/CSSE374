package Data;

public class SugarIng extends IngrendientDecorator {
DrinkType d;
	
	public SugarIng (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + Sugar Ing";
	}
}

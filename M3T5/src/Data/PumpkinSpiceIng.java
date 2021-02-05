package Data;

public class PumpkinSpiceIng  extends IngrendientDecorator {
DrinkType d;
	
	public PumpkinSpiceIng (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + PumpkinSpice Ing";
	}

}

package Data;

public class SoyMilk extends IngrendientDecorator {
	DrinkType d;
	
	public SoyMilk (DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " +  SoyMilk Ing";
	}

}

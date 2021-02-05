package Data;

public class Nutmeg  extends IngrendientDecorator {
DrinkType d;
	
	public  Nutmeg(DrinkType d) {
		this.d = d;
	}

	@Override
	public String getRecipe() {
		// TODO Auto-generated method stub
		return d.getRecipe() + " + Nutmeg Ing";
	}

}
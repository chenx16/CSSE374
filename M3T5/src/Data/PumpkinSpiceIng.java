package Data;

 

public class PumpkinSpiceIng  extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public PumpkinSpiceIng (DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = " Pumpkin Spice";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ "  + PumpkinSpice Ing";
    }

 

}
package Data;

 

public class DecafCoffee extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public DecafCoffee (DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = "Decaf Coffee";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ " +  DecafCoffee Ing";
    }

 

}

 
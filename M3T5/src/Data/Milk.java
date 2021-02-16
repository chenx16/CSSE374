package Data;

 

public class Milk extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public Milk (DrinkType d) {
        this.d = d;
        this.method = "steam";
        this.name = "Milk";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ " + Milk Ing";
    }
}

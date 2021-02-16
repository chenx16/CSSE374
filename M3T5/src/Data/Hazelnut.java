package Data;

 

public class Hazelnut extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public Hazelnut (DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = "Hazelnut";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ " + Hazelnut Ing";
    }

 

}
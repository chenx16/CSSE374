package Data;

 

public class SugarIng extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public SugarIng (DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = "Sugar";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ " + Sugar Ing";
    }
}
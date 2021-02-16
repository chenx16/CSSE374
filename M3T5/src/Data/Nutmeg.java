package Data;

 

public class Nutmeg  extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public  Nutmeg(DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = "Nutmeg";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+ " + Nutmeg Ing";
    }

 

}
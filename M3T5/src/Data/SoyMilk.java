package Data;

public class SoyMilk extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public SoyMilk (DrinkType d) {
        this.d = d;
        this.method = "steam";
        this.name = "Soy Milk";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+  " +  SoyMilk Ing";
    }

 

}
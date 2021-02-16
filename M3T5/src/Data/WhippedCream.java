package Data;

 

public class WhippedCream extends IngrendientDecorator {
    DrinkType d;
    String method;
    String name;
    public WhippedCream (DrinkType d) {
        this.d = d;
        this.method = "top";
        this.name = "Whipped Cream";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() + " " + this.method+  " +  WhippedCream Ing";
    }

 

}
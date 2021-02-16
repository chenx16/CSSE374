package Data;

public class Coffee extends IngrendientDecorator {
DrinkType d;
String method;
String name;
    public  Coffee (DrinkType d) {
        this.d = d;
        this.method = "add";
        this.name = "Coffee";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() +" " + this.method +" Coffee Ing";
    }

 

}
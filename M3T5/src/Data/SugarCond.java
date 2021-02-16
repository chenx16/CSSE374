package Data;

 

public class SugarCond extends CondimentDecorator {
DrinkType d;
int qty;
String name;
    
    public SugarCond (DrinkType d, int qty) {
        this.d = d;
        this.qty = qty;
        String name = "Sugar";
    }

 

    @Override
    public String getRecipe() {
        // TODO Auto-generated method stub
        return d.getRecipe() +" + "+ this.qty + " "+ "teaspoon Sugar";
    }

 

}
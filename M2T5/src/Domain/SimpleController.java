package Domain;
import java.util.ArrayList;

public class SimpleController extends CoffeeMachineController {
	produceDrinkBehavior pb;
	
	public SimpleController(int id) {
		super(id, "Simple", -1);
		this.pb = new SimpleProduce();
		// TODO Auto-generated constructor stub
	}
	
	


}

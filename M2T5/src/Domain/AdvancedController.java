package Domain;
import java.util.ArrayList;

public class AdvancedController extends CoffeeMachineController {
	produceDrinkBehavior pb;
	
	public AdvancedController(int id) {
		super(id, "Automated", -1);
		this.pb = new AdvancedProduce();
		// TODO Auto-generated constructor stub
	}

	
}

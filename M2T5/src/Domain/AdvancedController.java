package Domain;
import java.util.ArrayList;

public class AdvancedController extends CoffeeMachineController {
	public produceDrinkBehavior pb;
	
	public AdvancedController(int id, produceDrinkBehavior pb) {
		super(id, "Automated", -1);
		this.pb = pb;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
}

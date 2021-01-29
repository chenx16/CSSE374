package Domain;
import java.util.ArrayList;

public class SimpleController extends CoffeeMachineController {
	public produceDrinkBehavior pb;
	
	public SimpleController(int id,produceDrinkBehavior pb) {
		super(id, "Simple", -1);
		this.pb = pb;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	


}

import java.util.ArrayList;
import java.util.Observable;

public abstract class CoffeeMachineController extends Observable{
	produceDrinkBehavior producedrink;
	int id;
	String type;
	int status;
	ArrayList<Order> orders = new ArrayList<>();
	
	public CoffeeMachineController(int id, String type, int status) {
		this.id = id;
		this.type = type;
		this.status = status;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}

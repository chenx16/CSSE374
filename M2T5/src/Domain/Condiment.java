package Domain;
import java.util.ArrayList;

public class Condiment {
	String name;
	int qty;
	
	public Condiment(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	public String getName() {
		return this.name;
	}
	
	public int getQty() {
		return this.qty;
	}
}


public class AppResponse extends Response{
	private int orderID;
	private int coffee_machine_id;
	private int status;
	private final static String finishMessage = "Your coffee has been prepared with your desired options.";
	private String errorMessage;
	private final static String cancelMessage = "Your coffee order has been cancelled.";
	
	AppResponse(int orderId, int status, int coffee_machine_id, String errM) {
		super(orderId, status);
		// TODO Auto-generated constructor stub
		this.coffee_machine_id = coffee_machine_id;
		
	}
	
	
	
	
}

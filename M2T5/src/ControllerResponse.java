
public class ControllerResponse {
	private int orderID;
	private int coffee_machine_id;
	private int status;
	private String errorMessage;
	
	public ControllerResponse(int orderId, int status, int errCode) {
        super();
        this.errCode = errCode;
        switch (errCode) {
            case 2:
                this.errDesc = "Out of milk, drink canceled";
                break;
            case 26:
                this.errDesc = "Machine jammed";
                break;
            default:
                break;
        }
    }
   
}

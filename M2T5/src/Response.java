
public abstract class Response {
	private int orderId;
    private int status;
    
    Response(int orderId, int status){
        this.orderId = orderId;
        this.status = status;
    }
    public int getOrderId() {
        return orderId;
    }
    
    public int getStatus() {
        return status;
    }
}

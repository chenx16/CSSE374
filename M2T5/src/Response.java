public abstract class Response {
	private int orderId;
    private int status;
    private int coffeemachine;
    String statemsg;
    String errmsg;
    
    public Response(int orderId, int status){
        this.orderId = orderId;
        this.status = status;
        this.coffeemachine = -1;
        this.statemsg = null;
        this.errmsg = null;
    }
    
    public Response(int orderId, int status, int coffeemachineID, String statemsg, String errmsg){
        this.orderId = orderId;
        this.status = status;
        this.coffeemachine = coffeemachineID;
        this.statemsg = statemsg;
        this.errmsg = errmsg;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public int getStatus() {
        return status;
    }
    
    public String toString() {
       if(this.coffeemachine ==-1) {
    	   return "UserResponse{" +
                   "orderID=" + orderId +
                   ", status=" + status +
                   '}';
       }
       else {
    	   return "UserResponse{" +
                   "orderID=" + orderId +
                   ", coffee_machine_id=" + coffeemachine +
                   ", status=" + status +
                   ", status-message='" + statemsg + '\'' +
                   ", error-message='" + errmsg + '\'' +
                   '}';
       }
    }
    
}

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class Test {
    private final String ControllerResponse = "controller-response.json";
    private final String AppResponse = "App-response.json";
    private final String Command = "Command_stream.json";
    private final String OrderInput = "order-input.json";
    

	@org.junit.jupiter.api.Test
	void test() {
	       System.out.println();
	       System.out.println();
	       System.out.println("Simlulated Test for ordering coffee......");
	       System.out.println();
	       testControllerOutput();
	       System.out.println();
	       testOrderOutput();
	       System.out.println();
	       testCommandOutput();
	       System.out.println();
	       testAppOutput();

	}
	
	
	void testControllerOutput() {
		JSONParser jsonParser = new JSONParser();

	       try (FileReader reader = new FileReader(ControllerResponse)){	            
	          Object obj = jsonParser.parse(reader);
	          JSONArray subjects = (JSONArray)obj;
	          System.out.println("drinkResponse:");
	          Iterator iterator = subjects.iterator();
	          //while (iterator.hasNext()) {
	           //System.out.println(iterator.next());
	          //}
//	          subjects.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
	          for(Object C : subjects) {
	        	  parseConObject( (JSONObject) C );
	          }
	       } catch(Exception e) {
	          e.printStackTrace();
	       }
	}
	
	private static void parseConObject(JSONObject controller) 
    {

        //JSONObject controllerobj = (JSONObject) controller.get("drinkResponse");
        JSONObject a = (JSONObject) controller.get("drinkResponse");
		System.out.println("user-response: " +a);
         
    }
	
	void testOrderOutput() {
		JSONParser jsonParser = new JSONParser();

	       try (FileReader reader = new FileReader(OrderInput)){	            
	          Object obj = jsonParser.parse(reader);
	          JSONArray subjects = (JSONArray)obj;
	          System.out.println("OrderInput:");
	          Iterator iterator = subjects.iterator();
	          //while (iterator.hasNext()) {
	          //   System.out.println(iterator.next());
	         // }
	          for(Object C : subjects) {
	        	  parseOObject( (JSONObject) C );
	        	  System.out.println();
	          }
	       } catch(Exception e) {
	          e.printStackTrace();
	       }
	}
	
	
	private void parseOObject(JSONObject c) {


        JSONObject add = (JSONObject) c.get("order");    
        System.out.println("address: " +add);

	}


	void testCommandOutput() {
		JSONParser jsonParser = new JSONParser();

	       try (FileReader reader = new FileReader(Command)){	            
	          Object obj = jsonParser.parse(reader);
	          JSONArray subjects = (JSONArray)obj;
	          System.out.println("Command:");
	          Iterator iterator = subjects.iterator();
	          //while (iterator.hasNext()) {
	          //   System.out.println(iterator.next());
	          //}
	          for(Object C : subjects) {
	        	  parseCommandObject( (JSONObject) C );
	        	 // System.out.println();
	          }
	       } catch(Exception e) {
	          e.printStackTrace();
	       }
	}
	
	private void parseCommandObject(JSONObject c) {
		JSONObject a = (JSONObject) c.get("command");
		System.out.println("command: " +a);
		
   
		
	}


	void testAppOutput() {
		JSONParser jsonParser = new JSONParser();

	       try (FileReader reader = new FileReader(AppResponse)){	            
	          Object obj = jsonParser.parse(reader);
	          JSONArray subjects = (JSONArray)obj;
	          System.out.println("AppResponse:");
	          Iterator iterator = subjects.iterator();
	          //while (iterator.hasNext()) {
	          //   System.out.println(iterator.next());
	          //}
	          for(Object C : subjects) {
	        	  parseAObject( (JSONObject) C );
	        	  System.out.println();
	          }
	       } catch(Exception e) {
	          e.printStackTrace();
	       }
	}
	
	private void parseAObject(JSONObject c) {
		// TODO Auto-generated method stub
		JSONObject a = (JSONObject) c.get("user-response");
		System.out.println("user-response: " +a);
		
      
	}


}
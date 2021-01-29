import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import com.github.cliftonlabs.json_simple.JsonArray;

import Domain.AdvancedController;
import Domain.SimpleController;

public class Main {
	
//	private static HashMap<Integer, Integer> orders = new HashMap<>();
//	private static int orderId = 1;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 AdvancedController ac = new AdvancedController(1);
		 SimpleController sc = new SimpleController(2);
		 while(true) {
			   System.out.println("--------------------------------------------");
			   System.out.println("System: Start order");
//			   System.out.println("OrderId"+ orderId);
			   
			   System.out.println("Simple Machine Press 1");
			   System.out.println("Advanced Machine Press 2");
			   int selection = scanner.nextInt();
			   if(selection == 2) {
				   ac.askForOrder();
//				   System.out.print("Hello1");
				   ac.pushCommand();
//				   System.out.print("Hello4");
				  ac.importResponse();
//				  System.out.print("Hello5");
				  ac.userResponse();
//				  System.out.print("Hello6");
			   }
			   else if(selection == 1) {
				   sc.askForOrder();
				   sc.pushCommand();
				   sc.importResponse();
				  
				   sc.userResponse();
			   }
			  
//			   orderId = orderId + 1;
			  
			   
			   System.out.println("Your coffee has been prepared with your desired options.");
//			   System.out.println("System: Reason: Out of milk, drink cancelled.");
			   

			}
	}
	  
}


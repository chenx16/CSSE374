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
import Presentation.Server;

public class Main {

	public static void main(String[] args) {
		 Server server = new Server();
		 while(true) {
			   System.out.println("--------------------------------------------");
			   System.out.println("System: Start order");
			   server.run();
			  

			   

			}
	}
	  
}


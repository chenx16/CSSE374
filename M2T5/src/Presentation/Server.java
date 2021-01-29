package Presentation;

import java.util.Scanner;

import Domain.AdvancedController;
import Domain.AdvancedProduce;
import Domain.SimpleController;
import Domain.SimpleProduce;
import Domain.produceDrinkBehavior;

public class Server {
	produceDrinkBehavior pba = new AdvancedProduce();
	produceDrinkBehavior pbs = new SimpleProduce();
	AdvancedController ac = new AdvancedController(1,pba);
	 SimpleController sc = new SimpleController(2,pbs);
	 
	 public void run() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Simple Machine Press 1");
		   System.out.println("Advanced Machine Press 2");
		   int selection = scanner.nextInt();
		   if(selection == 2) {
			   ac.askForOrder();
//			   System.out.print("Hello1");
			   ac.pushCommand();
//			   System.out.print("Hello4");
			  ac.importResponse();
//			  System.out.print("Hello5");
			  ac.userResponse();
//			  System.out.print("Hello6");
			  ac.pb.producedrink();
		   }
		   else if(selection == 1) {
			   sc.askForOrder();
			   sc.pushCommand();
			   sc.importResponse();
			  
			   sc.userResponse();
			   sc.pb.producedrink();
		   }
		   System.out.println("Your coffee has been prepared with your desired options.");
	 }
}

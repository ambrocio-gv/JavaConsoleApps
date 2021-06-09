import java.util.Scanner;
/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 21, 2020
**/


/*
 This Program creates a new TicketScanner object, uses a another class to access its methods
 and prints out the answers of these methods.
 
 */

public class ThemeParkConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isAllAccess = true;
		double money = 0;
		
		TicketScanner ts1 = new TicketScanner();
		TicketScanner ts2 = new TicketScanner();
		TicketScanner ts3 = new TicketScanner();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
	         
	         String TicketScannerorQuit = scanner.next();
	         if (TicketScannerorQuit.equals("quit"))
	         {
	        	 System.out.println("----------------- MY THEME PARK SALES REPORT -----------------"); 
	        	 System.out.println("|   Scanner | Collection | SAT | AAT | REJECT | RC | FW | CL |");
	        	 System.out.println("--------------------------------------------------------------");
	        	 System.out.printf("| Scanner 1 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts1.getCollections(),ts1.getSingleAccess(),ts1.getAllAccess(),ts1.getRejects(),ts1.getRollerCoaster(),ts1.getFerrisWheel(),ts1.getCarousel());
	        	 System.out.printf("| Scanner 2 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts2.getCollections(),ts2.getSingleAccess(),ts2.getAllAccess(),ts2.getRejects(),ts2.getRollerCoaster(),ts2.getFerrisWheel(),ts2.getCarousel());
	        	 System.out.printf("| Scanner 3 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts3.getCollections(),ts3.getSingleAccess(),ts3.getAllAccess(),ts3.getRejects(),ts3.getRollerCoaster(),ts3.getFerrisWheel(),ts3.getCarousel());
	        	 System.out.println("--------------------------------------------------------------");
	        	        	 
	        	 
	        	 
	        	 break;
	         }	         
	         String ride = scanner.next();	        
	         
	         String pass = scanner.next();
	         if (pass.equals("single")) {
	        	 isAllAccess = false;
	        	
	         }
	         else if(pass.equals("all")) {
	        	 isAllAccess = true;	        	
	         }
	         
	         
	         if (scanner.hasNextDouble())
	         {		            
		            money = scanner.nextDouble();			        
		     }
	         
	         if((TicketScannerorQuit.equals("ts1"))){
	        	
	        	 ts1.scanTicket(ride, isAllAccess, money);        	
	        	 
	         }
	         else if((TicketScannerorQuit.equals("ts2"))){
	        	 ts2.scanTicket(ride, isAllAccess, money);
	         }
	         else if((TicketScannerorQuit.equals("ts3"))){
	        	 ts3.scanTicket(ride, isAllAccess, money);
	         }
	         
	      }

	      // close the scanner
	      scanner.close();
		
		
		
		
		
		
		
		
		
	}

}

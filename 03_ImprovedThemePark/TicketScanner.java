/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 27, 2020
**/

/*
 This Program is implements a class that simulates a Ticket Scanner object
 with methods to be used by another program.
*/

public class TicketScanner {
	
	
	int TotalSingleTickets;
	int TotalAllTickets;
	int TotalRejectedTickets;
	int TotalRollerCoaster;
	int TotalFerrisWheel;
	int TotalCarousel;
	
	double Change;
	double Payment;
	double TotalAmountOfPayments;
	
	
	public TicketScanner() {
		//initializes the values of all instance fields
		
		
	}	
	
	public void scanTicket(Attraction a, Ticket t) {
		//determines which attraction the customer would like to go on
		//determines if the ticket has enough credit to pay for the attraction
		//update all access credit and print out
		//do not update single access
		//update at each iteration single, all, rejects
		//print success or rejected for each corresponding attraction
		//parameter a is an instance of Attraction
		//parameter t is an instance of Ticket		
		
				
		 if(a.getName() == "Roller Coaster") {
			if(t.isAllAccess() == true && t.getCredit() >= a.getCost()) {
				
				t.updateCredit(a.getCost());
				System.out.println("Enjoy your ride on the Roller Coaster.");
				System.out.printf("You have PHP %5.2f remaining.\n", t.getCredit());
				
				Payment = a.getCost();
				TotalAllTickets +=1;
				TotalRollerCoaster +=1;
				
			}
			
			else if(t.isAllAccess() == true && t.getCredit() < a.getCost()) {
				System.out.println("Ticket rejected. Insufficient credit for the Roller Coaster.");
				
				Payment = 0;
				TotalAllTickets +=1;
				TotalRejectedTickets +=1;
			}
			
			
			else if(t.isAllAccess() == false && t.getCredit() >= a.getCost() ){
				
				System.out.println("Enjoy your ride on the Roller Coaster.");
				
				Payment = a.getCost();
				TotalSingleTickets += 1;
				TotalRollerCoaster +=1;
				
			}
			else if(t.isAllAccess() == false && t.getCredit() < a.getCost()){
				
				System.out.println("Ticket rejected. Insufficient credit for the Roller Coaster.");	
				
				Payment = 0;
				TotalRejectedTickets +=1;				
			}
		 }	
		
		////
		else if(a.getName() == "Ferris Wheel") {
			if(t.isAllAccess() == true && t.getCredit() >= a.getCost()) {
				
				t.updateCredit(a.getCost());
				
				System.out.println("Enjoy your ride on the Ferris Wheel.");
				System.out.printf("You have PHP %5.2f remaining.\n", t.getCredit());
				
				Payment = a.getCost();
				TotalAllTickets +=1;
				TotalFerrisWheel +=1;
				
			}
			
			else if(t.isAllAccess() == true && t.getCredit() < a.getCost()) {
				
				System.out.println("Ticket rejected. Insufficient credit for the Ferris Wheel.");
				
				Payment = 0;
				TotalAllTickets +=1;
				TotalRejectedTickets +=1;
			}
			
			
			else if(t.isAllAccess() == false && t.getCredit() >= a.getCost() ){
				
				System.out.println("Enjoy your ride on the Ferris Wheel.");
				
				Payment = a.getCost();
				TotalSingleTickets += 1;
				TotalFerrisWheel +=1;
				
			}
			else if(t.isAllAccess() == false && t.getCredit() < a.getCost()){
				
				System.out.println("Ticket rejected. Insufficient credit for the Ferris Wheel.");	
				
				Payment = 0;
				TotalRejectedTickets +=1;				
			}
		}			
		
		////
		else if(a.getName() == "Carousel") {
			if(t.isAllAccess() == true && t.getCredit() >= a.getCost()) {
				
				t.updateCredit(a.getCost());
				System.out.println("Enjoy your ride on the Carousel.");
				System.out.printf("You have PHP %5.2f remaining.\n", t.getCredit());
				
				Payment = a.getCost();
				TotalAllTickets +=1;
				TotalCarousel +=1;
				
			}
			
			else if(t.isAllAccess() == true && t.getCredit() < a.getCost()) {
				System.out.println("Ticket rejected. Insufficient credit for the Carousel.");
				
				Payment = 0;
				TotalAllTickets +=1;
				TotalRejectedTickets +=1;
			}
			
			
			else if(t.isAllAccess() == false && t.getCredit() >= a.getCost() ){

				System.out.println("Enjoy your ride on the Carousel.");
				
				Payment = a.getCost();
				TotalSingleTickets += 1;
				TotalCarousel +=1;
				
			}
			else if(t.isAllAccess() == false && t.getCredit() < a.getCost()){
				
				System.out.println("Ticket rejected. Insufficient credit for the Carousel.");	
				
				Payment = 0;
				TotalRejectedTickets +=1;				
			}
		}
		
		TotalAmountOfPayments = TotalAmountOfPayments + Payment;
		
		
	}
	
	public double getCollection() {
		//returns the total amount of payments collected by the ticket scanner
		return TotalAmountOfPayments;
	}
	
	public int getSingleAllAccess() {
		//returns the total number of single-access tickets that have been accepted by the ticket scanner
		return TotalSingleTickets;
	}
	
	public int getAllAccess() {
		//returns the total number of all-access tickets that have been accepted by the ticket scanner
		return TotalAllTickets;
	}
	
	public int getRejects() {
		//returns the total number of tickets (of either type) that have been rejected by the ticket scanner
		return TotalRejectedTickets;
	}
	
	public int getRollerCoaster() {
		//returns the total number of customers who rode the Roller Coaster through the ticket scanner
		return TotalRollerCoaster;
	}

	public int getFerrisWheel() {
		//returns the total number of customers who rode the Ferris Wheel through the ticket scanner
		return TotalFerrisWheel;
	}

	public int getCarousel() {
		//returns the total number of customers who rode the Carousel through the ticket scanner
		return TotalCarousel;
	}
}

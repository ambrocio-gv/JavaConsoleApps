
/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 21, 2020
**/

/*
 This Program is implements a class that simulates a Ticket Scanner
 with methods to be used by another program.
 */

public class TicketScanner {
	double AllAccessTicketPrice;
	double RollerCoasterCost;
	double FerrisWheelCost;
	double CarouselCost;
	int TotalSingleTickets;
	int TotalAllTickets;
	int RejectedAllTickets;
	int TotalRollerCoaster;
	int TotalFerrisWheel;
	int TotalCarousel;
	
	double Change;
	double Payment;
	double TotalAmountOfPayments;
	
	
	
	public TicketScanner()
	{
		//initializes the values of the instance fields/attributes
		AllAccessTicketPrice = 500;		
		RollerCoasterCost = 125.25;
		FerrisWheelCost = 81.81;
		CarouselCost = 49.49;
		
		
		
		
	}
	
	public void scanTicket(String attraction, boolean isAll, double credit)
	{
		//determines attraction
		//collects payment for the attraction based on ticket
		//prints <true> when customer enters which attraction
		//prints <false> when customer unable which attraction
		//parameter attraction = which attraction
		//parameter isAll = true when customer is using all-access ticket
		//parameter is  credit = amount of credits available on the ticket
				
		
		
		if ((attraction.equals("RollerCoaster")))
		{
			Change = credit - RollerCoasterCost;
			
			if (isAll == false) {
				System.out.println("Enjoy your ride on the Roller Coaster.");
				
				Payment = RollerCoasterCost;
				TotalSingleTickets += 1;
				TotalRollerCoaster +=1;
			}
			
			else if (isAll == true && Change >= 0) {
				System.out.println("Enjoy your ride on the Roller Coaster.");
				
				Payment = RollerCoasterCost;
				TotalAllTickets +=1;
				TotalRollerCoaster +=1;
			}
			
			else {
				System.out.println("Ticket rejected. Insufficient credit for the Roller Coaster.");
				
				Payment = 0;
				TotalAllTickets +=1;
				RejectedAllTickets +=1;
			}
			
			
			
		}
		
		else if (attraction.equals("Carousel")) 
		{			
			Change = credit - CarouselCost;
			
			if (isAll == false) {
				System.out.println("Enjoy your ride on the Carousel.");
				
				Payment = CarouselCost;
				TotalSingleTickets += 1;
				TotalCarousel +=1;
			}
			
			else if (isAll == true && Change >= 0) {
				System.out.println("Enjoy your ride on the Carousel.");
				
				Payment = CarouselCost;
				TotalAllTickets +=1;
				TotalCarousel +=1;
			}
			
			else {
				System.out.println("Ticket rejected. Insufficient credit for the Carousel.");
				
				Payment = 0;
				TotalAllTickets +=1;
				RejectedAllTickets +=1;
			}
			
			
			
		}
		else if (attraction.equals("FerrisWheel")) 
		{			
			Change = credit - FerrisWheelCost;			

			
			if (isAll == false) {
				System.out.println("Enjoy your ride on the Ferris Wheel.");
				
				Payment = FerrisWheelCost;
				TotalSingleTickets += 1;
				TotalFerrisWheel +=1;
			}
			
			else if (isAll == true && Change >= 0) {
				System.out.println("Enjoy your ride on the Ferris Wheel.");
				
				Payment = FerrisWheelCost;
				TotalAllTickets +=1;
				TotalFerrisWheel +=1;
			}
			
			else {
				System.out.println("Ticket rejected. Insufficient credit for the Ferris Wheel.");
				
				Payment = 0;
				TotalAllTickets +=1;
				RejectedAllTickets +=1;
			}
			
			
			
			
		}
		
		TotalAmountOfPayments = TotalAmountOfPayments + Payment;
		
		
	}
	
	public double getCollections() {
		//returns total amount of payments collected by the ticket scanner
		return TotalAmountOfPayments;
		
	}
	
	public int getSingleAccess() {
		//returns total number of single-access tickets that have been scanned by the ticket scanner
		return TotalSingleTickets;
		
	}
	
	public int getAllAccess() {
		//returns total number of all-access tickets that have been scanned by the ticket scanner
		return TotalAllTickets;
		
	}
	
	public int getRejects() {
		//returns total number of all-access tickets that have been rejected by the ticket scanner
		return RejectedAllTickets;
	}
	
	
	public int getRollerCoaster() {
		//returns the total number of customer who rode the Roller Coaster through the ticket scanner
		return TotalRollerCoaster;
		
	}
	
	public int getFerrisWheel() {
		//returns the total number of customers who rode the Ferris Wheel through the ticket scanner		
		return TotalFerrisWheel;
		
		
	}
	
	public int getCarousel() {
		//returns the total number of customer who rode the Carousel through the ticket scanner
		return TotalCarousel;
		
		
	}
	
	
	
	
	
	
	
	
}

/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 27, 2020
**/

/*
 This Program is implements a class that simulates a Ticket object
 with methods to be used by another program.
*/

public class Ticket {
	
	boolean isAllAccess;	
	double AllAccessTicket;
	double RollerCoasterTicket;
	double FerrisWheelTicket;
	double CarouselTicket;
	double Credit;
	
	public Ticket(double c) {
		//initializes the values of all instance fields
		//when the value of the parameter is 500.00, the Ticket is an all-access ticket, otherwise, it is a single-access ticket
		
		AllAccessTicket = 500;
		RollerCoasterTicket = 125.25;
		FerrisWheelTicket = 81.81;
		CarouselTicket = 49.49;		
		
		
		if (c == AllAccessTicket) {
			Credit = AllAccessTicket;		
			isAllAccess = true;
			
		}
		
		else if(c == CarouselTicket) {
			
			Credit = CarouselTicket;
			isAllAccess = false;
		}
		
		else if(c == RollerCoasterTicket) {
			
			Credit = RollerCoasterTicket;
			isAllAccess = false;
		}
		
		else if(c == FerrisWheelTicket) {
			
			Credit = FerrisWheelTicket;
			isAllAccess = false;
		}		
	}
	
	public double getCredit() {
		//returns the amount stored on the ticket
		return Credit;
	}
	
	public boolean isAllAccess() {
		//returns true if the ticket is an all-access ticket, otherwise, it returns false
		return isAllAccess;
	}

	public void updateCredit(double amt) {
		//updates the amount stored on the ticket to the value of the parameter		
		Credit = Credit - amt;				
	}
}

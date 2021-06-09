/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 27, 2020
**/

/*
This Program creates a multiple objects of Ticket scanner, attraction and ticket, uses a another class to access its methods
 and prints out the answers of these methods.
*/

	public class ThemePark {

		public static void main( String[] args ) {
			
			// place your code here
			
			TicketScanner[] ts;
			Attraction[] atn;
			Ticket[] tks;
			
			ts = new TicketScanner[5];
			atn = new Attraction[3];
			tks = new Ticket[25];
	
			for( int i = 0; i < ts.length; i++ ) {
				ts[i] = new TicketScanner();				
			}
			
			atn[0] = new Attraction("Roller Coaster", 125.25);
			atn[1] = new Attraction("Ferris Wheel", 81.81);
			atn[2] = new Attraction("Carousel", 49.49);		

		/*
			This loop creates multiple instances of Ticket
			and places them in the array of Tickets.
		*/
		for( int i = 0; i < tks.length; i++ ) {
			if( i % 4 == 0 )
				tks[i] = new Ticket( 500.00 );
			else if( i % 4 == 1 )
				tks[i] = new Ticket( 49.49 );
			else if( i % 4 == 2 )
				tks[i] = new Ticket( 81.81 ); 
			else
				tks[i] = new Ticket( 125.25 );	
		}
		
		/*
			This loop performs multiple scanTicket operations on
			specific TicketScanners.
			All tickets are scanned in this loop.
		*/

		for( int i = tks.length-1; i >= 0; i-- )
			ts[i%ts.length].scanTicket( atn[i%atn.length], tks[i] );
		
		/*
			This loop performs multiple scanTicket operations on
			specific TicketScanners.
			Only the all-access tickets are scanned again in this loop.
		*/

		for( int i = 0; i < tks.length; i++ ) {
			if( tks[i].isAllAccess() )
				ts[i%ts.length].scanTicket( atn[i%atn.length], tks[i] );
		}
			
			// place more of your code here
			
			 System.out.println("----------------- MY THEME PARK SALES REPORT -----------------"); 
        	 System.out.println("|   Scanner | Collection | SAT | AAT | REJECT | RC | FW | CL |");
        	 System.out.println("--------------------------------------------------------------");
        	 System.out.printf("| Scanner 1 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts[0].getCollection(),ts[0].getSingleAllAccess(),ts[0].getAllAccess(),ts[0].getRejects(),ts[0].getRollerCoaster(),ts[0].getFerrisWheel(),ts[0].getCarousel());
        	 System.out.printf("| Scanner 2 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts[1].getCollection(),ts[1].getSingleAllAccess(),ts[1].getAllAccess(),ts[1].getRejects(),ts[1].getRollerCoaster(),ts[1].getFerrisWheel(),ts[1].getCarousel());
        	 System.out.printf("| Scanner 3 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts[2].getCollection(),ts[2].getSingleAllAccess(),ts[2].getAllAccess(),ts[2].getRejects(),ts[2].getRollerCoaster(),ts[2].getFerrisWheel(),ts[2].getCarousel());
        	 System.out.printf("| Scanner 4 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts[3].getCollection(),ts[3].getSingleAllAccess(),ts[3].getAllAccess(),ts[3].getRejects(),ts[3].getRollerCoaster(),ts[3].getFerrisWheel(),ts[3].getCarousel());
        	 System.out.printf("| Scanner 5 | PHP %5.2f |   %d |   %d |      %d |  %d |  %d |  %d |\n", ts[4].getCollection(),ts[4].getSingleAllAccess(),ts[4].getAllAccess(),ts[4].getRejects(),ts[4].getRollerCoaster(),ts[4].getFerrisWheel(),ts[4].getCarousel());
        	 System.out.println("--------------------------------------------------------------");
		}
		
		
		
	}


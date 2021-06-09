/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 27, 2020
**/

/*
 This Program is implements a class that simulates an Attraction object
 with methods to be used by another program.
*/

public class Attraction {
	
	
	
	private double AttractionCost;
	private String AttractionName;
	

	
	public Attraction(String n, double c) {
		//initializes the values of all instance fields with the values provided in the parameters
				
		AttractionName = n;
		AttractionCost = c;	
		
	}
	
	public String getName() {
		//returns the name of the attraction
		return AttractionName;
	}
	
	public double getCost() {
		//returns the cost of the attraction
		return AttractionCost;
	}


	
	
	
}





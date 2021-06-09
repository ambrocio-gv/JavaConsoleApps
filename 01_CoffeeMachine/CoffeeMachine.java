/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 11, 2020
**/

/*
This Program is implements a class that simulates a Coffee Machine
 with methods to be used by another program.
*/

public class CoffeeMachine {
	double AmountOfCoffeeInMachine;
	double AmountOfMoneyCollected;	
	double CostOfEachCup;	
	double AmountInCup = 200;
	int NumCupsSold;
	
	public CoffeeMachine() 
	{
		//initializes the values of the instance fields/attributes
		AmountOfCoffeeInMachine = 6.5;
		AmountOfMoneyCollected = 0;
		NumCupsSold = 0;
		CostOfEachCup = 15.50;		
		
	}
	
	public void addCoffee(double refill) {
		//adds the amount of coffee, in liters, to the amount of remaining coffee in the machine
		AmountOfCoffeeInMachine = refill + AmountOfCoffeeInMachine;		
	}
	
	
	public void sellCoffee(int numCups) {	
		//dispenses the specified number of cups of coffee, effectively decreasing the amount of coffee remaining in the machine
		//adds the number of cups dispensed to the total count of cups sold
		//adds the cost of the cups dispensed to the total amount of sales
		double AmountInCupLiters = AmountInCup / 1000;
		AmountOfCoffeeInMachine = AmountOfCoffeeInMachine - (numCups * AmountInCupLiters);
		NumCupsSold = NumCupsSold + numCups;
		AmountOfMoneyCollected = AmountOfMoneyCollected + (numCups * CostOfEachCup);	
	}
	
	
	public double getCoffeeLeft() {
		//returns the amount of coffee left in the machine
		return AmountOfCoffeeInMachine;
	}
	
	public int getCupsSold() {
		//returns the total number of cups sold
		return NumCupsSold;		
	}
	
	public double getSales() {
		//returns the total amount of money collected from selling coffee
		return AmountOfMoneyCollected;
	}
	
	
}	

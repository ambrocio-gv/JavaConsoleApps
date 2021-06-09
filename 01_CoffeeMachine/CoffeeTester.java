/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version November 11, 2020
**/


/*
 This Program creates a new Coffee machine object, uses a another class to access its methods
 and prints out the answers of these methods.
 */

public class CoffeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMachine nescafe = new CoffeeMachine();
		CoffeeMachine kopiko = new CoffeeMachine();
		nescafe.sellCoffee(15);
		kopiko.sellCoffee(7);
		nescafe.addCoffee(2.5);
		kopiko.addCoffee(4.75);
		nescafe.sellCoffee(21);
		kopiko.sellCoffee(12);	
	
		
		System.out.println("----- NESCAFE MACHINE ------");
		System.out.printf("Cups of Nescafe Sold: %d cups\n", nescafe.getCupsSold());
		System.out.printf("Remaining Nescafe: %5.3f liters\n", nescafe.getCoffeeLeft());
		System.out.printf("Total Nescafe Sales: PHP %5.2f\n\n", nescafe.getSales());
		
		System.out.println("----- KOPIKO MACHINE ------");
		System.out.printf("Cups of Kopiko Sold: %d cups\n", kopiko.getCupsSold());
		System.out.printf("Remaining Kopiko: %5.3f liters\n", kopiko.getCoffeeLeft());
		System.out.printf("Total Kopiko Sales: PHP %5.2f\n", kopiko.getSales());
		
	}

}

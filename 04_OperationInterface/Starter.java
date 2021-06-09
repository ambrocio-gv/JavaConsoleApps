
/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version March 02, 2021
**/

/*
 This Program is contains the main method to start applying an instance of the menugen
  class based on the interface class operation  
 
 */

public class Starter {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub		
	    Operation arr[] = new Operation[3];
	    arr[0] = new LargestIntegers();
	    arr[1] = new Uniqueness();
	    arr[2] = new GreatestSum();
	    MenuGen mg = new MenuGen(arr);
	    mg.run();
		
	}

}

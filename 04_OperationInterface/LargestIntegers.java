
/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version March 02, 2021
**/


/*
 This Program is implements a class that calculates the Largest Integer from a number of integers and print out the appropriate response
 */

public class LargestIntegers implements Operation {
	@Override
	 public void operate(Integer[] a) {	    
	    int temp = 0;
	    
	    
	    if(a.length == 0) {
	    	System.out.println("There are no  integers.");
	    }
	    
	    else if (a.length == 1) {
	    	System.out.println("The largest integer is " + a[0] + ".");
	    }
	    
	    else if(a.length == 2) {	    	
	    		System.out.println("The largest integers are " + a[0] + " and "+ a[1] + ".");	    	
	    }
	    
	    else {
	    	
	    	for(int i = 1; i < a.length; i++) {
	  	      if(a[0] < a[i]){
	  	    	temp = a[0];
	  	    	a[0] = a[i];
	  	    	a[i] = temp;  	    	 	
	  	      }
	  	    }
	    	
	    	for(int i = 2; i < a.length; i++) {
		  	   if(a[1] < a[i]){
		  		 temp = a[1];
		  	     a[1] = a[i];
		  	     a[i] = temp; 
		  	   }
	    	}
	    	
	    	for(int i = 3; i < a.length; i++) {
		  	   if(a[2] < a[i]){
		  		 temp = a[2];
		  	     a[2] = a[i];
		  	     a[i] = temp; 
		  	   }
	    	}
		  	
	     
	  	 System.out.println("The largest integers are " + a[2] + ", " + a[1] + "," + " and " + a[0] + ".");
	  	  
	    }
	  	    	
	  	      
		   
	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	   
	

	  @Override
	  public String getOperationName() {
	    return " Largest Integers";
	  }
}


/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version March 02, 2021
**/

/*
 This Program is implements a class that determines whether the set of inputed numbers are unique or not and is printed out
*/

public class Uniqueness implements Operation {
	@Override
	 public void operate(Integer[] a) {
	    boolean uniquecheck = true;
	    
	    
	    for(int i = 0; i < a.length-1; i++) {
	    	for (int j = i + 1; j < a.length; j++) {
	    		if(a[i] == a[j] && (i != j)) {
	    			uniquecheck = false;
	    		}
	    	}
	    }
	    
	    if(a.length == 0) {
	    	System.out.println("There are no  integers.");
	    }
	    else {	    	 
		    if(uniquecheck == true) {
		    	System.out.println("All the elements are unique.");
		    }
		    
		    else if(uniquecheck == false) {
		    	System.out.println("Not all the elements are unique");
		    }
	    }
	    
	    
	   
	    	
	      
	      
	      
	    

	  }

	  @Override
	  public String getOperationName() {
	    return " Uniqueness";
	  }
}

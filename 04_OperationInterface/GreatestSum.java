
/**
This is a template for a Java file.

@author Gerard V. Ambrocio
@version March 02, 2021
**/

/*
 This Program is implements a class that calculates the greatest sum from any three consecutive numbers inputed by the user
 */

public class GreatestSum implements Operation {
	@Override
	 public void operate(Integer[] a) {
	    int x = 0;
	    int temp = 0;
	    
	    List <Integer> arrlist = new ArrayList<Integer>();
	  
	    for(int i = 0; i < a.length - 2; i++) {
	    	
	    	x = a[i] + a[i+1] + a[i+2];	    	
	    	arrlist.add(x);	    	    	
	    }
	    
	    
	   
	    
	    Integer[] arr = new Integer[arrlist.size()]; 
       	    arr = arrlist.toArray(arr);
        
        
	    for(int i = 1; i < arr.length; i++) {
	  	      if(arr[0] < arr[i]){
	  	    	temp = arr[0];
	  	    	arr[0] = arr[i];
	  	    	arr[i] = temp;  	    	 	
	  	      }
	  	}
	    
	    	    
	    System.out.println("The Greatest sum is " + arr[0] + ".");
	
	  }

	  @Override
	  public String getOperationName() {
	    return " Greatest Sum";
	  }
}

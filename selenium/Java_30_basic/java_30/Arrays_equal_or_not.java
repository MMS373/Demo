package java_30;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
	        System.out.println("Enter the Size of an array"); // Prompt the user to enter the size of an array
	        int n=sc.nextInt(); // Store the size of an array in an integer variable n
	        int A1[]=new int[n]; // Declare and initialize an array of size n
	        int A2[]=new int[n];
	        for(int i=0;i<A1.length;i++) {
	        	System.out.println("enter an element in A1"); // Prompt the user to enter an element of the array
	        	  A1[i]=sc.nextInt(); // Store the user input in the current element of the array
	        }
	        for(int i=0;i<A2.length;i++) {
	        	System.out.println("enter an element in A2"); // Prompt the user to enter an element of the array
	        	  A2[i]=sc.nextInt(); // Store the user input in the current element
	        }
	        	
	        //Approach !
	        {
	        	Boolean Status =Arrays.equals(A1, A2);
		        if(Status==true) {
		        	System.out.println("both arrays are equal");
		        }
		        else
		        		System.out.println("arrays are npt eqwual");
	        	
	        }
	        //Approach 2
	        boolean status =true;
	        if(A1.length==A2.length) {
	        	for(int i=0;i<A1.length;i++) {
	        		if(A1[i]!=A2[i])
	        			status=false;
	        	}
	        
	        }
	        else {
	        	status=true;
	        }
	        if(status==true) {
	        	System.out.println("Arrays are equal");
	        }
	        else {
	        	System.out.println("arrays are not equal");
	        }
	    
	    sc.close();    
	}

}
	



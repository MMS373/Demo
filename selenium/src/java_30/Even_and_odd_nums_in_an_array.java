package java_30;

import java.util.Scanner;

public class Even_and_odd_nums_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
	        System.out.println("Enter the Size of an array"); // Prompt the user to enter the size of an array
	        int n=sc.nextInt(); // Store the size of an array in an integer variable n
	        int A[]=new int[n]; // Declare and initialize an array of size n
	        for(int i=0;i<A.length;i++) {
	        	System.out.println("enter an element"); // Prompt the user to enter an element of the array
	        	  A[i]=sc.nextInt(); // Store the user input in the current element of the array
	        }
	        for(int i=0;i<A.length;i++) {
	        	if(A[i]%2==0) {
		        	System.out.println("even"+A[i]);

	        	}
	        	else {
	        		System.out.println(A[i]);
	        }
	    
	        
	}

	}
}


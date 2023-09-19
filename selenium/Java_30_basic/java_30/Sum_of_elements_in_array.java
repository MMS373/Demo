package java_30;

import java.util.Scanner;

public class Sum_of_elements_in_array {

	public static void main(String[] args) {
		// This program calculates the sum of the elements in an array
		 Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
	        System.out.println("Enter the Size of an array"); // Prompt the user to enter the size of an array
	        int n=sc.nextInt(); // Store the size of an array in an integer variable n
	        int A[]=new int[n]; // Declare and initialize an array of size n
	        for(int num : A) { // Loop through the array elements using a for-each loop
	        	System.out.println("enter an element"); // Prompt the user to enter an element of the array
	        	 num=sc.nextInt(); // Store the user input in the current element of the array
	        }
	        int sum=1; // Declare and initialize a variable to store the sum of the array elements
	        for(int i : A) { // Loop through the array elements again using a for-each loop
	        	sum=sum+i; // Add the current element of the array to the sum variable
	        	
	        }
	        System.out.println("sum of elements in an array is "+sum); // Print the sum of the array elements
	        
	        
	              
	}
      
	        
	      
	}



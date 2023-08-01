package java_30;

import java.util.Scanner;

public class Searching_element_in_array {

	public static void main(String[] args) {
		// This program calculates the sum of the elements in an array
		 Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
	        System.out.println("Enter the Size of an array"); // Prompt the user to enter the size of an array
	        int n=sc.nextInt(); // Store the size of an array in an integer variable n
	        int A[]=new int[n]; // Declare and initialize an array of size n
	        for(int i:A) {
	        	System.out.println("enter the "+i+"  element");
	        	 A[i]=sc.nextInt();
	        }
	        	System.out.println("enter an element to be seacch"); // Prompt the user to enter an element of the array
	        	int  num=sc.nextInt(); // Store the user input in the current element of the array
	        for(int i:A) {
	        	if(A[i]==num) {
	    	        System.out.println("element found int eh array");

	        	}

	        }

	       
	        
	        
	              
	}
      
	        
	      
	}



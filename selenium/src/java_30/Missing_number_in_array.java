package java_30;

import java.util.Arrays;
import java.util.Scanner;

import com.beust.ah.A;

public class Missing_number_in_array {
//Array should be not have duplicates and no need to be sorted and values should be in Range
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
	        System.out.println("Enter the Size of an array"); // Prompt the user to enter the size of an array
	        int n=sc.nextInt(); // Store the size of an array in an integer variable n
	        int A[]=new int[n]; // Declare and initialize an array of size n
	        for(int i=0;i<A.length;i++) {
	        	System.out.println("enter an element in A1"); // Prompt the user to enter an element of the array
	        	  A[i]=sc.nextInt(); // Store the user input in the current element of the array
	        }
	        int sum1=0;
	        for(int i=0;i<A.length;i++) {
	        	sum1=sum1+A[i];
	        }
	        System.out.println("sum of elements in an array"+sum1);
	        int sum2=0;
	        for(int i=1;i<=n;i++) {
	        	sum2=sum2+i;
	        }
	        System.out.println("sum of range of elements in array"+sum2);
	        System.out.println("missing number"+(sum2-sum1));
	        
	       
	        	
	       
	    
	        
	}

}
	



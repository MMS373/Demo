package java_30;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String input = sc.nextLine(); // Use nextLine() instead of next() and store the input in a single variable

		// using charAt method
		{
			String rev = ""; // Initialize rev inside each block
			int len = input.length();
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + input.charAt(i);
			}
			System.out.println("Reversed string using charAt method: " + rev);
		}

		// using StringBuffer
		{
			StringBuffer input1 = new StringBuffer(input);
			StringBuffer rev1 = input1.reverse();
			System.out.println("Reversed string using StringBuffer: " + rev1);
		}
		
		// using char array
		{
			String rev = ""; // Initialize rev inside each block
			char a[] = input.toCharArray();
			int len = a.length;
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + a[i];
			}
			System.out.println("Reversed string using char array: " + rev);
		}
		
		sc.close(); // Close the scanner object

	}

}

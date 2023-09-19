package java_30;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_elements_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
	
		String A[] = new String[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.next();
		}
		//Approach 1
//		{
//			for(int i=0;i<A.length;i++) {
//				for(int j=i+1;i<A.length;j++) {
//					if(A[i]==A[j]) {
//						System.out.println("found duplicate element"+A[i]);
//					}
//					else 
//						System.out.println("duplicate element not found");
//				}
//			}
//		}
		//Approaxch 2
		HashSet<String> Set = new HashSet<String>();
		boolean flag = false;
		for (String i : A) {
		    if (Set.add(i) == false) {
		        System.out.println("found duplicate element " + i);
		        flag = true;
		    }
		}
		if (flag == false) {
		    System.out.println("duplicate element not found");
		}

		
	
	}

}
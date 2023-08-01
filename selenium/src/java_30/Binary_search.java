package java_30;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		/*
		 * case1:keyvalue==mid 
		 * case2:keyvalue>mid--->Left=mid+1 
		 * case3:keyvalue<mid--->Right=mid-1
		 * 
		 * NOTE:Array should be insorted only as binerary search will only work on the sorted array
		 * sysout(Arrays.binearysearch(a,8);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		System.out.println("enter the element to be found in the array");
		int key = sc.nextInt();
		int A[] = new int[n];
		int L = 0;
		int R = A.length - 1; // Subtract 1 from A.length to get the last index
		int mid = (L + R) / 2;
		for (int i = 0; i < A.length; i++) {
			System.out.println("enter the element in array in sorted order");
			A[i] = sc.nextInt();
		}
		while (L <= R) {
			if (A[mid] == key) {
				System.out.println("element found at index " + mid); // Print mid as the index of the element
				break; // Break the loop when element is found
			}
			if (A[mid] < key) {
				L = mid + 1;
			}
			if (A[mid] > key) {
				R = mid - 1;
			}
			mid = (L + R) / 2; // Recalculate mid after changing L or R
		}
		if (L > R) { // Check if L is greater than R after exiting the loop
			System.out.println("element not found in the array"); // Print a message if element is not found
			System.out.println(Arrays.binarySearch(A, 3));
		}
		sc.close();

	}

}

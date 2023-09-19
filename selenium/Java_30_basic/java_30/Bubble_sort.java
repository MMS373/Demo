package java_30;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("Arrays before sorting"+Arrays.toString(A));
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length-1;j++){
				if(A[j]>A[j+1]) {
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays After sorting"+Arrays.toString(A));

		
	}

}

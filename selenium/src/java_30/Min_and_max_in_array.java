package java_30;

import java.util.Scanner;

public class Min_and_max_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int A[] = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]>max)
				max=A[i];
			if(A[i]<min)
				min=A[i];
		}

		System.out.println("min and max in an arrray"+max+" is max element"+min+" is the min elememnt");

	}

}
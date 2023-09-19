package java_30;

import java.util.Scanner;

public class largest_of_3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st,2nd,3rd  number");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if(n1==n2&&n2==n3) {
	System.out.println("all are equal");
}
else if(n1>n2&&n1>n3) {
	System.out.println("n1 is larger");
}
	else if(n2>n3&&n2>n1)
	{
		System.out.println("n2 is larger");
	}
	else
	{
		System.out.println("n3 is larger");
}

	}

}

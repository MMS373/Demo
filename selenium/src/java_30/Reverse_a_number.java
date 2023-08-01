package java_30;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int rev=0;
//using the algorithm Declare a variable to store the reversed number int rev = 0;
/*
  Use a while loop to reverse the digits of a given number while(num!=0) //
 * Multiply the current reversed number by 10 and add the last digit of the
 * original number rev=rev*10+num%10;
Remove the last digit of the original number by dividing it by 10
 */
{
	int num=sc.nextInt();

while(num!=0) {
	rev=rev*10+num%10;
	num=num/10;
	
}
System.out.println(rev);
}
//usign teh string buffer class(just change the buffer to builder to use it i th builder)
{
	int num=sc.nextInt();
	StringBuffer sb=new StringBuffer(String.valueOf(num));
StringBuffer rev1=sb.reverse();
System.out.println(rev1);
}


	}

}

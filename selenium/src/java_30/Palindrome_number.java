package java_30;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int original_num=num;
int rev=0;
while(num!=0)
{
	rev=rev*10+num%10;
	num=num/10;
}
if(rev==original_num)
{
	System.out.println("palnindrome");
}
else 
	System.out.println("not a palindrpome");

	}

}

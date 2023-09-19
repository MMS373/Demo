package java_30;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String S=sc.next();
String Org_str=S;
String rev="";
int len=S.length();
for(int i=len-1;i>=0;i--) {
	rev=rev+S.charAt(i);
}
if(rev==Org_str)
{
	System.out.println("palnindrome");
}
else 
	System.out.println("not a palindrpome");

	}

}

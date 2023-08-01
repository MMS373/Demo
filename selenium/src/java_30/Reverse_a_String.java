package java_30;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String rev="";
/*
 * { String str=sc.next(); int len=str.length(); for(int i=len-1;i>=0;i--) {
 * rev=rev+str.charAt(i);
 * 
 * 
 * 
 * } System.out.println(rev); }
 */

//using the sting buffer
{
	String S1=sc.next();
	StringBuffer S1=new StringBuffer(S1);
StringBuffer rev1=S11.reverse();
System.out.println(rev1);
}
//using teh char at array
{
	System.out.println("enter the String");

	String S=sc.next();

	char a[]=S.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--) {
		rev=rev+a[i];
}


	}

}
}

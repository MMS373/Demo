package java_30;

import java.util.Scanner;

public class Count_words_in_String {

	public static void main(String[] args) {
System.out.println("enter the string");
Scanner sc=new Scanner(System.in);
String S=sc.nextLine();
int count=1;
for(int i=0;i<S.length()-1;i++) {
	if((S.charAt(i)==' ')&&(S.charAt(i+1)!=' '))
	{
		count++;
	}
	
}
System.out.println(count);

	sc.close();
	}

}

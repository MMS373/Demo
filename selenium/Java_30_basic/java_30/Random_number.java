package java_30;

import java.util.Random;

public class Random_number {

	public static void main(String[] args) {
		//Appriocah 1
Random rand=new Random();
int random_nyumber=rand.nextInt();
System.out.println(random_nyumber);
//By using the Math
System.out.println(Math.random());
	}

}

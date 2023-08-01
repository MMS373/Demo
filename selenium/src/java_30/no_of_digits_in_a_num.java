package java_30;

import java.util.Scanner;

public class no_of_digits_in_a_num {
	{
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);

	}
}

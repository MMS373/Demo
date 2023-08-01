package java_30;

import java.util.Scanner;

public class count_sum_of_digits_in_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else if (digit % 2 != 0) {
                oddCount++;
            }
            inputNumber = inputNumber/10;
        }
        System.out.println(evenCount + " " + oddCount);
        sc.close();
    }
}

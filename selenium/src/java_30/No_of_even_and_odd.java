package java_30;

import java.util.Scanner;

public class No_of_even_and_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = sc.nextInt();
        int sum=0;
       
        while (inputNumber > 0) {
             sum = sum+inputNumber % 10;
            
            inputNumber = inputNumber/10;
        }
        System.out.println(sum);
        sc.close();
    }
}

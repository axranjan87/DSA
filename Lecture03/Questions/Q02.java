package Lecture03.Questions;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Sum of Even and Odd numbers");

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("How many numbers you want to enter? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        System.out.println("Sum of Even numbers = " + evenSum);
        System.out.println("Sum of Odd numbers = " + oddSum);

        sc.close();
    }
}

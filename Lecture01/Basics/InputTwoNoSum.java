/* add two no input from user */
package Lecture01.Basics;
import java.util.Scanner;
public class InputTwoNoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}

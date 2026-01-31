/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
 */

package Lecture01.Questions;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no : ");
        int A = sc.nextInt();
        System.out.print("Enter Second no : ");
        int B = sc.nextInt();
         System.out.print("Enter Third no : ");
        int C = sc.nextInt();
        int sum = A + B + C;
        int average = sum / 3;
        System.out.println("The average of the three numbers is: " + average);
        sc.close();
    }
}

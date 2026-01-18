/* Take number input from user and print even or odd */
package Lecture02;
import java.util.Scanner;
public class TernaryOperator07 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your number : ");
      int shru = sc.nextInt();
      System.out.println((shru % 2 == 0) ? "Even" : "Odd");  
    }
}

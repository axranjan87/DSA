   /* If & if-else condition >> Take number input from user and print even or odd */
package Lecture02;
import java.util.Scanner;
public class IfElse {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("The given input from the user is odd or even : ");
      int num = sc.nextInt();
      if(num % 2 == 0){
         System.out.println("nums is even : ");
      }else{
         System.out.println("nums is odd : ");
      }
      sc.close();
   }
}
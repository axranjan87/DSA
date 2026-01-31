/* Take integer input from the user and print the absolute value of that integer */
package Lecture02.IfAndElse;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.print("The absolute value of the integer : ");
         int value = sc.nextInt();
         if(value >= 0){
            System.out.println(value);
         }else{
            System.out.println(-value);
         }
         sc.close();
    }
}

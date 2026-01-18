/* Multiple Conditions using &&(logical and) and ||(logical or) 
   Take positive integer input and tell if it is a four digigt number or not */
package Lecture02;
import java.util.Scanner;
public class IfElse04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num > 999 && num < 1000){
            System.out.println("4 digit number : ");
         }else{
            System.out.println("Not a 4 digit no : ");
         }
         sc.close();
    }
}

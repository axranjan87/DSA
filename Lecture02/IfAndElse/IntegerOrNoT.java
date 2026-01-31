/* Take real number input from the user and check if it is an integer or not  */

package Lecture02.IfAndElse;
import java.util.Scanner;
public class IntegerOrNoT {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("The number is integer or not : ");
        double num = sc.nextDouble();
        if(num == (int)num){
            System.out.println("The number is an integr :  ");

        }else{ 
            System.out.println("The number is not an integer : ");
        }
        sc.close();
    }
}

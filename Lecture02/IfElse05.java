/* Take positive integer input and tell if it is divisible by 5 or 3. */
package Lecture02;
import java.util.Scanner;
public class IfElse05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer : ");
        int num = sc.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("the nums is divisible by 5 & 3 : ");
        }else{
            System.out.println("the nums is not divisible by 5 & 3 : ");
        }
        sc.close();
    }
}
 
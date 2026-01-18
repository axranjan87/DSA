/* Reverse of a number */
package Lecture03;
import java.util.Scanner;
public class Loops09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int sum = sc.nextInt();
        int r = 0;
        while(sum != 0){
            r *= 10;
            r += (sum%10);
            sum /= 10;
        }
        System.out.println(r);
    }
    
}

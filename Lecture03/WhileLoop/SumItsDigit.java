/* print sum of its digit of a number */

package Lecture03.WhileLoop;
import java.util.Scanner;
public class SumItsDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/= 10;
        }
        System.out.println("sum of given digit is : " + sum);
        sc.close();
    }
}

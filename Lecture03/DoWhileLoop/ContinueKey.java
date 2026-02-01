/* Display all numbers entered by user except multiple of 100 */

package Lecture03.DoWhileLoop;
import java.util.Scanner;
public class ContinueKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            int n = sc.nextInt();   //  yahin input lena zaruri hai

            if (n % 10 == 0) {
                continue;
            }

            System.out.println("You entered: " + n);
        } while (true);
    }
}

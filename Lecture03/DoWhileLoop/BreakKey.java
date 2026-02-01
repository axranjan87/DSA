package Lecture03.DoWhileLoop;
import java.util.Scanner;

public class BreakKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the number : ");
            n = sc.nextInt();   //  yahin input lena zaruri hai

            if (n % 10 == 0) {
                break;
            }

            System.out.println("You entered: " + n);

        } while (true);

        sc.close();
    }
}

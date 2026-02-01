package Lecture03.ForLooP;
import java.util.Scanner;
public class PowerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the digit : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
        for(int i = 1; i<=b; i++){
            power *= a;
        }
        System.out.println("Enter the digit : " + power);
        sc.close();
    }
}

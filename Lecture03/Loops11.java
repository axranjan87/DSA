package Lecture03;
import java.util.Scanner;
public class Loops11 {
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

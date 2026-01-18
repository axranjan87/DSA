/* Basics Looping Questions */
package Lecture03;
import java.util.Scanner;
public class Loops01 {
    public static void main(String[] args) {
        /*for(int i=5; i<=12; i++){
            System.out.println("Shru");
        }*/
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string from the user : ");
        String shru = sc.nextLine();
        System.out.print("Enter number how many prints : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("shru");
        }
        sc.close();
    }
}

package Lecture05;
import java.util.Scanner;
public class Methods01 {
    public static void main(String[]args){
        /* Math. wale method like Math.sqrt */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max (a,b),c));
        sc.close();
    }
}

package Lecture02.Questions;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        
        if(x >= 0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }
        sc.close();
    }
}

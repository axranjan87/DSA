package Lecture05.Methods;
import java.util.Scanner;
public class SyntaxWithParameter {

    public static void myMethod(int num1, int num2) {  //parameters or formal parameters
        
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        myMethod(a,b);  //function call
        /* myMethod ke inside jo humne a and b pass kiya h 
            = wo arguments or actual parameters hai */
    }
} 

/* Input and Output */

package Lecture06.Arrays;
import java.util.Scanner;
public class Basics02 {
    public static void main(String[] args) {
        int marks[] = new int[100]; //declaration and memory allocation

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks of physics : ");
        marks[0] = sc.nextInt(); //input from user
    
        System.out.print("Enter the marks of maths: ");
        marks[1] = sc.nextInt();
        
        System.out.print("Enter the marks of chemistry : ");
        marks[2] = sc.nextInt();
       

       /* Output */
        System.out.println("Physics Marks :  " + marks[0]); //output
        System.out.println("Chemistry Marks :  " + marks[1]);
        System.out.println("Maths Marks :  " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage : " + percentage + "%");

        sc.close();

    }
}

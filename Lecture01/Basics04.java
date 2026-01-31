/* Input from user */

package Lecture01;
import java.util.Scanner;
public class Basics04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close();
     }
}

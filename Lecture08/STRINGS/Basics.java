package Lecture08.STRINGS;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str1 = "abcde";
        String str2 = new String("xyz");

        /* Strings are immutable*/

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = sc.next(); //single word
        //name = sc.nextLine(); multiple
        System.out.println(name);

    }
}

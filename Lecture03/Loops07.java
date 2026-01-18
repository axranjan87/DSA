/* count digit of a number  */
package Lecture03;
import java.util.Scanner;
public class Loops07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("The count digit number is  : " + count);
        sc.close();
    }
}

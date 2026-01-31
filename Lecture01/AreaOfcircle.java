/* Area of a circle */
package Lecture01;
import java.util.Scanner;
public class AreaOfcircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println(area);
        sc.close();
    }
}

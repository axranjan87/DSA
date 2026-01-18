/* Questions 
    * * * *
    * * * *
    * * * *
    *  * * *   print this by user input*/
package Lecture04;
//import java.util.Scanner;
public class Pattern02 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int Row = sc.nextInt();
        System.out.print("Enter the column : ");
        int col = sc.nextInt();*/
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // sc.close();
    }
}

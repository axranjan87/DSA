/* Pattern Questions  
    Rectangle print by user input */

package Lecture04;
import java.util.Scanner;
public class Pattern01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int row = sc.nextInt();
        System.out.print("Enter column number : ");
        int col = sc.nextInt();
        for(int  i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

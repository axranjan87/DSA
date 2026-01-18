/* Question 
    1234
    1234
    1234
    1234  */
package Lecture04;
import java.util.Scanner;
public class Pattern03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

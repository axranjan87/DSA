package Lecture04;
import java.util.Scanner;
public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n+1-i; j++){   //sidha print krane ke liye j<=n;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
 /* ulta print krane ke liye
    1 2 3 4 5
    1 2 3 4
    1 2 3 
    1 2
    1    */
package Lecture04;
import java.util.Scanner;
public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of row : ");
        int m = sc.nextInt();
        System.out.print("Enter the No of column : ");
        int n = sc.nextInt();
        for(int i = 1; i<=m;i++){
            for(int j = 1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*  * * * * * * *
    *           *
    *           * 
    *           * 
    * * * * * * *   print this hollow square*/
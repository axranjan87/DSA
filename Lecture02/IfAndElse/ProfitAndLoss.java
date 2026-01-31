 /* if Cp and Sp of an items is input through the keyword , write program to determine 
    whether the seller has made profit or include loss or no profit no loss.
    Also determine how much profit he made or loss he incurred */ 
package Lecture02.IfAndElse;
import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cp : ");
        int cp = sc.nextInt();
        System.out.println("Enter Sp : ");
        int sp = sc.nextInt();
        if(sp > cp){
            System.out.println("profit");
        }else{
            System.out.println("Loss");
        }
        sc.close();

    }
}

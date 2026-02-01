/* WAP to print if number is composite or not */
package Lecture03.ForLooP;
import java.util.Scanner;
public class CompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int com = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<com; i++){
            if(com % i == 0){
                flag = true;
                break;
            }
        }
        System.out.println(flag == true ? "Number is composite" : "Number not composite");


        sc.close();
    }
}

/* Output & input of Array using loop */
package Lecture06.Arrays03;
import java.util.Scanner;
public class Arrays03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();  //Input
        }
        System.out.println("Array stored success!");
        sc.close();
    }  
}

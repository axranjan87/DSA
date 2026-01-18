package Lecture06;
import java.util.Scanner;
public class Arrays02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);    // for input
        int [] arr = {6,7,8,9,10,11,151,160};
        //int n = arr.length;  //index 0 to n-1
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //defalut values
        int [] array = new int[7];
        for(int i = 0; i < 7; i++){
            System.out.print(array[i]+" ");
        }
        //input
        for(int i = 0; i < 7; i++){
            array[i]=sc.nextInt();
        }
        //for print
        for(int i = 0; i < 7; i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}

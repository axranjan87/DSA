/* Print the second maximum element in the Array */
package Lecture06;
public class Arrays15 {
    public static void main(String[] args) {
        int[]arr = {4,10,10,6,3,8};
        int max = Integer.MIN_VALUE;
        int Secmax = Integer.MIN_VALUE;
        //Calculate max
        for(int i =0; i < arr.length; i++){
           if(arr[i] > max) max = arr[i];
        }
        //Calculate second max
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>Secmax && arr[i]!=max) Secmax = arr[i];
        }
        System.out.println(max);
        System.out.println(Secmax);
    }
}

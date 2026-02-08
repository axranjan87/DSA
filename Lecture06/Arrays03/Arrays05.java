/* Print sum of element of the array */
package Lecture06.Arrays03;
public class Arrays05 {
    public static void main(String[] args) {
        int arr [] = {12,5,2,6,9,10,11};
        int sum =0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

        }
        System.out.println(sum);
    }
}

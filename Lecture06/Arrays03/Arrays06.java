/* print the maximum element in the array */
package Lecture06.Arrays03;
public class Arrays06 {
    public static void main(String[] args) {
       int arr [] = {10,15,18,20,100,502,168};
       int max = arr[0];
       for(int i = 0; i < arr.length; i++){
        if(arr[i]>max) max = arr[i];

       }
       System.out.println(max);
    }
}
 //solved in GFG platform also
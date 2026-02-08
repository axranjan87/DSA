/* PassingArrayToMethod */
package Lecture06.Arrays03;
public class Arrays07 {
    public static void main(String[] args) {
        int arr[] = {10,23,52,46,16};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);

    }
    public static void change(int[] arr){
        arr[2] = 99;
    }
}

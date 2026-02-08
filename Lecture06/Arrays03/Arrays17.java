/* Reverse Arrays */
package Lecture06.Arrays03;
public class Arrays17 {
    public static void main(String[] args) {
        int arr[] = {3,19,56,9,83,18,24,85,14};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while( i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

package Lecture07.Sorting;

public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Insertion(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}

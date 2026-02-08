package Lecture06.Arrays03;
public class Arrays18 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8};
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

package Lecture06.Arrays;
public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid  = start + end / 2;

            if(numbers[mid] == key){   //comparisons
                return mid;
            }
            if(numbers[mid] < key){    // for right part
                start = mid+1;
            }else{
                end = mid - 1;    //left
            }
        }
        return -1;
    }



    public static void main(String[]args){
        int numbers[] = {10,20,30,40,50,60};
        int key = 1;

        System.out.println("The index for key is : " + binarySearch(numbers, key));
    }
}

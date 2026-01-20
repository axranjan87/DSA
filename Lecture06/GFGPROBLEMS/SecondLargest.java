package Lecture06.GFGPROBLEMS;
public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int Secmax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Secmax && arr[i] != max) Secmax = arr[i];
        }
        if(Secmax == Integer.MIN_VALUE){
            return -1;
        }
        return Secmax;
    }

}

package Lecture06.Arrays;

public class ReverseArrays {
    public static void reverse(int numbers[]){
        int n = numbers.length;

        int first = 0;
        int end = n - 1;

        while(first < end){
            int temp = numbers[end];
            numbers[end] = numbers[first];
            numbers[first] = temp;

            first++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
         System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

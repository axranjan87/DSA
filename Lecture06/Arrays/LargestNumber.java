package Lecture06.Arrays;
public class LargestNumber {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  //-infinity (for largest find ke liye)
        int smallest = Integer.MAX_VALUE; //+infinity (for smallest find ke liye)

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest no is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,18,10};
        System.out.println(getLargest(numbers));
    }
}

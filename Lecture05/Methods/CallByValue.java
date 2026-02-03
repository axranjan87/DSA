package Lecture05.Methods;

public class CallByValue {
    public static void swap (int a, int b){
        int temp = a;  //swapping logic
        a = b;
        b = temp;
        System.out.println("The value of a after swapping: " + a);
        System.out.println("The value of b after swapping: " + b);
    }

    public static void main(String[] args) {
        int a = 10;   //swap values exchange
        int b = 20;
        swap(a,b);  //function call
    }
}

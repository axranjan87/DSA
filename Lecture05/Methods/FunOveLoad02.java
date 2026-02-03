/* Function overloading using Data Types */

package Lecture05.Methods;
public class FunOveLoad02 {

        // for 2 no multiplication
    public static int multiply(int a, int b){
        return a * b;
    }
       // for 3 no multiplication
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    // function to call float sum
    public static float multiply(float a, float b){
        return a * b;
    }
    public static void main(String[] args) {
        int result = multiply(5,10);
        System.out.println("The multiply of 5 and 10 is: " + result);

        int result2 = multiply(5,10,2);
        System.out.println("The multiply of 5, 10 and 2 is: " + result2);

        float result3 = multiply(5.5f, 10.5f);
        System.out.println("The multiply of 5.5 and 10.5 is: " + result3);
    }
}

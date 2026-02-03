/* Function overloading using parameter */

package Lecture05.Methods;
public class FunOveLoad {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);
        int result2 = sum(5, 10, 15);
        System.out.println("The sum of 5, 10 and 15 is: " + result2);
       
    }
}

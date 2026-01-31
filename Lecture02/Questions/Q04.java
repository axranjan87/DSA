package Lecture02.Questions;
public class Q04 {
    public static void main(String[] args) {

        int a = 63, b = 36;

        // Ternary operator for boolean value
        boolean x = (a < b) ? true : false;

        // Ternary operator for integer value
        int y = (a > b) ? a : b;

        // Printing results
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}


/* Output: Value of x: false
Value of y: 63 */
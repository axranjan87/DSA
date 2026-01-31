/* Unary operators in Java are operators that operate on a single operand. They include:
    1. Increment operator (++)
    2. Decrement operator (--)
    3. Unary plus (+)
    4. Unary minus (-)
    5. Logical NOT operator (!)
    6. Bitwise NOT operator (~)
*/


package Lecture01.OperatorsInJava;
public class UnaryArithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Increment operator
        System.out.println("Original value of a: " + a);
        a++; // a = a + 1
        System.out.println("After incrementing, value of a: " + a);
        // Decrement operator
        System.out.println("Original value of b: " + b);
        b--; // b = b - 1
        System.out.println("After decrementing, value of b: " + b);
        // Unary plus and minus
        int c = +a; // Unary plus
        int d = -b; // Unary minus
        System.out.println("Unary plus of a: " + c);
        System.out.println("Unary minus of b: " + d);

          

    }
}

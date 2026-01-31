package Lecture01.OperatorsInJava;
public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10; // assignment operator
        int b = 20;
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);
        b -= 5; // b = b - 5
        System.out.println("b after -= 5: " + b);
        a *= 2; // a = a * 2
        System.out.println("a after *= 2: " + a);
        b /= 3; // b = b / 3
        System.out.println("b after /= 3: " + b);
        a %= 4; // a = a % 4
        System.out.println("a after %= 4: " + a);
    }
}

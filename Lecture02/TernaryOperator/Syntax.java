package Lecture02.TernaryOperator;
public class Syntax {
    public static void main(String[] args) {
        // boolean condition = true;
        // codeBlock1 : executed when condition is true
        // codeBlock2 : executed when condition is false

        // (condition) ? "codeBlock1" : "codeBlock2";

        int a = 10;
        int b = 20;
        String result = (a > b) ? "a is greater" : "b is greater";  
        System.out.println(result);
    }
}

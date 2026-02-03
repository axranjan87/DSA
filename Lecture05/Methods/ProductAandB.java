package Lecture05.Methods;

public class ProductAandB {
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int prod = product(a, b);
        System.out.println("The product of a and b is: " + prod);
    }
}

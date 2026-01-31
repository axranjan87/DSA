package Lecture01.Basics;
public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // implicit type conversion from int to double
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);

        double x = 9.78;
        int y = (int) x; // explicit type conversion from double to int
        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + y);

    }
}

/*  Type Conversion in Java
    byte → short → int → long → float → double
 */
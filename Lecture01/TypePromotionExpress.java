package Lecture01;
public class TypePromotionExpress {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; // byte to int promotion
        System.out.println("Byte value: " + b);
        System.out.println("Promoted Integer value: " + i);

        char c = 'A';
        int j = c; // char to int promotion
        System.out.println((int)(c));
        System.out.println((int)(j));
        System.out.println(c-j);
        System.out.println("Character value: " + c);
        System.out.println("Promoted Integer value: " + j);

        short s = 5;
        long l = s; // short to long promotion
        System.out.println("Short value: " + s);
        System.out.println("Promoted Long value: " + l);

        byte k = 5;
        k = (byte)(k * 2);  // multiplication promotes byte to int, so we need to cast back to byte
        System.out.println("Byte value : " + k);
    }
    
}
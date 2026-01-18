package Lecture05;

public class Methods06 {
    public static int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
    public static void main(String[] args) {
        System.out.println(max(52,500,26));
    }
}

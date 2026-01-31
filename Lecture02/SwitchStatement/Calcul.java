package Lecture02.SwitchStatement;
public class Calcul {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char operator = '+';
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

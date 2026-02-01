package Lecture03.Questions;

public class Q05 {
    public static void main(String args[]) {

        int i;   // 👈 variable declared outside loop

        for (i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);
    }
}



/* The variable i is declared inside the for loop, so its scope 
is limited to the loop only.Accessing i outside the loop causes 
a compile-time error.To fix this, declare i outside the loop.*/
package Lecture04.AllPaternsQuestion;
public class CharacterPattern {
    public static void main(String[] args) {
        int n = 5;
        char ch  = 'A';

        for(int i = 1; i <=n; i++){   // outer loop
            for(int j = 1; j <= i; j++){   // inner loop
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

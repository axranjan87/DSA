package Lecture03.ForLooP;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n == 1){
            isPrime = false; //1 is neither prime nor composite
        }
        
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0){   //n is a multiple of i (i not equal to 1 and n)
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}

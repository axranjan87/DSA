/* Check if a number is prime or not */

package Lecture05.Methods;
public class PrimeOrNoT {
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){    //completely divisible by i then it is composite number
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isprime(0));
        System.out.println(isprime(4));
        System.out.println(isprime(5));

    }
}

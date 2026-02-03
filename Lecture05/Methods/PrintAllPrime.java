/* print all prime in range n = 10 */

package Lecture05.Methods;

public class PrintAllPrime {
    public static boolean isprime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeInRange(10);

    }
}

package Lecture05.Methods;

public class BinomialCofficient {
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);
        
        int binom = fact_n / (fact_r * fact_n_r);
        return binom;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

     public static void main(String[] args) {
        System.out.println("The binomial coefficient C(5, 2) is: " + binomial(5, 2));
    }
}

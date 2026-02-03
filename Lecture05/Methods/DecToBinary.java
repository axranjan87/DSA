/* Convert Decimal number to Binary */

package Lecture05.Methods;
public class DecToBinary {
    public static void DecToBin(int n){
        int pow = 0;
        int BinNum = 0;

        while(n > 0){
            int rem = n % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("The binary equivalent is: " + BinNum);
    }
    public static void main(String[] args) {
        int n = 13;
        DecToBin(n);
    }
}

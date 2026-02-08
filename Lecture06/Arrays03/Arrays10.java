/* Product of Array */
package Lecture06.Arrays03;
public class Arrays10 {
    public static void main(String[] args) {
        int [] arr = {3,2,1,-5,-2};
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}

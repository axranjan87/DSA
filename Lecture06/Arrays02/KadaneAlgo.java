/* max SubArray Sum */

package Lecture06.Arrays02;
public class KadaneAlgo {
    public static void MaxSubArrayKadane(int numbers[]){
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The max Subarrawy sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3,4};
        MaxSubArrayKadane(numbers);
    }
}

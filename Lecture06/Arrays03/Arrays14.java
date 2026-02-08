/* TWO SUM */

package Lecture06.Arrays03;
public class Arrays14 {
    public static void main(String[]args){
        int arr[] = {4,5,8,5,8,9,1};
        int target = 6;
        int n = arr.length;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i==j){
                    continue;
                }
                else if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]+" , "+arr[j]);
                    flag=true;
                    break;
                 }
            }
            if(flag) break;
        }
        /* GFG & LEETCODE int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;){
                if( arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;  */
    }
}



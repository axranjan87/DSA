/* Search an Array [Linear search]*/

package Lecture06;
public class Arrays13 {
    public static void main(String[] args) {
       int arr[] = {12,3,27,53,18,62,88,6 };
       int target = 18;
       boolean flag = false;  //flase means target array me nhai hai 
       for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
            flag = true;
            break;
        }
       }
       if(flag){
        System.out.println("Target exists in Array");
       }else{
        System.out.println("Target missing in Array");
       }
    }
}

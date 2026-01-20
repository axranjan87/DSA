/* Segregate 0s and 1s */
package Lecture06.GFGPROBLEMS;
public class SegregateArray {
    void segregate0and1(int[] arr) {
        int ayush = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                ayush++;
            }
        }
        for(int i = 0; i < ayush; i++){
            arr[i] = 0;    // fill for 0;
        }
        for(int i = ayush; i < arr.length; i++){
            arr[i] = 1;      // fill for 1
        }
    }
 

}

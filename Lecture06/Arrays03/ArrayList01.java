/* Basics of ArrayList */
package Lecture06.Arrays03;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();  //syntax of ArrayList
        arr.add(25);
        arr.add(21);
        arr.add(24);
        arr.add(5);
        arr.add(10);
        arr.add(15);   
        System.out.println(arr.get(2));  //element find by index
        arr.set(5, 45);  //for change element from index
        System.out.println(arr); // not traversing the array by ourselves

        //for loop for printing 

        int n = arr.size();  //arr.length ke bdle mujhe arr.size lena hn arrylist me
        for(int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }

        //forEach loop for printing

       for(int ele : arr){
            System.out.print(ele + " ");
        } 

       //for element add in the list and also change the own element add in the own index

       arr.add(78);
       arr.add(2,100);
       System.out.println(arr);


    }
}

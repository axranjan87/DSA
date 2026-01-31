package Lecture02.ElseIf;
public class LargestOf3 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 15;
        
        if((A>=B) && (A>=C)){
            System.out.println("A is largest");
        }else if(B>=C){
            System.out.println("B is largest");
        }else{
            System.out.println("C is largest");
        }
    }
}

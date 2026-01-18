package Lecture05;
public class Methods02 {
    public static void Ayush(){
        System.out.println("Shru");
    }
    public static void Number(){
       int n = 50;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                System.out.println("even : " + i);
            }else{
                System.out.println("odd : " + i);
            }
        }
    }
    public static void main(String[] args) {  //Main method
        Ayush(); //Method or function call of method Ayush
        System.out.println("Shruu");
        Number(); // this is for number method

    }
}

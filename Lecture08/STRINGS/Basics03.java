package Lecture08.STRINGS;
public class Basics03 {
    public static void PrintLetter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        /* String CharAt Method */

        String firstname = "Ayush";
        String Lastname = "Ranjan";
        String fullname = firstname + " " + Lastname;
        //System.out.println(fullname.charAt(1));  for single letter

        PrintLetter(fullname);
    }
}

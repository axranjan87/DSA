/* Print all alphabets wwith their corresponding ASCIIA Values */
package Lecture03.ForLooP;
public class AsciiaValue {
    public static void main(String[] args) {
        for(char ch = 'A'; ch<='Z'; ch++ ){
            System.out.println(ch + " = "+ (int)ch);
        }

    }
    
}

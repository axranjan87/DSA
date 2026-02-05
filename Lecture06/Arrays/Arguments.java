package Lecture06.Arrays;
public class Arguments {

    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i]= marks[i] + 5;  //adding 5 marks to each subject and updating the original array
        }
    }

    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update(marks);

        //print the marks after update
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();//new line
        
    }
}

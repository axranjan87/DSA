package Lecture02.ElseIf;
public class VotingCheck {
    public static void main(String[]args){
        int age = 18;
        if(age<18){
            System.out.println("You are not eligible to vote");
        }else if(age==18){
            System.out.println("You are eligible to vote for first time");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}

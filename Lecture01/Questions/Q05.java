/* Question 5: (Advanced) Will the following statement give any error in Java?
int $ = 24;
Note - These questions are only to help you practice the concepts of this chapter. These are
not designed to test your mathematical skills, just to understand logic building using Java.  */

package Lecture01.Questions;
public class Q05 {
    public static void main(String[] args) {
        int $ = 24;
        System.out.println("The value of $ is: " + $);
    }
}

/*No, the statement will not give any error in Java.
 In Java, the dollar sign ($) is a valid character for variable names.
 Therefore, the variable declaration int $ = 24; is perfectly valid.
 When you run the program, it will output: The value of $ is: 24 */

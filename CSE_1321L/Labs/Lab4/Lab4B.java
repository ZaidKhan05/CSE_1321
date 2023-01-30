//==================================== Program Lab4B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 4b
 */
// Program Lab4B.java
//
import java.util.Scanner;

public class Lab4B
{
    public static void main (String[] args)
    {
        String day;
        System.out.print("Enter the day: ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();
        if(day.equalsIgnoreCase("monday")){
            System.out.print("I have class today!");
        }
        else if(day.equalsIgnoreCase("wednesday")){
            System.out.print("I have class today!");
        }
        else if(day.equalsIgnoreCase("friday")){
            System.out.print("It’s Friday! Friday! Gotta get down on Friday!");
        }
        else{
            System.out.print("I should use this time to do my homework.");
        }

    }
}
/*
Lab4B: Do I have class today?
We’re going to create special messages for days of the week. For this lab, you will create a program that asks
the user for a day of the week.
• If the user is going to have class on Monday and Wednesday, but also is really excited for Friday.
• Your program should respond with a special message for each of these days, keep in mind both Monday
and Wednesday messages are the same and the user may or may not pay attention to capitalization.
• For other days, the program will print the message “I should use this time to do my
homework.”
Make sure that the program is NOT case sensitive i.e., for example “Monday” and “monday” should
lead to same result
Remember, the class name should be Lab4B.
Sample runs are shown below. The user input is in bold.
Sample run #1:
Enter the day: Monday
I have class today!
Sample run #2:
Enter the day: monday
I have class today!
Sample run #3:
Enter the day: Friday
It’s Friday! Friday! Gotta get down on Friday!
Sample run #4 (generic case):
Enter the day: Tuesday
I should use this time to do my homework.
 */
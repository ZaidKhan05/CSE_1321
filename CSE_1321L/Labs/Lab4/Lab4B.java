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
        if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("wednesday")){
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

//==================================== Program Assignment2B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 2B
 */


import java.util.Scanner;

public class Assignment2B {
    public static void main (String[] args){
        float time, speed, timeInt, newTime;
        int  savedTime;
        System.out.println("[Fast-Forward]");
        System.out.print("What is the original video time? ");
        Scanner sc = new Scanner(System.in);
        time = sc.nextFloat();
        System.out.print("What is the playback speed factor? ");
        speed = sc.nextFloat();

        //math
        timeInt = (time%1)*100;

        while(time > 1f){
            timeInt = timeInt + 60;
            time = time - 1f;
        }
        newTime = timeInt / speed;
        savedTime = (int)timeInt - (int)newTime;
        System.out.println("The new video time would be " + (int)newTime + " second(s).");
        System.out.println("That saves you " + savedTime + " second(s) from the original video speed.");


    }
}
/*
Assignment 2B:
Fast-forwarding. A trick for getting through video lectures faster (especially if your instructor’s
voice is not the most entertaining) is to increase the playback speed. Common factors are 1.25,
1.50, and 2 times faster playback speeds. How much time could you save this way? In this
assignment, you’ll write a program to help you find out.
Prompt the user to enter the original video time as a floating point value (e.g. a two minute,
thirty second video should be entered as 2.30). Next, have the user enter the playback speed
factor, again as a floating point value (e.g. 1.25). You can assume the user will never enter a
value less than or equal to 0.
Once you have this information, you will need to convert the original time into seconds – in the
above example, two minutes and thirty seconds would be 150 seconds. Then use the factor to
determine what the new video time would be. Display the results in seconds. Note that you
*must* use an integer data type to store the new video time.
Hint: Remember casting. Also, what happens to the decimals when you convert a floating point
value to an integer? How could that help you with this assignment?
The algorithm output is as shown below, with user input in bold. Follow the output format
exactly. Save your source code in a file called Assignment2B (with a file extension of .cpp, .cs
or .java)
Sample Output #1:
[Fast-Forward]
What is the original video time? 2.30
What is the playback speed factor? 2
The new video time would be 75 second(s).
That saves you 75 second(s) from the original video speed.
Sample Output #2:
[Fast-Forward]
What is the original video time? 3.59
What is the playback speed factor? 1.75
The new video time would be 136 second(s).
That saves you 103 second(s) from the original video speed.
 */
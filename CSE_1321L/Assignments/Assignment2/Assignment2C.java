//==================================== Program Assignment2C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 2C
 */

import java.util.Scanner;
public class Assignment2C {
    static float distanceToMoon(float m)
    {
        return (float)(m * 0.0000000026f);
    }
    static float distanceInMeters(float m)
    {
        return (float)(m * 40);
    }
    public static void main (String[] args){
        System.out.println("[Distance Calculator]");
            float animalCrackers;
            float meters;
            float distance;
            System.out.print("How many meters? ");
            Scanner sc = new Scanner(System.in);
            meters = sc.nextFloat();
            distance = distanceToMoon(meters);
            animalCrackers = distanceInMeters(meters);
            System.out.println(meters + " meter(s) is...\n..."+distance+ " distance from the Moon\n..."+animalCrackers+" Animal Crackers long");
        }




}
/*
Assignment 2C:
Useful Conversions: We are familiar with converting information from one format to another.
For example, in lecture we learned how to convert temperature from Fahrenheit to Celsius. For
this assignment, you will use constants to develop equally useful conversion tools.
You will build a program that asks users for a number in meters. You will then calculate how
far that is in the following units of measure:
• Distance to the Moon
• Animal Crackers
Refer to the sample output to see the conversion rates. You will use constants to store the
conversion rate – points will be deducted if you do not use those constants in the program
calculations.
The algorithm output is as shown below, with user input in bold. Follow the output format
exactly. Save your source code in a file called Assignment2C (with a file extension of .cpp, .cs
or .java)
Sample Output #1:
[Distance Calculator]
How many meters? 1
1 meter(s) is...
...0.0000000026 distance from the Moon
...40 Animal Crackers long
Sample Output #2:
[Distance Calculator]
How many meters? 30.2
30.2 meter(s) is...
...0.000000079 distance from the Moon
...1208 Animal Crackers long
---------------------------------------------------------------
 */
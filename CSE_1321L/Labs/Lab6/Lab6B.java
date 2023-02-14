//==================================== Program Lab6B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 6B
 */
// Program Lab6B.java
//
import java.util.Scanner;
import java.util.Random;

public class Lab6B
{
    public static void main (String[] args)
    {
        int userInput;
        int counts = 0;
        int randInt = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 1000: ");
        userInput = sc.nextInt();
        // Generate random integers in range 0 to 9

        while(userInput != randInt && userInput >= 1 && userInput <= 1000) {
            randInt = rand.nextInt(1000);
            counts++;
            System.out.println("My guess was "+randInt);
        }
        System.out.print("I guessed the number "+ userInput + " and it only took me "+ counts + " guesses");
    }
}

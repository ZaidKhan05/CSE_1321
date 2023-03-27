//==================================== Program Lab9A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 9A
 */
// Program Lab9A.java
//
import java.util.Scanner;
public class Lab9A
{
    public static void main (String[] args)
    {
        //e
        Scanner sc = new Scanner(System.in);
        int userInput;
        boolean sentinel = true;
        int[] array1 = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for(int i = 0; i < array1.length;i++){
            System.out.print("Integer " + (i+1) + ": ");
            userInput = sc.nextInt();
            array1[i] = userInput;
        }
        System.out.print("What is the target number: ");
        userInput = sc.nextInt();
        for(int i = 0; i< array1.length; i++){
            if(userInput == array1[i]){
                System.out.print("The target is in the set.");
                sentinel = false;
                break;
            }
            else{
                sentinel = true;
            }
        }
        if(sentinel){
            System.out.print("The target is not in the set.");
        }
    }
}
/*
Lab9A: Warmup.
Write a program that uses an array (of size 10) to demonstrate how to use the linear search
algorithm to search through a user generated list of numbers for a specific value. Assume that the
numbers in the list will be integers from between -100 and +100. You should store the numbers in a
1D array. The logic and print statements declaring whether the target is or is not in the set of numbers
should also be located in your main method.
Tip: Make sure to check out the slides in the link above for the algorithm in your language.
Remember, the file name should be Lab9A.
The user input is indicated in bold.
Sample output #1
Please enter 10 numbers:
Integer 1: 15
Integer 2: 12
Integer 3: 89
Integer 4: -14
Integer 5: 11
Integer 6: -99
Integer 7: 1
Integer 8: 42
Integer 9: 27
Integer 10: 2
 What is the target number: 42
The target is in the set.
Sample output #2
Please enter 10 numbers:
Integer 1: 15
Integer 2: 12
Integer 3: 89
Integer 4: -14
Integer 5: 11
Integer 6: -99
Integer 7: 1
Integer 8: 42
Integer 9: 27
Integer 10: 2
What is the target number: -3
The target is not in the set. 
 */

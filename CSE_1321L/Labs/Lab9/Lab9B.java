//==================================== Program Lab9B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 9B
 */
// Program Lab9B.java
//

import java.util.Scanner;
public class Lab9B
{
    public static void main (String[] args)
    {
        //e
        int rows, columns;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = sc.nextInt();
        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + (rows*columns) +" spaces.");
        int[][] arraySpaces = new int [rows][columns];
        System.out.println("The " + rows + "x" + columns + " array:");

        for(int i = 0; i < arraySpaces.length; i++){
            for(int j = 0; j <arraySpaces[0].length; j++){
                arraySpaces[i][j] = count;
                count++;
                System.out.print((arraySpaces[i][j]) + "|");
            }
            System.out.println();
        }
    }
}

/*
Lab9B: Binary Bubbles.
Binary search is a very fast searching algorithm, however it requires a set of numbers to be sorted first.
For this lab, create an array full of 11 integers which the user will generate. Like in the previous lab,
assume that the values will be between -100 and +100. Then, using the sorting algorithm called
BubbleSort, put the array in the correct order (from lowest to highest number). After this, please print
the array to the screen. Finally, search the array for the target value using Binary Search.
The BinarySearch code will implement the algorithm described in the lab slides. During this, you
should print out a few key values which help Binary Search function. For example, this algorithm
focuses on a low, mid, and high which correspond to the indices in the array the algorithm is
currently considering and searching.
Printing these values during the search process will help with debugging and fixing any issues.
• BubbleSort sorts the array to prepare for the next step
• BinarySearch searches the now sorted array to determine if the target value is in
the array or not
Remember, the file name should be Lab9B.
The user input is indicated in bold.
Sample output #1
Please enter 11 numbers:
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
Integer 11: 67
What is the target number : 42
The sorted set is: -99 -14 1 2 11 12 15 27 42 67 89
Low is 0
High is 10
Mid is 5
Searching
Low is 6
High is 10
Mid is 8
Searching
The target is in the set.
Page 4 of 4
Sample output #2
Please enter 11 numbers:
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
Integer 11: 67
What is the target number: -5
The sorted set is: -99 -14 1 2 11 12 15 27 42 67 89
Low is 0
High is 10
Mid is 5
Searching
Low is 0
High is 4
Mid is 2
Searching
Low is 0
High is 1
Mid is 0
Searching
Low is 1
High is 1
Mid is 1
Searching
The target is not in the set. 
 */
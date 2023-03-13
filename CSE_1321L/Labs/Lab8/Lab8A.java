//==================================== Program Lab8A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 8A
 */
// Program Lab8A.java
//
import java.util.Scanner;
public class Lab8A
{
    public static void main (String[] args)
    {
        //e
        Scanner sc = new Scanner(System.in);
        int arrayInput;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        //int[] arraySum = new int [5];
        System.out.println("Please enter 5 integers for the first array");
        for(int i = 0; i < array1.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            arrayInput = sc.nextInt();
            array1[i] = arrayInput;
        }
        System.out.println("Please enter 5 integers for the second array");
        for(int i = 0; i < array1.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            arrayInput = sc.nextInt();
            array2[i] = arrayInput;
        }
        System.out.print("The resulting sums are ");
        for(int i = 0; i< array1.length; i++){
            System.out.print((array1[i]+array2[i]) + "|");
        }

    }
}

/*
Lab8A:
For this exercise you will be creating 2 different arrays. Both should store integers and be able to hold 5
elements. The user should be able to fill both up with different values. Once the arrays have been
created and data is added to each array, you should add the elements at each index array 1 to the
element at each index from the array 2. Please store the addition of each index in a new array and print
this array out like shown below.
As always:
• Remember, the class name should be Lab8A.
• The user input is indicated in bold.
Sample Output #1:
Please enter 5 integers for the first array:
Integer 1: 4
Integer 2: 10
Integer 3: 50
Integer 4: 21
Integer 5: 5
Please enter 5 integers for the second array:
Integer 1: 5
Integer 2: 1
Integer 3: 16
Integer 4: 4
Integer 5: 6
The resulting sums are 9|11|66|25|11|
 */
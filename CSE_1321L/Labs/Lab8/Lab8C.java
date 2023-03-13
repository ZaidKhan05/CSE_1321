//==================================== Program Lab8C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 8C
 */
// Program Lab8C.java
//

import java.util.Scanner;

public class Lab8C
{
    public static void main (String[] args)
    {
        //e
        int rows, columns, area;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = sc.nextInt();
        area = rows*columns;
        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + area +" spaces.");
        int[][] arraySpaces = new int [rows][columns];
        System.out.println("The " + rows + "x" + columns + " array:");

        for(int i = 0; i < arraySpaces.length; i++){
            for(int j = 0; j <arraySpaces[0].length; j++){
                System.out.print(count + "|");
                count++;
            }
            System.out.println();
        }
        System.out.println("The "+rows+"x"+columns+" 2-D array flattened into a "+area+" cell 1-D array: ");
        count = 1;
        for(int i = 0; i < area; i++){
            System.out.print(count + "|");
            count++;
        }
    }
}

/*
Lab8C: 2D or not 2D
For this exercise you will be writing a program that will build upon Lab8B. So please make a
new class file, copy, and rename the code you have already written for Lab8B. Please also remember
to rename the file and (and in the case of Java and C# students) class name to Lab8C.
For this exercise, please take the array that was filled up with values and flatten it i.e., convert the 2-D
array to a 1-D array that contains the same values. Please do not just print the 2-D array to look like
a 1-D array
Hint: You will have to take the 2-D array’s total number of cells and make a 1-D array of the same size.
Please refer to the sample output below for visualization and match its style.
As always:
• Remember, the class name should be Lab8C.
• The user input is indicated in bold.
Sample Output #1:
Please enter the number of rows: 4
Please enter the number of columns: 4
I have 4 rows and 4 columns. I need to fill-up 16 spaces.
The 4x4 array:
1|2|3|4|
5|6|7|8|
9|10|11|12|
13|14|15|16|
The 4x4 2-D array flattened into a 16 cell 1-D array:
1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|
Sample Output #2:
Please enter the number of rows: 3
Please enter the number of columns: 2
I have 3 rows and 2 columns. I need to fill-up 6 spaces.
The 3x2 array:
1|2|
3|4|
5|6|
The 3x2 2-D array flattened into a 6 cell 1-D array:
1|2|3|4|5|6|
 */
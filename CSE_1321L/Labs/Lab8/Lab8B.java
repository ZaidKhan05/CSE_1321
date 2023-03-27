//==================================== Program Lab10B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 8B
 */
// Program Lab10B.java
//

import java.util.Scanner;
public class Lab8B
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


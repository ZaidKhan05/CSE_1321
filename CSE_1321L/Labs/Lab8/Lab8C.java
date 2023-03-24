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
        int[] flatArray = new int[area];

        for(int i = 0; i < arraySpaces.length; i++){
            for(int j = 0; j <arraySpaces[0].length; j++){
                arraySpaces[i][j] = count;
                count++;
                System.out.print((arraySpaces[i][j]) + "|");
            }
            System.out.println();
        }
        System.out.println("The "+rows+"x"+columns+" 2-D array flattened into a "+flatArray.length+" cell 1-D array: ");

        for(int i = 0; i < arraySpaces.length; i++){
            for(int j = 0; j< arraySpaces[0].length; j++){
                flatArray[i] = arraySpaces[i][j];
                System.out.print(flatArray[i]+"|");
            }
        }
        
    }
}

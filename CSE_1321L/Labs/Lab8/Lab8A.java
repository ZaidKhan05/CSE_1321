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


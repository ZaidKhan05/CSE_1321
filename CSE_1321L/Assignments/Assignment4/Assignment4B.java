//==================================== Program Assignment4B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 4B
 */

import java.util.Scanner;

public class Assignment4B {

    public static void main(String args[]){
        int sizeSquare, sizeBorder, colorSquare, colorBorder, width, height;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the size of the square: ");
            sizeSquare = sc.nextInt();
            if(sizeSquare < 1){
                System.out.println("Invalid input!");
            }
        }while(sizeSquare < 1);
        do{
            System.out.print("Enter the size of the border: ");
            sizeBorder = sc.nextInt();
            if(sizeBorder < 1){
                System.out.println("Invalid input!");
            }
        }while(sizeBorder < 1);
        do{
            System.out.print("Enter the color of the square: ");
            colorSquare = sc.nextInt();
            if(colorSquare < 0||colorSquare > 1){
                System.out.println("Invalid input!");
            }
        }while(colorSquare < 0 || colorSquare > 1);
        do{
            System.out.print("Enter the color of the border: ");
            colorBorder = sc.nextInt();
            if(colorBorder < 0){
                System.out.println("Invalid input!");
            }
        }while(colorBorder < 0 || colorBorder > 1);

        width = sizeSquare+sizeBorder*2;
        height = sizeSquare+sizeBorder*2;

        System.out.println("PBM File Contents:\nP1");

        System.out.println(width+" "+height);

        for(int i = 1; i<=height; i++){
            for(int j = 1; j<=width; j++){
                if(i<=sizeBorder || i>(sizeBorder+sizeSquare) || j<=sizeBorder || j>(sizeBorder+sizeSquare)){
                    System.out.print(colorBorder+" ");
                }
                else{
                    System.out.print(colorSquare + " ");
                }
            }
            System.out.println();
        }
    }
}
/*
Assignment 4B: Create your own image!
Most images are saved in binary format – this means they are not human readable
without special software like a hex editor. However, a few are saved in ASCII mode, and
you can read and edit them with just a text editor. One such type is the monochrome
Portable Bitmap image format. For this assignment, you will create a program that
generates the contents of a PBM file for a square image (we’ll learn how to actually
save a file in CSE 1322).
PBM files have the following header format:
P1
WIDTH HEIGHT
DATA
“P1” is an ID that tells programs this is a PBM file; it must be on the first line. Following
that are the width and height of the image as integers. Finally we have the data itself; a
series of 1s and 0s that represent the pixels (1 == black, 0 == white).
You will first prompt the user for the following information:
 What size square do they want to make?
 What size border should the square have?
 What color should the square be?
 What color should the border be?
Use loops to prevent the user from advancing until they enter valid information for each
question. Then, generate the PBM file contents and display it to the user. If you’re
interested in actually seeing the image itself, check the appendix of this assignment.
Call the file name Assignment4B(.java, .cs, .cpp) and the class name Assignment4B.
User input is indicated in bold
Sample Output #1:
Enter the size of the square: -5
Invalid input!
Enter the size of the square: 5
Enter the size of the border: 1
Enter the color of the square: 1
Enter the color of the border: 0
PBM File Contents:
P1
7 7
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 1 1 1 1 1 0
0 1 1 1 1 1 0
0 1 1 1 1 1 0
0 1 1 1 1 1 0
0 0 0 0 0 0 0
Sample Output #2:
Enter the size of the square: 4
Enter the size of the border: 3
Enter the color of the square: 2
Invalid input!
Enter the color of the square: 1
Enter the color of the border: 0
PBM File Contents:
P1
10 10
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
 */
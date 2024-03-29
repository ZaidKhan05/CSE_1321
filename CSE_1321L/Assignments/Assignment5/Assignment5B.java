//==================================== Program Assignment7B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 5B
 */

import java.util.Scanner;

public class Assignment5B {

    public static void main(String args[]){
        //e
        /////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        boolean sentinel = true;
        int width, height, fillColor, choice, row, column, fillLength, help;
        String direction;
        /////////////////////////////////////
        System.out.println("[KSU Image Manipulation Program]");
        do{
            System.out.print("Enter an image width: ");
            width = sc.nextInt();
            if(width < 1){
                System.out.println("Invalid input!");
            }
        }while(width < 1);
        do{
            System.out.print("Enter an image height: ");
            height = sc.nextInt();
            if(height < 1){
                System.out.println("Invalid input!");
            }
        }while(height < 1);
        do{
            System.out.print("Enter the fill color: ");
            fillColor = sc.nextInt();
            if(fillColor < 1 || fillColor > 255){
                System.out.println("Invalid input!");
            }
        }while(fillColor < 1 || fillColor > 255);
        ///////////////////////////////
        //create 2d array for image
        int[][] pbmImage = new int [height][width];
        for(int i = 0; i < pbmImage.length; i++){
            for(int j = 0; j <pbmImage[0].length; j++){
                pbmImage[i][j] = fillColor;
            }
        }
        do{
            //e
            System.out.println("What will you do?\n" +
                    "1) Fill in a pixel\n" +
                    "2) Fill in a line\n" +
                    "3) Print the image\n" +
                    "4) Quit");
            System.out.print("Choice? ");
            choice = sc.nextInt();

            switch (choice){
                case(1):
                    //fill in pixel
                    do {
                        System.out.print("Row: ");
                        row = sc.nextInt();
                        System.out.print("Column: ");
                        column = sc.nextInt();
                        System.out.print("New Color: ");
                        fillColor = sc.nextInt();
                        if(row>pbmImage.length||row<1||column> pbmImage[0].length||column<1||fillColor < 1 || fillColor > 255){
                            System.out.println("Invalid information!");
                        }
                        else{
                            sentinel = false;
                        }
                    }while(sentinel);
                    sentinel = true;
                    pbmImage[row][column] = fillColor;
                    break;
                case(2):
                    //fill in line
                    do {
                        System.out.print("Row: ");
                        row = sc.nextInt();
                        System.out.print("Column: ");
                        column = sc.nextInt();
                        System.out.print("New Color: ");
                        fillColor = sc.nextInt();
                        System.out.print("Length: ");
                        fillLength = sc.nextInt();
                        System.out.print("Direction: ");
                        sc.nextLine();
                        direction = sc.nextLine();
                        if(row>pbmImage.length||row<1||column> pbmImage[0].length||column<1||fillColor < 1 || fillColor > 255 || !(direction.equals("up")|| direction.equals("down")|| direction.equals("left")|| direction.equals("right"))){
                            System.out.println("Invalid information!");
                        }
                        else{
                            sentinel = false;
                        }
                    }while(sentinel);
                    sentinel = true;
                    if(direction.equals("up")){
                        ++row;
                        help = row-1;
                        for(int i = 0; i < row; i++){
                            if(help<fillLength) {
                                pbmImage[i][column] = fillColor;
                            }
                            help--;
                        }
                    }
                    else if(direction.equals("down")){
                        System.out.println("this is confusion");
                    }
                    else if(direction.equals("left")){
                        ++column;
                        help = column-1;
                        for(int i = 0; i < column; i++){
                            if(help<fillLength) {
                                pbmImage[row][i] = fillColor;
                            }
                            help--;
                        }
                    }
                    else if(direction.equals("right")){
                        System.out.println("this is confusion");
                    }
                    break;
                case(3):
                    //print image
                    System.out.println("PGM Image Contents\n" +
                            "P2\n" +
                            width+" " +height+"\n" +
                            "255");
                    for(int i = 0; i < pbmImage.length; i++){
                        for(int j = 0; j <pbmImage[0].length; j++){
                            System.out.print((pbmImage[i][j]) + " ");
                        }
                        System.out.println();
                    }

                    break;
                case(4):
                    //quit
                    sentinel = false;
                    System.out.println("[ClosingDirectory...]");
                    break;
                default:
                    System.out.println("That is not an option!");
                    
            }
        }while(sentinel);

    }
}
/*
Assignment 5 B: Art Program. We’re going to build on our PBM image creator from
Assignment 4 to create a fully functional image editor, using 2D arrays to store our changes.
We’ll also make it a little more interesting by switching to the Portable Gray Map standard. 8 bit
PGM files have color values ranging from 0 (black) to 255 (white), with the values in-between
being shades of gray. The header is very similar to PBM, and looks like this:
P2
WIDTH HEIGHT
255
IMAGE_DATA
The P2 tells image readers that it is a PGM file, and the 255 indicates the largest possible color
value is 255. Otherwise, it’s the same as Assignment 4.
You will first prompt the user to enter a width, height, and initial color value to fill the image. You
should then create a 2D array with those dimensions and initialize each cell with that color
value.
You will then use a loop to create a menu that repeatedly prompts the user to make one of the
following choices:
 Fill in a pixel with a new color
◦ Prompt the user to enter a row and column value and a new color value. If the array
has that row and column index AND the color value is between 0 – 255, change the
color at the index.
Otherwise, inform the user that it’s an invalid command.
 Fill in a line with a new color
◦ Prompt the user to enter a starting row and column value, a new color value, a length
value, and a direction (left, right, up, or down, case sensitive).
If all those values are valid, fill in each index in the line with those values in the 2D
array (you can open up a program like Excel if you need help visualizing this)
If the row, column, color, and/or direction are not correct, inform the user that it’s an
invalid command.
If the length is correct but would go outside the array (e.g. a length of 20 but the
array only has 10 columns), fill in values up to the edge of the array and then stop.
Do not cause an ArrayOutOfBounds error.
 Print the PGM file
◦ This should print out the contents of a valid PGM image. You should be able to copy
and paste the output into a file and load it in the same way as you did with the PBM
file in Assignment 4 – the only difference is that the extension should be .pgm.
 Quit
Sample Output:
[KSU Image Manipulation Program]
Enter an image width: 5
Enter an image height: 7
Enter the fill color: 24
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 3
PGM Image Contents
P2
5 7
255
24 24 24 24 24
24 24 24 24 24
24 24 24 24 24
24 24 24 24 24
24 24 24 24 24
24 24 24 24 24
24 24 24 24 24
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 1
Row: 40
Column: 2
New Color: 23
Invalid information!
Row: 2
Column: 1
New Color: 123
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 2
Row: 5
Column: 3
New Color: 245
Length: 6
Direction: up
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 3
PGM Image Contents
P2
5 7
255
24 24 24 245 24
24 24 24 245 24
24 123 24 245 24
24 24 24 245 24
24 24 24 245 24
24 24 24 245 24
24 24 24 24 24
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 4
[Exiting KSU Image Manipulation Program]
*/
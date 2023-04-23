//==================================== Program Assignment7B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 7B
 */

import java.util.Scanner;

class pixel{
    public int red;
    public int green;
    public int blue;

    // public pixel(){
    //     red = 0;
    //     green = 0;
    //     blue = 0;
    // }
    void changeRGB(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    void printRGB(){
        System.out.print(this.red+" "+this.green+" "+this.blue);
    }
}

public class Assignment7B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //e
        int redVal;
        int greenVal;
        int blueVal;
        System.out.println("[Color Art Program]");
        System.out.print("Enter an image width: ");
        int width = sc.nextInt();
        System.out.print("Enter an image height: ");
        int height = sc.nextInt();

        pixel[][] image = new pixel [height][width];
        // for(int i = 0; i < image.length; i++){
        //     for(int j = 0; j < image[0].length; j++){
        //         image[i][j] = new pixel();
        //        // System.out.print((image[i][j]) + "|");
        //     }
        //    // System.out.println();
        // }
        System.out.print("Enter the fill color's red value: ");
        redVal = sc.nextInt();
        System.out.print("Enter the fill color's green value: ");
        greenVal = sc.nextInt();
        System.out.print("Enter the fill color's blue value: ");
        blueVal = sc.nextInt();

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                image[i][j] = new pixel();
                image[i][j].changeRGB(redVal, greenVal, blueVal);
                // image[i][j].printRGB();
            }
           // System.out.println();
        }
        do{
            //e
            break;
        }while(true);
    }
}
/*
 Assignment 7 B: Color Art Program! For our last assignment in CSE 1321L, we’ll
introduce a final image format. PPM (Portable Pixmap) use three integers to represent a
pixel – this means we can have images with RGB colors.
You will create a Pixel class which has three attributes:
 red: int
 green: int
 blue: int
You will create a default constructor that initializes those values to 255, and an
overloaded constructor that takes user input to assign the values. The class will also
have the following functions:
 changeRGB (): Takes in three integers to update the red, green, and blue
attributes. Returns nothing.
 printRGB (): Takes in nothing. Prints the red, green, and blue attributes in order
with a single space in-between each value. Returns nothing.
You will then recreate the art program from Assignment 5 with the following changes:
 Instead of a 2D array of integers, you will create a 2D array of Pixel object. Don’t
be scared! This is similar to creating a 2D array of strings.
 You will prompt for three color values instead of one – red, green, and blue.
These must be stored in a Pixel object in a cell in the 2D array.
 You will create a PPM file instead of PGM file – the magic number is “P3” and
there will be three integers printed per pixel instead of one.
Sample Output:
[Color Art Program]
Enter an image width: 3
Enter an image height: 4
Enter the fill color’s red value: 21
Enter the fill color’s green value: 25
Enter the fill color’s blue value: 200
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 3
PPM Image Contents
P3
3 4
255
21 25 200 21 25 200 21 25 200
21 25 200 21 25 200 21 25 200
21 25 200 21 25 200 21 25 200
21 25 200 21 25 200 21 25 200
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 1
Row: 2
Column: 1
New Red Color: 123
New Blue Color: 98
New Green Color: 5
What will you do?
1) Fill in a pixel
2) Fill in a line
3) Print the image
4) Quit
Choice? 3
PPM Image Contents
P3
3 4
255
21 25 200 21 25 200 21 25 200
21 25 200 21 25 200 21 25 200
21 25 200 123 98 5 21 25 200
21 25 200 21 25 200 21 25 200

*/
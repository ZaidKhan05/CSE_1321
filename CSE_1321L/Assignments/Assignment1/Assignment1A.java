//==================================== Program Assignment1A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 1A
 */

import java.util.Scanner;

public class Assignment1A {
    public static void main (String[] args){
        //////////////////////////
        //variables
        //inputs
        int red, green, blue;
        //inverted
        int ired, igreen, iblue;
        //floating point
        float fred, fgreen, fblue;
        //////////////////////////

        //get red and convert to inverted
        System.out.print("Enter a red value (0-255): ");
        Scanner sc = new Scanner (System.in);
        red = sc.nextInt();
        //convert to inverted
        ired = 255-red;
        //convert int to float here because otherwise it gives it a decimal point and so the code doesnt yell at me trying to divide a integer into a float
        float Ired = ired;
        //convert to floating point
        fred = Ired / 255f;

        //get green and convert to inverted
        System.out.print("Enter a green value (0-255): ");
        green = sc.nextInt();
        igreen = 255-green;
        float Igreen = igreen;
        fgreen = Igreen / 255f;

        //get blue and convert to inverted
        System.out.print("Enter a blue value (0-255): ");
        blue = sc.nextInt();
        iblue = 255-blue;
        float Iblue = iblue;
        fblue = Iblue / 255f;
        /////////////////////////////////

        System.out.println("The inverted color is red="+ired+", green="+igreen+", blue="+iblue);
        System.out.println("With floating points, that would be red="+fred+", green="+fgreen+", blue="+fblue);

        sc.close();


    }
}
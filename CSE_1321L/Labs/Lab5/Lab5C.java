//==================================== Program Lab5C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 5C
 */
// Program Lab5C.java
//
import java.util.Scanner;

public class Lab5C
{
    public static void main (String[] args)
    {
        int x, y;
        System.out.print("Enter x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        if(x == 0 && y == 0){
            System.out.print("This point is the origin.");
        }
        else if(x == 0){
            System.out.print("This point is on the y axis.");
        }
        else if(y == 0){
            System.out.print("This point is on the x axis.");
        }
        else if(x > 0 && y > 0){
            System.out.print("This point is in the first quadrant.");
        }
        else if(x < 0 && y > 0){
            System.out.print("This point is in the second quadrant.");
        }
        else if(x < 0 && y < 0){
            System.out.print("This point is in the third quadrant.");
        }
        else if(x > 0 && y < 0){
            System.out.print("This point is in the fourth quadrant.");
        }
    }
}

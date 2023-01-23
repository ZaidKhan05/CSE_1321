//==================================== Program Lab2C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 2C
 */
// Program Lab2C.java
//
import java.util.Scanner;
public class Lab2C
{
    public static void main (String[] args)
    {
        int width, height, area, perimeter;
        System.out.print("Enter a width: ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        System.out.print("Enter a height: ");
        height = sc.nextInt();
        area = width * height;
        perimeter = (width + height) * 2;
        System.out.print("The area is "+area+"\nThe perimeter is "+perimeter);
        sc.close();
    }
}

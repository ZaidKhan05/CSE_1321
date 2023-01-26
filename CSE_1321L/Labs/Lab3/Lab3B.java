//==================================== Program Lab3B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 3B
 */
// Program Lab3B.java
//
import java.util.Scanner;

public class Lab3B
{
    public static void main (String[] args)
    {
        int hours1, grades1, hours2, grades2, hours3, grades3, hours4, grades4;
        float GPA, hoursT, qualityT;
        //course 1
        System.out.print("Course 1 hours: ");
        Scanner sc = new Scanner(System.in);
        hours1 = sc.nextInt();
        System.out.print("Grade for course 1: ");
        grades1 = sc.nextInt();
        //course 2
        System.out.print("Course 2 hours: ");
        hours2 = sc.nextInt();
        System.out.print("Grade for course 2: ");
        grades2 = sc.nextInt();
        //course 3
        System.out.print("Course 3 hours: ");
        hours3 = sc.nextInt();
        System.out.print("Grade for course 3: ");
        grades3 = sc.nextInt();
        //course 4
        System.out.print("Course 4 hours: ");
        hours4 = sc.nextInt();
        System.out.print("Grade for course 4: ");
        grades4 = sc.nextInt();
        //Total hours
        hoursT = (float)hours1 + hours2 + hours3+ hours4;
        System.out.println("Total hours is: " + hoursT);
        //quality points
        qualityT =(float) hours1*grades1+hours2*grades2+hours3*grades3+hours4*grades4;
        System.out.println("Total quality points is: " + qualityT);
        //GPA
        GPA = qualityT/hoursT;
        System.out.printf("Your GPA for this semester is " + GPA);
    }
}
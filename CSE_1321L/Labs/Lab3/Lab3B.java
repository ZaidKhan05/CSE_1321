import java.util.Scanner;

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
public class Lab3B
{
    public static void main (String[] args)
    {
        int hours1, grades1, hours2, grades2, hours3, grades3, hours4, grades4, hoursT, qualityT;
        float GPA;
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
        hoursT = hours1 + hours2 + hours3+ hours4;
        System.out.println("Total hours is: " + hoursT);
        //quality points
        qualityT = hours1*grades1+hours2*grades2+hours3*grades3+hours4*grades4;
        System.out.println("Total quality points is: " + qualityT);
        //GPA
        GPA = (float)qualityT/hoursT;
        System.out.printf("Your GPA for this semester is " + String.format("%.5f", GPA));
    }
}
/*
Lab3B: GPA calculator. We’re getting more practice making a calculator! GPA is important. It’s one of the
many things employers look at when recruiting new candidates. You also need a GPA of at least 2.0 to
graduate from KSU. GPA is measured by “quality points” using the following scale:
A = 4 quality points
B = 3 quality points
C = 2 quality points
D = 1 quality point
F = 0 quality points
Each course counts for a certain number of credit hours. For instance, most courses are 3 credit hours. This lab
is a 1 credit hour course. Calculus counts 4 credit hours. To calculate the quality points for one course, multiply
the number of hours of that course times the quality points you earn for that course.
To calculate your GPA for the whole semester, you take the total number of quality points earned that semester
and divide it by the total number of hours taken that semester.
For this lab, write a program that reads from the user the number of hours and quality points earned for four
courses then calculates the total hours, total quality points and GPA. You should only use floats as the data
type for your variables. An example run is shown below. The user input is in bold.
//////////////////////////
Sample run 1:
Course 1 hours: 4   //input
Grade for course 1: 4   //input
Course 2 hours: 3     //input
Grade for course 2: 3      //input
Course 3 hours: 3         //input
Grade for course 3: 4       //input
Course 4 hours: 4       //input
Grade for course 4: 4       //input
Total hours is: 14
Total quality points is: 53
Your GPA for this semester is 3.78571
/////////////////////////
Sample run 2:
Course 1 hours: 4
Grade for course 1: 1
Course 2 hours: 1
Grade for course 2: 4
Course 3 hours: 3
Grade for course 3: 4
Course 4 hours: 3
Grade for course 4: 3
Total hours is: 11
Total quality points is: 29
Your GPA for this semester is 2.63636
 */
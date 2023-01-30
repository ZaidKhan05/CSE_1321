//==================================== Program Lab4A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 4A
 */
// Program Lab4A.java
//
import java.util.Scanner;

public class Lab4A
{
    public static void main (String[] args)
    {
        //float AP, AN, AM, BP, BN, BM, CP, CN, CM, DP, DN, DM, F;
        float score;
        System.out.print("Enter the score of your exam: ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextFloat();
        System.out.print("Letter grade is: ");
        if(score >= 98){
            System.out.print("A+");
        }
        else if(score >= 95){
            System.out.print("A");
        }
        else if(score >= 92){
            System.out.print("A-");
        }
        else if(score >= 89){
            System.out.print("B+");
        }
        else if(score >= 86){
            System.out.print("B");
        }
        else if(score >= 83){
            System.out.print("B-");
        }
        else if(score >= 80){
            System.out.print("C+");
        }
        else if(score >= 77){
            System.out.print("C");
        }
        else if(score >= 74){
            System.out.print("C-");
        }
        else if(score >= 71){
            System.out.print("D+");
        }
        else if(score >= 68){
            System.out.print("D");
        }
        else if(score >= 65){
            System.out.print("D-");
        }
        else if(score >= 0){
            System.out.print("F");
        }



    }
}
/*
Lab4A: What is my grade?
First, we are going to start with a very simple question to understand use case of conditional statements.
Imagine someone just got an exam grade back and was wondering what letter grade they would get.
You should write a program that will prompt the user to input number grade they received on their exam and
returns the letter grade they will get for that numerical grade that was entered.
Fractional numerical values (90.5 is an acceptable input) should also be accounted for.
Use the below table as a reference to determine which numerical grades correspond to which letter grades:
Letter Grade Range
A+ 98 - 100
A 95 -97
A- 92 - 94
B+ 89 - 91
B 86 - 88
B- 83 - 85
C+ 80 - 82
C 77 -79
C- 74 - 76
D+ 71 - 73
D 68 -70
D- 65 - 67
F 0 - 64
Remember, the class name should be Lab4A.
Sample runs are shown in the next page. The user input is in bold.
 Page 2 of 6
Sample run #1:
Enter the score of your exam: 96
Letter grade is: A
Sample run #2:
Enter the score of your exam: 97.5
Letter grade is: A+
Sample run #3:
Enter the score of your exam: 42
Letter grade is: F
 */
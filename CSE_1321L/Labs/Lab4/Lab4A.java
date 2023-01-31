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
        else{
            System.out.print("That is not the right input.");
        }



    }
}

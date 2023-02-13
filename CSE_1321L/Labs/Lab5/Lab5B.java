//==================================== Program Lab5B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 5B
 */
// Program Lab5B.java
//
import java.util.Scanner;

public class Lab5B
{
    public static void main (String[] args)
    {
        int userInput;
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
        if(userInput%2 == 0 ){
            System.out.print("This number is divisible by 2");
        }
        
        else if(userInput%5 == 0 ){
            System.out.print("This number is divisible by 5");
        }
        else{
            System.out.print("This number is undetermined");
        }
        sc.close();

    }
}

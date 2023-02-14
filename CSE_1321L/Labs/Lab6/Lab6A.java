//==================================== Program Lab6A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 6A
 */
// Program Lab6A.java
//
import java.util.Scanner;

public class Lab6A
{
    public static void main (String[] args)
    {
        int userInput, largestNumber;
        largestNumber = 0;
        Scanner sc = new Scanner(System.in);

        for(int counts = 1; counts <=10; counts++){
            System.out.print("Please enter number "+counts+": ");
            userInput = sc.nextInt();
            if(userInput > largestNumber){
                largestNumber = userInput;
            }
        }
        System.out.print("The largest number was "+largestNumber);
    }
    
}

//==================================== Program Lab5A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 5A
 */
// Program Lab5A.java
//
import java.util.Scanner;

public class Lab5A
{
    public static void main (String[] args)
    {
        String userInput;
        System.out.println("Do you have a driving permit (Y/N)?");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        if(userInput.equalsIgnoreCase("Y")){
            System.out.println("Do you have a commercial driving license (Y/N)?");
            userInput = sc.nextLine();
            if(userInput.equalsIgnoreCase("Y")){
                System.out.print("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
            else if(userInput.equalsIgnoreCase("N")){
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }
        else if(userInput.equalsIgnoreCase("N")){
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
        sc.close();
    }        
    
}

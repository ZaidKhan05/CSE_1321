//==================================== Program Lab4C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 4C
 */
// Program Lab4C.java
//
import java.util.Scanner;

public class Lab4C
{
    static float additiveInverse(float num){
        num = -num;
        return(float)(num);
    }
    static float getReciprocal(float num){
        num = 1/num;
        return(float)(num);
    }
    static float getSquare(float num){
        num = num*num;
        return(float)(num);
    }
    static float getCube(float num){
        num = num*num*num;
        return(float)(num);
    }


    public static void main (String[] args)
    {
        float number, numberChange;
        int whatDo;
        System.out.print("Welcome!\nPlease input a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextFloat();
        numberChange = number;
        System.out.println("\nWhat would you like to do to this number:\n" +
                "0) Get the additive inverse of the number\n" +
                "1) Get the reciprocal of the number\n" +
                "2) Square the number\n" +
                "3) Cube the number\n" +
                "4) Exit the program");
        whatDo = sc.nextInt();
        switch(whatDo){
            case 0:
                numberChange = additiveInverse(number);
                System.out.print("The additive inverse of " + number + " is " + numberChange);
                break;
            case 1:
                numberChange = getReciprocal(number);
                System.out.print("The reciprocal of " + number + " is " + numberChange);
                break;
            case 2:
                numberChange = getSquare(number);
                System.out.print("The square of " + number + " is " + numberChange);
                break;
            case 3:
                numberChange = getCube(number);
                System.out.print("The cube of " + number + " is " + numberChange);
                break;
            case 4:
                System.out.print("Thank you, goodbye!");
                break;
            default:
                System.out.print("Invalid input, please try again!");
        }
    }
}

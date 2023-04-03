//==================================== Program Lab11B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 11B
 */
// Program Lab11B.java
//

import java.util.Scanner;
public class Lab11B
{
    public static boolean isValid(double width, double height){
        //e
        boolean result;
        if(width<height){
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
    public static double area(double width, double height){
        //e
        double result = width*height;
        return result;
    }
    public static double perimeter(double width, double height){
        //e
        double result = width*2+height*2;
        return result;
    }
    public static void main (String[] args) {
        //e
        double width, height;
        boolean sentinel = true;
        String checker;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();

            if(isValid(width, height) == false){
                System.out.println("This is an invalid rectangle");
            }
            else if(isValid(width, height) == true){
                System.out.println("The area is: "+ area(width, height));
                System.out.println("The perimeter is: "+ perimeter(width, height));
            }
            System.out.println();
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            sc.nextLine();
            checker = sc.nextLine();
            if(checker.equalsIgnoreCase("y")){
                sentinel = true;
            }
            if(checker.equalsIgnoreCase("n")){
                sentinel = false;
            }
            System.out.println();
        }while(sentinel);
        System.out.println("Program Ends");



    }
}


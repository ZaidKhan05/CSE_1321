//==================================== Program Lab10A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 9A
 */
// Program Lab10A.java
//
import java.util.Scanner;
public class Lab10A
{
    public static int max(int x, int y){
        //e
        int result;
        if(x>y) {
            result = x;
        }
        else {
            result = y;
        }
        return result;
    }
    public static int min(int x, int y){
        //e
        int result;
        if(x<y) {
            result = x;
        }
        else {
            result = y;
        }
        return result;
    }
    public static float avg(int x, int y){
        //e
        float result;
        result = ((float)x+(float)y)/2;
        return result;
    }
    public static void main (String[] args)
    {
        //e
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.println("Min is "+ min(num1, num2));
        System.out.println("Max is "+ max(num1, num2));
        System.out.println("Average is "+ avg(num1, num2));


    }
}


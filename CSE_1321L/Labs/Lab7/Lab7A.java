//==================================== Program Lab7A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 7A
 */
// Program Lab7A.java
//
import java.util.Scanner;
public class Lab7A
{
    public static void main (String[] args)
    {
        int size;
        System.out.print("Please enter a value for the size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("This is the requested "+size+"x"+size+" box:");
        for(int i = 0; i<size;i++){
            for(int j = 0; j<size;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

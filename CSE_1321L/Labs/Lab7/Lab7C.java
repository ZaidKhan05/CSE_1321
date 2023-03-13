//==================================== Program Lab8C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 7C
 */
// Program Lab8C.java
//
import java.util.Scanner;
public class Lab7C
{
    public static void main (String[] args)
    {
        int size;
        int help;
        System.out.print("Please enter a value for the size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("This is the requested "+size+"x"+size+" right-triangle:");
        for(int i = 0; i<size;i++){
            help = size-1;
            for(int j = 0; j<size;j++){
                if(help>i){
                    System.out.print(" ");
                }
                if(help<=i) {
                    System.out.print("*");
                }
                help--;//this was pain
            }
            System.out.println();
        }
    }
}

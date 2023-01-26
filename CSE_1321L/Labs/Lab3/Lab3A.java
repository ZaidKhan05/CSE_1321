//==================================== Program Lab3A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 3A
 */
// Program Lab3A.java
//
import java.util.Scanner;

public class Lab3A
{
    public static void main (String[] args)
    {
        //CREATE VARIABLES
        float amountOwed, APR, APRD, MPR, minPayment;
        //get inputs
        System.out.print("Amount owed: $");
        Scanner sc = new Scanner(System.in);
        amountOwed = sc.nextFloat();
        System.out.print("APR: ");
        APR = sc.nextFloat();
        //math
        MPR = APR / 12f;
        APRD = APR / 100;
        minPayment = amountOwed * APRD / 12;
        //print results
        System.out.println("Monthly percentage rate: " + MPR);
        System.out.println("Minimum payment: $" + minPayment);

    }
}
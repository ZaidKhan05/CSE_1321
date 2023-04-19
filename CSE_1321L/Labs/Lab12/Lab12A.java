//==================================== Program Lab12A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 12A
 */
// Program Lab12A.java
//
import java.util.Scanner;
class Chair {
    public int numOfLegs;
    public boolean rolling;
    public String material;
}
public class Lab12A
{
    public static Chair resetChair(Chair e){
        e.numOfLegs = 4;
        e.rolling = false;
        e.material = "wood";
        return e;
    }
    public static void printChair(Chair e){
        String chairStatus;
        if(e.rolling == true){
            chairStatus = " ";
        }
        else{
            chairStatus = " not ";
        }
        System.out.println();
        System.out.println("Your chair has "+e.numOfLegs+" legs, is"+ chairStatus +"rolling, and is made of "+e.material+".");
        System.out.println();
    }
    public static void main (String[] args)
    {
        //e
        Chair e = new Chair();
        Scanner sc = new Scanner(System.in);
        String chairStatus;
        System.out.println(e.rolling);
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        e.numOfLegs = sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        e.rolling = sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        sc.nextLine();
        e.material = sc.nextLine();


        printChair(e);
        System.out.println("This program is going to change that.");
        resetChair(e);
        printChair(e);

    }
}
/*

 */
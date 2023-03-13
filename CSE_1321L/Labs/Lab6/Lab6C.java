//==================================== Program Lab8C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 6C
 */
// Program Lab8C.java
//
import java.util.Scanner;

public class Lab6C
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int whatdo;
        int amountToDeposit, amountToWithdraw;
        String continueornot;
        int testint = 1;


        System.out.println("Welcome!\nYou have $"+balance+" in your account.");
        do{

            System.out.print("Menu\n" +
                    "0 - Make a deposit\n" +
                    "1 - Make a withdrawal\n" +
                    "2 - Display account value\n" +
                    "\nPlease make a selection: ");
            whatdo = sc.nextInt();
            switch(whatdo){
                case 0:
                    System.out.print("How much would you like to deposit? : ");
                    amountToDeposit = sc.nextInt();
                    balance=balance+amountToDeposit;
                    break;
                case 1:
                    System.out.print("How much would you like to Withdraw? : ");
                    amountToWithdraw = sc.nextInt();
                    balance=balance-amountToWithdraw;
                    break;
                case 2:
                    balance = balance;
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
            if(whatdo == 0 || whatdo == 1 || whatdo == 2){
                System.out.println("Your current balance is $"+balance);
            }
            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            sc.nextLine();
            continueornot = sc.nextLine();

            if(continueornot.equalsIgnoreCase("Y")){
                testint = 1;
            }
            else if(continueornot.equalsIgnoreCase("N")){
                testint = 2;
            }
        }while(testint == 1);
        System.out.print("Thank you for banking with us!");

    }
}

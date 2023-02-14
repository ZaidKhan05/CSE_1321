//==================================== Program Lab6C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 6C
 */
// Program Lab6C.java
//
import java.util.Scanner;

public class Lab6C
{
    static int deposit(int bal){
        Scanner testscanner = new Scanner(System.in);
        System.out.print("How much would you like to deposit? : ");
        int amountToDeposit = testscanner.nextInt();
        bal=bal+amountToDeposit;
        return(int)(bal);
    }
    static int withdrawal(int bal){
        //e
        Scanner testscanner = new Scanner(System.in);
        System.out.print("How much would you like to withdraw? : ");
        int amountToWithdraw = testscanner.nextInt();//why this not borken
        bal=bal-amountToWithdraw;
        return(int)(bal);
    }
    static int display(int bal){
        return(int)(bal);
    }
    public static void main (String[] args)
    {
        //e
        Scanner sc = new Scanner(System.in);
        Scanner scantest = new Scanner(System.in);
        int balance = 1000;
        int whatdo;
        String continueornot;
        boolean reloop;
        int testint = 1;


        System.out.println("Welcome!\nYou have $"+balance+" in your account");
        do{
            testint = 2;
            System.out.print("Menu\n" +
                    "0 – Make a deposit\n" +
                    "1 – Make a withdrawal\n" +
                    "2 – Display account value\n" +
                    "Please make a selection: ");
            whatdo = sc.nextInt();
            switch(whatdo){
                case 0:
                    balance = deposit(balance);
                    break;
                case 1:
                    balance = withdrawal(balance);
                    break;
                case 2:
                    balance = display(balance);//its for consistence ok
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
            if(whatdo == 0 || whatdo == 1 || whatdo == 2){
                System.out.println("Your current balance is $"+balance);
            }
            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            continueornot = scantest.nextLine();
//            sc.nextline(); //this wouldnt work at all i needed to make a whole new scanner for this

            if(continueornot.equalsIgnoreCase("y")){
                testint = 1;
            }
            else if(continueornot.equalsIgnoreCase("N")){
                testint = 2;
            }
        }while(testint == 1);

    }
}

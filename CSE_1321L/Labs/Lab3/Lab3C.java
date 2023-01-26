//==================================== Program Lab3C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 3C
 */
// Program Lab3C.java
//

import java.util.Scanner;

public class Lab3C
{
    public static void main (String[] args)
    {
        //creating the variables
        int quarterNum, dimeNum, nickelNum, pennyNum, quarterVal, dimeVal, nickelVal, pennyVal, totalVal, dollarAmount, changeAmount;
        //assigning values to the coins
        quarterVal = 25;
        dimeVal = 10;
        nickelVal = 5;
        pennyVal = 1;
        dollarAmount = 0;
        //create scanner object
        Scanner sc = new Scanner(System.in);
        //ask for inputs on number of coins
        System.out.print("Enter the number of quarters: ");
        quarterNum = sc.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimeNum = sc.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickelNum = sc.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennyNum = sc.nextInt();
        //read back inputs
        System.out.println("You entered "+quarterNum+" quarters.");
        System.out.println("You entered "+dimeNum+" dimes.");
        System.out.println("You entered "+nickelNum+" nickels.");
        System.out.println("You entered "+pennyNum+" pennies.");
        //math
        totalVal = quarterNum*quarterVal+dimeNum*dimeVal+nickelNum*nickelVal+pennyNum*pennyVal;//yes its redundant to do for pennies but for consistency i keep
        //while loop to separate the change from the dollar amount
        while(totalVal > 100){
            dollarAmount = dollarAmount + 1;
            totalVal = totalVal - 100;
        }
        //once the total value is less than 100 cents(1 dollar) because the while loop ran
        //set new total val to change amount
        changeAmount = totalVal;
        //print the total in terms of dollars and change
        System.out.println("Your total is "+dollarAmount+" dollars and "+changeAmount+" cents.");

        //THIS WORKED FIRST TRY WHAT IN THE WORLD I DIDNT EXPECT WHILE LOOPS TO WORK THIS EASILY IN JAVA WHAAAAAAAAAAAT


    }
}
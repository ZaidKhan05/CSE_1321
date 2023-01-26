import java.util.Scanner;

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
public class Lab3A
{
    public static void main (String[] args)
    {
        float amountOwed, APR, APRD, MPR, minPayment;
        System.out.print("Amount owed: $");
        Scanner sc = new Scanner(System.in);
        amountOwed = sc.nextFloat();
        System.out.print("APR: ");
        APR = sc.nextFloat();
        MPR = APR / 12f;
        APRD = APR / 100;
        minPayment = amountOwed * APRD / 12;
        System.out.println("Monthly percentage rate: " + MPR);
        System.out.println("Minimum payment: $" + minPayment);

    }
}
/*
Lab3A: Credit Cards. Financial advisors will almost always tell you that you should pay for things
in cash and avoid credit card debt. Further, they tell you that you should have a small emergency
fund that you keep stocked for emergencies like flat tires, dead refrigerators and so on. However,
life doesn’t always work that way and sometimes we need to charge things. So, for this part of the
lab, we’re going to write a calculator that calculates your minimum monthly payment on your card.
To create this calculator, we will ask the user for 1) the current balance on their credit card and 2) the APR
(Annual Percentage Rate) of the card. To calculate the minimum payment, you will multiply the current
balance on the credit card (also called the amount owed) times APR and divide this number by 12 since there
are 12 months in a year. The formula is Amount Owed × APR ÷ 12 = Minimum Payment . The input APR is a
percent, so make sure the APR is in decimal form when you are doing the calculations. The Monthly
Percentage Rate is calculated by taking the decimal form of the APR and dividing it by 12 since there are 12
months in a year.
Below is an example run. The user input is in bold.
////////////////
Sample run 1:
Amount owed: $2000 //input
APR: 19.75 //input
Monthly percentage rate: 1.646
Minimum payment: $32.92
/////////////////
Sample run 2:
Amount owed: $8500
APR: 29
Monthly percentage rate: 2.417
Minimum payment: $205.42
 */
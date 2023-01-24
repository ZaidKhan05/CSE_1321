//==================================== Program Assignment1B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 1B
 */

import java.util.Scanner;

public class Assignment1B {
    public static void main (String[] args){
        ////////////////////////////////////

        //variables
        //items person is buying
        String item1, item2;
        //amount of items
        int item1amount, item2amount;
        //unit price of the items
        double item1unit, item2unit;
        //total price of the items
        double item1total, item2total, fulltotal;
        ////////////////////////////////////
        //item 1
        System.out.print("What\'re you buying?b");
        Scanner sc = new Scanner (System.in);
        item1 = sc.nextLine();
        System.out.print("How many? ");
        item1amount = sc.nextInt();
        System.out.print("What do they cost? ");
        item1unit = sc.nextDouble();

        //item 2
        System.out.print("What else\'re you buying? ");
        //created new scanner because it was bundling the what and how many question for this second item and then gave loads of errors
        item2 = sc.nextLine();
        sc.nextLine
        System.out.print("How many? ");
        item2amount = sc.nextInt();
        System.out.print("What do they cost? ");
        item2unit = sc.nextDouble();

        //full total
        item1total = item1amount*item1unit;
        item2total = item2amount*item2unit;
        fulltotal = item1total+item2total;

        //the list stuffs
        System.out.println("Your List:\n----");
        System.out.println(item1+" ("+item1amount+")");
        System.out.println("$"+item1unit+" ($"+item1total+" total)");
        System.out.println(item2+" ("+item2amount+")");
        System.out.println("$"+item2unit+" ($"+item2total+" total)");
        System.out.println("Total Cost: $"+ fulltotal);
        System.out.print("----");

        sc.close();
    }
}

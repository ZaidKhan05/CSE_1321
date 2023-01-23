//==================================== Program Assignment1C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 1C
 */

import java.util.Scanner;

public class Assignment1C {
    public static void main (String[] args){
        int day, monthnum, year;
        String month;
        System.out.print("Enter the day (number): ");
        Scanner sc = new Scanner (System.in);
        day = sc.nextInt();
        System.out.print("Enter the month (number): ");
        monthnum = sc.nextInt();
        System.out.print("Enter the month (String): ");
        Scanner s = new Scanner (System.in);
        month = s.nextLine();
        System.out.print("Enter the year (number): ");
        year = sc.nextInt();
        System.out.println("Here are some ways to represent the date:");
        System.out.println(day+"/"+monthnum+"/"+year);
        System.out.println(year+"/"+monthnum+"/"+day);
        System.out.println(monthnum+"/"+day+"/"+year);
        System.out.println(month+" "+day+", "+year);
        System.out.println(day+" "+month+" "+year);

        sc.close();
        s.close();

    }
}
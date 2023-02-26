//==================================== Program Assignment4A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 4A
 */

import java.util.Scanner;

public class Assignment4A {
    public static void main(String args[]){
        int choice;
        int startNum;
        int continuingNum = 0;
        System.out.print("What loop do you want to use?\n" +
                "1) A loop that might run zero or more times\n" +
                "2) A loop that will always run at least once\n" +
                "3) A loop with a predetermined start and end\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("What's your start number? ");
                startNum = sc.nextInt();
                System.out.print("Counting: ");
                for(int num = 0; num <= startNum; num++){
                    System.out.print((startNum-num)+", ");
                }
            break;
            case 2:
                System.out.print("What's your start number? ");
                startNum = sc.nextInt();
                System.out.print("Counting: ");
                do{
                    System.out.print(startNum-continuingNum+", ");
                    continuingNum++;
                }while(startNum >= continuingNum);
            break;
            case 3:
                System.out.print("What is your start number? ");
                startNum = sc.nextInt();
                System.out.print("What's your end number? ");
                continuingNum = sc.nextInt();
                System.out.print("Counting: ");
                while(startNum >= continuingNum){
                    System.out.print(startNum+", ");
                    startNum--;
                }
        }

    }
}
/*
Assignment4A: Do you know your loops? We’ve learned about three different kinds of loops
in this module – WHILE loops, DO-WHILE loops, and FOR loops. In this assignment, we’re
going to make sure you know what each one does.
You will prompt the user to choose one of the following loops:
1. A loop that might run zero or more times
2. A loop that will always run at least once
3. A loop with a predetermined start and end
After the choice, you will prompt the user to enter a “start” number. If they chose option
3, you must also ask them to enter an “end” number.
You must then use the correct loop (based on the user’s choice) to print out numbers
from the starting point to the end number. For options 1 and 2, the end number is 0,
while for option 3 the user will define the end number themselves. Note that the loops
will always count down from the start number. Review your lecture material to know
which loop should be used for each option.
Call the file Assignment4A (.java, .cs, .cpp) and the class name Assignment4A. User
input is indicated in bold.
Sample Output #1:
What loop do you want to use?
1) A loop that might run zero or more times
2) A loop that will always run at least once
3) A loop with a predetermined start and end
Your choice: 1
What’s your start number? 10
Counting: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
Sample Output #2:
What loop do you want to use?
1) A loop that might run zero or more times
2) A loop that will always run at least once
3) A loop with a predetermined start and end
Your choice: 2
What’s your start number? -20
Counting: -20,
Sample Output #3:
What loop do you want to use?
1) A loop that might run zero or more times
2) A loop that will always run at least once
3) A loop with a predetermined start and end
Your choice: 1
What’s your start number? -120
Counting:
Sample Output #4:
What loop do you want to use?
1) A loop that might run zero or more times
2) A loop that will always run at least once
3) A loop with a predetermined start and end
Your choice: 3
What’s your start number? -115
What’s your end number? -120
Counting: -115, -116, -117, -118, -119, -120,
 */
//==================================== Program Lab13A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 11A
 */
// Program Lab13A.java
//
import java.util.Scanner;
public class Lab11A
{
    public static void main (String[] args)
    {
        //e
        int choice;
        String rerun;
        Scanner sc = new Scanner(System.in);
        boolean sentinel = false;
        do{
            System.out.println("Menu\n" +
                    "0) Hello World\n" +
                    "1) Goodbye Moon\n" +
                    "2) Walking on Sunshine\n");
            System.out.print("What would you like to do: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice){
                case 0:
                    System.out.println("Hello!");
                    break;
                case 1:
                    System.out.println("Ok, Bye.");
                    break;
                case 2:
                    System.out.print("WHOA!");
                    break;
            }
            System.out.println();
            System.out.print("Type YES to rerun. ");
            sc.nextLine();
            rerun = sc.nextLine();
            if(rerun.equalsIgnoreCase("yes")){
                sentinel = true;
            }
            else{
                sentinel = false;
            }
            System.out.println();
        }while(sentinel);
        System.out.println("Program Ends");


    }
}
/*
Lab12A: OK vs ok
You have probably gotten an automated text where it says something like “Text STOP to opt out of
getting notifications”. If this happens do you reply with “STOP”, “Stop”, or “stop”? All 3 of these are
completely different strings. How should you develop an application which would allow a user to input
any of them?
For this first problem, create a very basic menu which displays a few different strings. Then after the
program has finished, it will ask the user if they want to rerun the program. The user should be able to
type “Yes”, “yes”, “YES”, or any other combination of lowercase and uppercase letters in the word.
DO NOT solve this problem using a complicated IF statement which will take all these inputs. Also,
assume if the user types anything other than “yes” then the user does not want to rerun the program.
Tip: You need to use a function to compare if 2 strings are equal to each other. Try searching
something like “<your language> string function”, there are many different functions available.
Remember, the class name should be Lab12A.
The user input is indicated in bold.

Sample output #1:
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 0
Hello!
Type YES to rerun. yes
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 1
Ok, bye.
Type YES to rerun. YeS
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 2
WHOA!
Type YES to rerun. YES
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 2
WHOA!
Type YES to rerun. No
Program Ends
Sample output #2:
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 0
Hello!
Type YES to rerun. yEs
Menu
0) Hello World
1) Goodbye Moon
2) Walking on Sunshine
What would you like to do: 0
Hello!
Type YES to rerun. No way!
Program Ends

 */
//==================================== Program Lab11B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 11B
 */
// Program Lab11B.java
//

import java.util.Scanner;
public class Lab11B
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //e
        String password;
        System.out.print("Enter a password: ");
        password = sc.nextLine();
        char[] pswd= new char[password.length()];
        boolean charLimit = false, upperLimit = false, digitLimit = false;
        if(pswd.length >= 8){
            charLimit = true;
        }
        else{
            charLimit = false;
        }
        for(int i = 0; i < pswd.length; i++){
            boolean upperFlag = Character.isUpperCase(password.charAt(i));
            if(upperFlag){
                upperLimit = true;
                break;
            }
        }
        for(int i = 0; i < pswd.length; i++) {
            boolean digitFlag = Character.isDigit(password.charAt(i));
            if(digitFlag){
                digitLimit = true;
                break;
            }
        }
        if(charLimit && upperLimit && digitLimit){
            System.out.println("Valid password\n");
            System.out.println("Program ends");
        }
        else{
            System.out.println("Invalid password\n");
            System.out.println("Program ends");
        }

    }
}
/*
Lab11B: Password
This next problem is going to deal with checking if someone inputs a string with a few requirements.
Imagine you are prompted to input a password, but the password needs to include uppercase letters
and a number. In order to do this, you must look at each char in the string and use Booleans to indicate
certain criteria are met. Since there are 3 criteria, you should have 3 Boolean variables.
The rules for the password are:
• Must contain at least 8 chars
• Must contain 1 uppercase letter
• Must contain 1 digit
• There are no restrictions involving lowercase letters or special chars
When considering where to use Booleans, think of it as a “flag”, for each criteria. If you meet the
length requirement, then the flag would change from FALSE to TRUE. Once all the flags are true, you
will have a valid password.
Tip: The ASCII table can be used to determine the numeric value of a particular char. You may want
to create ranges of these numerical values for each criteria.
Sample output #1:
Enter a password: password1
Invalid password
Program Ends
Sample output #2:
Enter a password: P4ssw3rd
Valid password
Program Ends
Sample output #3:
Enter a password: Pas1
Invalid password
Program Ends
Sample output #4:
Enter a password: PASSword
Invalid password
Program Ends
Sample output #5:
Enter a password: Pas!w3rd
Valid password
Program Ends
 */
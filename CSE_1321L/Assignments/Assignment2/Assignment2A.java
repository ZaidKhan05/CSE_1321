//==================================== Program Assignment2A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 2A
 */


import java.util.Scanner;

public class Assignment2A {
    public static void main (String[] args){
        //variables
        int firstNum, secondNum, moduloNum, addNum, subNum, multNum, divNum, modAdd, modSub, modMult, modDiv;
        //ask for input
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        firstNum = sc.nextInt();
        System.out.print("Second number: ");
        secondNum = sc.nextInt();
        System.out.print("Number for Modulo Operation: ");
        moduloNum = sc.nextInt();
        //math
        addNum = firstNum + secondNum;
        subNum = firstNum - secondNum;
        multNum = firstNum * secondNum;
        divNum = firstNum / secondNum;
        //figure out modulus
        modAdd = addNum % moduloNum;
        //final output
        System.out.println(firstNum + " + " + secondNum + " = " + addNum +". The remainder if divided by " + moduloNum + " is " + modAdd + ".");
    }
}
/*
Assignment 2A:
Remainder Across Operations. We’ve learned that in programming, there is a special operator
for getting the whole number remainder of division: The Modulo Operator!
There are many uses for this operator which we will learn throughout the semester. In this
assignment, we will use it to figure out the remainder of two numbers after adding, subtracting,
multiplying, and dividing them. The basic steps are as follows:
a) Ask the user to enter two numbers (as integers)
b) Read those values in
c) Create four variables – one for the sum, difference, product, and quotient
Note: You must use integer division for the quotient.
d) Calculate those four values
e) Ask the user for the number they want to use to find the remainder
f) Read that value in as well
g) Use the Modulo Operator find out the remainder for the four mathematical operations
h) Display the relevant information to the user
The algorithm output is as shown below, with user input in bold. Follow the output format
exactly. Save your source code in a file called Assignment2A (with a file extension of .cpp, .cs
or .java)
Sample Output:
First number: 20
Second Number: 7
Number for Modulo Operation: 5
20 + 7 = 27. The remainder if divided by 5 is 2.
20 – 7 = 13. The remainder if divided by 5 is 3.
20 * 7 = 140. The remainder if divided by 5 is 0.
20 / 7 = 2 (Approximately). The remainder if divided by 5 is 2.
 */
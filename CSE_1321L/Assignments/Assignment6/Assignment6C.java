//==================================== Program Assignment6C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 6C
 */
import java.util.Scanner;
public class Assignment6C {
    public static int surprise_function(int x, int y){
        int result = x+y;
        return result;
    }
    public static float surprise_function(float x, float y){
        float result = x/y;
        return result;
    }
    public static double surprise_function(double x, double y){
        double result = x%y;
        return result;
    }
    public static boolean surprise_function(boolean x, boolean y){
        boolean result = x&y;
        return result;
    }
    public static String surprise_function(char x, char y){
        char[] charArray = {x,y};
        String result = String.valueOf(charArray);
        return result;
    }
    public static void main(String args[]){
        //e
        Scanner sc = new Scanner(System.in);

        System.out.println("[Overloaded Surprise Function]");
        System.out.print("What data type do you want to enter? ");
        String dataType = sc.nextLine();
        if(dataType.equalsIgnoreCase("integer")||dataType.equalsIgnoreCase("int")){
            System.out.print("value #1: ");
            int x = sc.nextInt();
            System.out.print("value #2: ");
            int y = sc.nextInt();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+surprise_function(x,y));
        }
        else if(dataType.equalsIgnoreCase("float")){
            System.out.print("value #1: ");
            float x = sc.nextFloat();
            System.out.print("value #2: ");
            float y = sc.nextFloat();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+surprise_function(x,y));
        }
        else if(dataType.equalsIgnoreCase("double")){
            System.out.print("value #1: ");
            double x = sc.nextDouble();
            System.out.print("value #2: ");
            double y = sc.nextDouble();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+surprise_function(x,y));
        }
        else if(dataType.equalsIgnoreCase("bool")||dataType.equalsIgnoreCase("boolean")){
            System.out.print("value #1: ");
            boolean x = sc.nextBoolean();
            System.out.print("value #2: ");
            boolean y = sc.nextBoolean();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+surprise_function(x,y));
        }
        else if(dataType.equalsIgnoreCase("char")){
            System.out.print("value #1: ");
            char x = sc.next().charAt(0);
            System.out.print("value #2: ");
            char y = sc.next().charAt(0);
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+surprise_function(x,y));
        }

    }
}
/*
Assignment 6C : Overloaded Functions. When we create overloaded functions, they
should produce similar output to the original. For this assignment, we’re going to break
that rule! You will create a function called surprise_function () which takes in two
integers and adds them together. You will then create the following overloaded
versions, which should do different things based on the data type passed in:
Data Type Operation
Integer Addition
Float Division
Double Modulus
Char Concatenation (Return as String)
Boolean Result of AND
You should prompt the user for what data type they want to enter, then ask for two
values of that data type. Then, call surprise_function (), pass in the values, store the
result in an appropriate variable, then print the variable.
Note: You must make overloaded functions for this assignment – they must all be called
surprise_function (). You can not create unique, non-overloaded functions like
surprise_function_booleans().
Sample Output #1:
[Overloaded Surprise Function]
What data type do you want to enter? float
Value #1: 2.3
Value #2: 10.2
Calling surprise_function()...
The result is 0.22549
Sample Output #2:
[Overloaded Surprise Function]
What data type do you want to enter? boolean
Value #1: true
Value #2: false
Calling surprise_function()...
The result is false
Sample Output #2:
[Overloaded Surprise Function]
What data type do you want to enter? char
Value #1: k
Value #2: s
Calling surprise_function()...
The result is ks
*/
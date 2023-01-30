//importing the Scanner library
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {

        //This is a single line comment
        /*
        This
        is
        a
        multi-line
        comment
         */

        //Declaring a scanner object
        //In general, only one scanner is needed per project
        Scanner kb = new Scanner(System.in);

        //Simple print statement
        System.out.println("My name is Dmitri");

        //Primitive data types in Java:
        //Integers: Whole numbers
        //Floating-Point Numbers: Fractional Numbers
        //Double-Precision Floating Point Numbers: Fractional Numbers
        //Characters: A single character
        //Booleans: True or false

        //Declaring variables
        //type name = value; declares and initializes the variable
        //type name; declares the variable
        int i1 = 456;
        float f1 = 12.3f;
        double d1 = 45.6;
        boolean b1 = true;
        boolean b2 = false;
        char c1 = ' ';

        //String is an advanced data type,
        //but we'll be mostly using it as if it were primitive
        String s1 = "I am a GTA for the FYE.";

        System.out.print("The value currently stored in ");
        System.out.println("i1 is " + i1);
        System.out.println("d1 is: " + d1 + " while f1 is " + f1);
        System.out.println("b1 is " + b1);
        System.out.println("b2 is " + b2);
        System.out.println("c1 is " + c1);
        System.out.println("s1 is " + s1);

        System.out.print("Please enter something for s1: ");
        s1 = kb.nextLine();

        System.out.print("Please enter something for i1: ");
        i1 = kb.nextInt();

        System.out.print("Please enter something for f1: ");
        f1 = kb.nextFloat();

        System.out.print("Please enter something for d1: ");
        d1 = kb.nextDouble();

        System.out.print("Please enter something for b1: ");
        b1 = kb.nextBoolean();

        System.out.println("What's currently inside s1 is " + s1);
        System.out.println("What's currently inside i1 is " + i1);
        System.out.println("What's currently inside f1 is " + f1);
        System.out.println("What's currently inside d1 is " + d1);
        System.out.println("What's currently inside b1 is " + b1);

        //If a variable has already been declared, it cannot be declared again
        //e.g. int i1 = 7; will give you an error
        //If you wish to update its value, do so as below
        i1 = 7;
        int i2 = 11;

        f1 = 7f;
        float f2 = 13f;

        //Basic math with programming
        //addition
        System.out.println(i1 + i2 + i1 + i1 + i2);
        //subtraction
        System.out.println(i1 - i2 - i2);
        //multiplication
        System.out.println(i1 * i2);
        //division
        System.out.println(f1 / f2);
        System.out.println(i1 / i2); //NOTE: Dividing two integers will always give you an integer!
        //modulus (remained of a division)
        System.out.println(i1 % i2);
        System.out.println(i2 % i1);

        int i3 = 13;
        int i4 = 3;

        System.out.println(i3 % i4);
        System.out.println(i4 % i3);

        //NOTE: The addition symbol (+) in Java pulls double duty as ADDITION and CONCATENATION.
        //Concatenation means to stick two inputs together.
        //If an addition symbol is used between two numbers, then an addition operation will be performed
        //If an addition symbol is used and one of the elements is a string, a concatenation will occur
        System.out.println(12 + 15); //17
        System.out.println("Blue" + 12); //Blue12
        System.out.println(12 + "Blue"); //12Blue
        System.out.println("Blue" + "Sky"); //BlueSky

        //Operations are also resolved in order of precedence, just like in Mathematics.
        //Innermost parentheses
        //Multiplication and Division
        //Addition and Subtraction and Concatenation
        //If two operations have the same order of precedence, they are resolved left to right
        System.out.println(12 + 24 + "Blue" + 15); //36Blue15
        System.out.println(12 + 24 + "Sky" + 2 * 6); //36Sky12
        System.out.println(12 + (24 + "Sky") + 2 * 6); //1224Sky12

        //To cast a value into another, write what you want to cast into in parentheses
        //e.g.: (float)12 will cast the 12 from an integer into a float
        int i5 = (int)12.34567f;
        float f3 = (float)i5;
        double d3 = (double)f3;
        float f4 = 12.34567f;

        System.out.println(i5);
        System.out.println(f3);
        System.out.println(d3);

        //(f3 * 100) / 100; Rounding using math, as per Professor Nick's method.

        //System.out.printf("The value of f4 is %.4f and f3 is %.3f", f4, f3); Rounding using printf()

        s1 = "Hello!";
        System.out.printf("i5 is %d", i5); //%d = digit
        System.out.printf("f4 is %f", f4); //%f = floating-point number
        System.out.printf("s1 is %s", s1); //%s = string

        System.out.printf("i5: %d\nf4: %.2f\ns1: %s\n", i5, f4, s1);

        System.out.printf("%s %s %s\n", s1, i5, f4);

        //System.out.printf("%s %s %s\n", s1); This will crash as fewer values are provided than are referenced


//
//        public void toSeconds(double input)
//        {
//            int s1 = (input%1)*100;
//            int s2 = (input-(input%1))*60;
//            return s1+s2;
//        }
    }
}
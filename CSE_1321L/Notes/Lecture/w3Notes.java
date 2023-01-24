import java.util.Scanner;

public class w3Notes
{
    public static void main (String[] args)
    {
        float celsius, fahrenheit;
        //read celsius
        System.out.println("Input a temperature in Celsius");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextFloat();
        //convert temp to Fahrenheit
        fahrenheit = 9.0f/5.0f*celsius+32; //algorithm
        //display output
        System.out.println(celsius+" degrees celsius is equal to "+String.format("%.3f", fahrenheit)+ "degrees fahrenheit");
        //figure out for heat warning
        if(fahrenheit >= 90.0f){
            System.out.println("heat warning");
        }
        //
    }
}
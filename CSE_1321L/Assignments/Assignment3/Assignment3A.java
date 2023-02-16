//==================================== Program Assignment4A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 3A
 */

import java.util.Scanner;

public class Assignment3A {
    public static void main(String args[]){
        float xVal, yVal;
        System.out.println("[Cretaceous Park GIS]");
        System.out.print("X coordinate: ");
        Scanner sc = new Scanner(System.in);
        xVal = sc.nextFloat();
        System.out.print("Y coordinate: ");
        yVal = sc.nextFloat();

//        int coordinateValues[][];
//        coordinateValues = new int[xVal][yVal];
        boolean a, b, c, d, e;
        a = ((0<=xVal)&&(8>=xVal)&&(0<=yVal)&(8>=yVal));
        b = ((2<=xVal)&&(4>=xVal)&&(2<=yVal)&(6>=yVal));
        c = ((5<=xVal)&&(8>=xVal)&&(0<=yVal)&(2>=yVal));
        d = ((6<=xVal)&&(8>=xVal)&&(2<=yVal)&(4>=yVal));
        e = ((5<=xVal)&&(8>=xVal)&&(5<=yVal)&(8>=yVal));

        if(!a){
            //not in park
            System.out.println("WARNING: You have left the boundaries of the park.\nPlease return immediately.");
        }
        else if(b){
            System.out.println("You are at the T.Rex Lake");
        }
        else if(c){
            System.out.println("You are at the Pterodactyl Aviary");
        }
        else if(d){
            System.out.print("You are at the Visitor's Center");
        }
        else if(e){
            System.out.println("You are at the Deinonychus Pen");
        }
        else{
            System.out.println("You are at the Triceratops Grasslands");
        }
        
    }
}
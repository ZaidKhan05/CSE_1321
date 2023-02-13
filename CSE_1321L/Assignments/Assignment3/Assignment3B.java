//==================================== Program Assignment3B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 3B
 */

import java.util.Scanner;

public class Assignment3B {

    public static void main(String args[]){
        double width, height, fileSize, bpc;
        int bitsPer;
        Scanner sc = new Scanner(System.in);
        System.out.println("[Image encoding checker]");
        System.out.print("What is the width? ");
        width = sc.nextDouble();
        System.out.print("What is the height? ");
        height = sc.nextDouble();
        System.out.print("What is the file size(in bytes)? ");
        fileSize = sc.nextDouble();
        bpc = fileSize/(width*height);
        bitsPer = (int)bpc;
       
        sc.close();
        if(width <= 0){
            System.out.print("The information is invalid - please re-enter it.");
        }
        else if(height <= 0){
            System.out.print("The information is invalid - please re-enter it.");
        }
        else if(fileSize <= 0){
            System.out.print("The information is invalid - please re-enter it.");
        }
        else if(bpc%3 > 1){
            System.out.print("The information is invalid - please re-enter it.");
        }
        else{
            switch(bitsPer/3){
                case 1:
                System.out.print("The RGB image is encoded with 8 bits per channel.");
                break;
                case 2:
                System.out.print("The RGB image is encoded with 16 bits per channel.");
                break;
                case 3:
                System.out.print("The RGB image is encoded with 32 bits per channel.");
                break;
                default:
                System.out.print("The information is invalid - please re-enter it.");
            }
        }
    }
}
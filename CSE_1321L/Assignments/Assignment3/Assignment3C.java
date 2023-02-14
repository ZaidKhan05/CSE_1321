//==================================== Program Assignment3C.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 3C
*/


import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] args) {
        ///////////////////////////////////////
        String userInput;
        System.out.println("[Cretaceous Park Dialog]");
        System.out.println("Oh no, the power has gone out at Cretaceous Park!\n"+
        "1) What does that mean?\n"+
        "2) No, I just turned the light off.");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        if(userInput.equals("What does that mean?")){
            System.out.println("The dinosaurs will get loose... again...\n"+
            "1) Life finds a way...\n"+
            "2) What do we do?");
            userInput = sc.nextLine();
            if(userInput.equals("Life finds a way...")){
                System.out.print("That’s not helpful right now!\n"+
                "We have to evacuate the park!");
            }
            else if(userInput.equals("What do we do?")){
                System.out.print("We have to evacuate the park!");
            }
        }
        else if(userInput.equals("No, I just turned the light off.")||userInput.equals("No, I just turned off the light")){
            System.out.println("Oh thank goodness!");
        }
        sc.close();
    }
}

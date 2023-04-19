//==================================== Program Assignment7A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 7A
 */

import java.util.Random;
import java.util.Scanner;
class roshamboPlayer{
    String playerName;

    String attack;

    int roLimit;

    int shamBoLimit;



    boolean playRound(String attack){
        boolean result = true;
        Random rand = new Random();
        int limit = rand.nextInt(0,100);
        if(limit >=0 && limit <= this.roLimit){
            this.attack = "Ro";
        }
        else if(limit > this.roLimit && limit <= this.shamBoLimit){
            this.attack = "Sham";
        }
        else if(limit >this.shamBoLimit){
            this.attack = "Bo";
        }
        if(this.attack.equalsIgnoreCase("bo") && attack.equalsIgnoreCase("ro") ||this.attack.equalsIgnoreCase("ro") && attack.equalsIgnoreCase("sham") ||this.attack.equalsIgnoreCase("sham") && attack.equalsIgnoreCase("bo")){
            result = true;
        }
        else result = false;
        return result;
    }

    String getName(){
        return(this.playerName);
    }
    String getAttack(){
        return(this.attack);
    }
    void playTheGame(){
        Scanner sc = new Scanner(System.in);
        String playerAttack = "e";

        int choice;
        do{
            System.out.println("Your opponent is "+this.getName()+"!\n" +
                    "1) Play a round?\n" +
                    "2) Quit?");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            System.out.println();
            if(choice == 1){
                do {
                    System.out.print("Enter an attack:");
                    sc.nextLine();
                    playerAttack = sc.nextLine();
                    if(playerAttack.equalsIgnoreCase("ro")||playerAttack.equalsIgnoreCase("sham")||playerAttack.equalsIgnoreCase("bo")){
                        break;
                    }
                }while(!playerAttack.equalsIgnoreCase("ro")||!playerAttack.equalsIgnoreCase("sham")||!playerAttack.equalsIgnoreCase("bo"));
                if(this.playRound(playerAttack) == true) {
                    System.out.println(this.getName() + " chose " + this.getAttack() + "! You win!");
                }
                else if(this.playRound(playerAttack) == false){
                    System.out.println(this.getName() + " chose " + this.getAttack() + "! You lose...");
                }
                System.out.println();


            }
            else{
                break;
            }

        }while(true);

    }
}

public class Assignment7A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //e
        roshamboPlayer p1 = new roshamboPlayer();
        roshamboPlayer p2 = new roshamboPlayer();
        p1.playerName = "R. Dorothy";
        p1.roLimit = 30;
        p1.shamBoLimit = 60;
        p2.playerName = "Johnny 5";
        p2.roLimit = 40;
        p2.shamBoLimit = 85;

        int userInput;

        System.out.println("[Ro-Sham-Bo Player]\n" +
                "Who do you want to face?\n" +
                "1) R. Dorothy\n" +
                "2) Johnny 5");
        System.out.print("Opponent: ");
        userInput = sc.nextInt();
        System.out.println();
        if(userInput == 1){
            p1.playTheGame();
        }
        else if(userInput == 2){
            p2.playTheGame();
        }
        System.out.println("Game over");

    }
}
/*
 Assignment 7 A: Ro-Sham-Bo. Believe it or not, the classic game of Rock-PaperScissors has many other names. One of them is Ro-Sham-Bo. For this assignment,
“Ro” will represent “Rock”, “Sham” will represent Paper, and “Bo” will represent
Scissors.
You will create a RoshamboPlayer class. It will have four attributes:
 PlayerName: String
 Attack: String
 RoLimit: int
 ShamBoLimit: int
It will also have an overloaded constructor that sets those three values. It will have three
functions: playRound that takes in a string and returns a boolean value, getName that
takes in nothing and returns the PlayerName string, getAttack that takes in nothing and
returns the Attack string.
In your driver class Assignment7A, you will create two RoshamboPlayer objects with
the following values:
 p1: RoLimit == 30, ShamBoLimit == 60
 p2: RoLimit = 40, ShamBoLimit = 85
You may name them whatever you like. You will prompt the user to choose one of these
two to play against. Then you will create a loop that prompt the user to either play a
round of Roshambo, or quit the game.
If the user chooses to play, prompt them to attack with either “Ro”, “Sham”, or “Bo”. If
the input is invalid, keep prompting them until they enter valid input.
Once they’ve made a choice, pass the input to the RoshamboPlayer object’s playRound
function. This function should randomly generate the RoshamboPlayer’s attack of “Ro”,
“Sham”, or “Bo”. This is done by generating a random number between 0 and 100, then
comparing it with the RoLimit and ShamboLimit values for the object. If the random
value is between 0 and RoLimit, the object’s attack is “Ro”. If the random value is
between RoLimit and ShamboLimit, the object’s attack is “Sham”. If the random value is
greater than ShamboLimit, the object’s attack is “Bo”. The object’s attack should then be
saved in its Attack attribute once calculated. Compare the object’s attack with the
player’s attack.
The playRound function should return TRUE if the player won the match, and FALSE if
the object won or there was a draw (which is considered a win for the object). Use that
information to inform the player if they won or lost. Repeat the process until the player
quits.
Sample Output:
[Ro-Sham-Bo Player]
Who do you want to face?
1) R. Dorothy
2) Johnny 5
Opponent: 1
Your opponent is R. Dorothy!
1) Play a round?
2) Quit?
Choice: 1
Enter an attack: Rock
Invalid attack!
Enter an attack: Sham
R. Dorothy chose Bo! You lose...
1) Play a round?
2) Quit?
Choice: 1
Enter an attack: Bo
R. Dorothy chose Sham! You win!
1) Play a round?
2) Quit?
Choice: 1
Enter an attack: Ro
R. Dorothy chose Ro! You lose...
1) Play a round?
2) Quit?
Choice: 2
Game Over
*/
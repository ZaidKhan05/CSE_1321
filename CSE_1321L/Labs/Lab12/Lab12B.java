//==================================== Program Lab12B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 12B
 */
// Program Lab12B.java
//

import java.util.Scanner;
class dog{
    int age;
    double weight;
    String name;
    String furColor;
    String breed;
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    public String newName(String newName){
        name = newName;
        return name;
    }
    public double eat(double intake){
        weight = weight+intake;
        return weight;
    }
}
public class Lab12B
{
    public static void main (String[] args) {
        //e
        Scanner sc = new Scanner(System.in);
        dog dog = new dog;
        System.out.println("You are about to create a dog.");
        System.out.print("How old is the dog: ");
        dog.age = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        dog.age = sc.nextInt();
        System.out.print("What is the dog’s name: ");
        dog.age = sc.nextInt();
        System.out.print("HWhat color is the dog: ");
        dog.age = sc.nextInt();
        System.out.print("What breed is the dog: ");
        dog.age = sc.nextInt();
        System.out.print(dog.name+" is a ")


    }
}
/*

*/
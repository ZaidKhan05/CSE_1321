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
        dog dog = new dog();
        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        dog.age = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        dog.weight = sc.nextDouble();
        System.out.print("What is the dog's name: ");
        sc.nextLine();
        dog.name = sc.nextLine();
        System.out.print("What color is the dog: ");
        dog.furColor = sc.nextLine();
        System.out.print("What breed is the dog: ");
        dog.breed = sc.nextLine();
        System.out.println(dog.name+" is a "+dog.age+" year old "+dog.furColor+" "+dog.breed+" that weighs "+dog.weight+" lbs.");
        dog.bark();
        System.out.print(dog.name+" is hungry, how much should he eat: ");
        dog.eat(sc.nextDouble());
        System.out.print(dog.name+" isn't a very good name. What should they be renamed to: ");
        sc.nextLine();
        dog.newName(sc.nextLine());
        System.out.println(dog.name+" is a "+dog.age+" year old "+dog.furColor+" "+dog.breed+" that weighs "+dog.weight+" lbs.");


    }
}
/*

*/
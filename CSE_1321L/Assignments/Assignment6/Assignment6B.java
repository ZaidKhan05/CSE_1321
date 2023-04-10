//==================================== Program Assignment6B.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 6B
 */

import java.util.Random;

public class Assignment6B {
    public static void PrintArray(int array1[]){
        System.out.println("Printing array...");
        for(int i = 0; i < array1.length; i++){
            System.out.print((array1[i]) + ",");
        }
    }
    public static boolean check_if_sorted(int array1[]){
        //e
        boolean notSorted = true;
        for(int i = 1; i < array1.length;i++){
            if(array1[i-1]>array1[i]){
                notSorted = true;
                break;
            }
            else{
                notSorted = false;
            }

        }
        return notSorted;
    }
    public static int[] shuffleArray(int array1[]){
        System.out.println("Shuffling array...");

        Random rnd = new Random();
        for (int i = array1.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i+1);
            int a = array1[index];
            array1[index] = array1[i];
            array1[i] = a;
        }

        return array1;
    }


    public static void main(String args[]){
        //e
        Random rand = new Random();

        int[] array1 = new int[17];
        for(int i = 0; i < array1.length; i++){
            int input = rand.nextInt(1,359);
            array1[i] = input;
        }
        System.out.println("[Random Sort]");

        int attempts = 0;
        while(true){
            attempts++;
            PrintArray(array1);
            System.out.println();
            if(!check_if_sorted(array1)){
                System.out.println("Hooray, it’s sorted! And it only took "+attempts+" attempts!");
                PrintArray((array1));
                break;
            }
           else{
               System.out.println("Not sorted yet!");
           }
            System.out.println();

            shuffleArray(array1);
            System.out.println();
        }

    }
}
/*
Assignment 6 B: Random Sort. In lecture, we told you that Bubble Sort, Selection Sort,
and Insertion Sort have terrible worst case time complexities of O(n). However, there is
an algorithm with even worst time complexity – Random Sort! Random Sort works by
randomly shuffling the elements in the array and then checking to see if they’re in nondecreasing order. If they aren’t, we repeat the process again. This results in
hypothetical worst case time complexity of O(∞); in other words, it might run FOREVER!
To begin, create a 1D integer array of size 17. Fill each index with a random value
ranging from 1 to 359 inclusive. You will then design and implement the Random Sort
algorithm using the following methods:
 Create a method called check_if_sorted (). It should take in a 1D integer array
and return a boolean value. It should return TRUE if the array is sorted in nondescending order, and FALSE otherwise.
Hint: If you compare elements in the array and a pair is in the wrong order, that
would mean the array is not in non-descending order.
 Create a method called shuffleArray (). It should take in a 1D integer array and
return a 1D integer array. Shuffle the array so that the values are in random
different indexes, and return altered array.
Hint: There are many approaches to solve this problem – making a second array
in the shuffleArray () method might be part of the answer.
 Create a method called PrintArray (). It should take in a 1D integer array and
return nothing. Simply print the current values of the array when it’s called.
Sample Output:
[Random Sort]
Printing array...
2, 9, 232, 1, 89, 74, 34, 122, 344, 19, 1, 1, 2, 78, 43, 12, 19,
Not sorted yet!
Shuffling array...
Printing array...
19, 2, 9, 34, 232, 1, 19, 344, 43, 89, 74, 122, 1, 2, 1, 78, 12,
Not sorted yet!
Shuffling array...
//And so on… (Not part of the code)
Printing array...
1, 1, 1, 2, 2, 9, 12, 19, 19, 34, 43, 74, 78, 89, 122, 232, 344,
Hooray, it’s sorted! And it only took 987456 attempts!
//You will get a different number each time
*/
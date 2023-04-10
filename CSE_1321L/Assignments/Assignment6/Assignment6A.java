//==================================== Program Assignment6A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Assignment# Assignment 6A
 */

import java.util.Random;

public class Assignment6A {
    public static void main(String args[]){
        //e
        int target;
        Random rand = new Random();
        int [] array1 = new int[1000019];
        target = rand.nextInt(array1.length-1);
        int start = 1, linearSearch = 0, binarySearch = 0;
        for(int i = 0; i<array1.length; i++){
            array1[i] = array1.length-start;
            start++;
        }
        //linear search
        for(int i = array1.length-1; i> 0; i--){
            linearSearch++;
            if(target == array1[i]){
                break;
            }
        }
        //binary search
        int high = 0, mid = 0;
        int low = array1.length-1;
        while(low>=high) {
            binarySearch++;

            mid = (low + high) / 2;
            if (target < array1[mid]) {
                low = mid - 1;
            } else if (target == array1[mid]) {
                break;
            } else {
                high = mid + 1;
            }
        }
        System.out.println("[Linear vs Binary Search]");
        System.out.println("The target value is "+target);
        System.out.println("Linear Search: "+ linearSearch + "loop(s)");
        System.out.println("Binary Search: "+ binarySearch+"guess(es)");
        if(linearSearch < binarySearch){
            System.out.println("Linear Search is faster this time!");
        }
        else if(linearSearch > binarySearch){
            System.out.println("Binary Search is faster this time!");
        }
        else if(linearSearch == binarySearch){
            System.out.println("Linear Search is faster this time!");
        }


    }
}
/*
Assignment 6 A: Benchmark Test for Searching. In the lecture class, we have
repeatedly claimed that binary search is faster than linear search on a sorted array. But
don’t take our word for it – let’s try to prove it by comparing the two!
In this lab, you will create an array of size one million (1,000,019). Fill it in reverse
sequentially with values (e.g. array[0] should equal 1,000,018, array[1] should equal
1,000,017, etc). Then the computer should select a random target number between 0
and array size – 1. You should then search the array for this value twice – once with a
linear search algorithm, and then with a binary search algorithm. Start searching from
the end of the array, rather than the beginning. Keep track of how long each one
took, using the following criteria:
 Linear Search: Number of loop iterations before the target number was found
 Binary Search: Number of midpoints chosen (a.k.a “guesses”) taken before the
target number was found
Once both algorithms have been run, display the results and print which algorithm found
the number first (or if there was a tie).
Sample Output #1:
[Linear Vs. Binary Search]
The target value is 307620
Linear Search: 307621 loop(s)
Binary Search: 20 guess(es)
Binary Search is faster this time!
 Sample Output #2:
[Linear Vs. Binary Search]
The target value is 1
Linear Search: 2 loop(s)
Binary Search: 19 guess(es)
Linear Search is faster this time!
In the rest of this assignment, you’re going to create your own methods and call them
from main. We haven’t talked about classes and Object-Oriented Programming (OOP)
yet, so we’re going to have to “break the rules” a bit. For the Java and C# folks, this
means adding a special keyword before each method you write – called static. In
simple terms, this means that we don’t want to use OOP (though there’s much, much
more to it).
*/
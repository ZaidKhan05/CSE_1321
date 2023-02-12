public class Assignment3B {
    public static void main(String args[]){
//file size(in bytes)/(width*height)

    }
}
/*
Assignment3B:
Image Color Depth: In Assignment 1, we learned that each pixel of a computer image is
represented with three values, RGB. Traditionally one byte is used for each color, meaning that
each pixel takes up 3 bytes of space. These are known as 8 bits per color channel encoding, or
8 BPC for short. More recently, encodings with larger ranges of color have become popular with
artists and photographers. Programs like Photoshop now support 16 BPC and 32 BPC
encoding.
For this assignment, you will try to determine the encoding of an RGB image based on its width,
height, and file size. After the user enters this information, you will first check if the information is
valid. If not, you will notify the user and skip to the end of the program.
(Hint: You will have to check multiple potential issues with your IF statements)
If the detail is valid, you will then calculate the BPC encoding. Based on the value, you will use a
Switch statement to print out if the image is 8, 16, or 32 BPC. If it is outside the range, inform
the user that your computer does not know how to read this encoding.
You must call the class Assignment3B and put it in a file called “Assignment3B.java”,
“Assignment3B.cs”, or “Assignment3B.cpp”. Make sure to use Switch statements to
complete this assignment – you will lose points if you do not.
Sample Output #1:
[Image Encoding Checker]
What is the image width? 10
What is the image height? -20
What is the file size (in bytes)? -200
The information is invalid – please re-enter it.
 Sample Output #2:
[Image Encoding Checker]
What is the image width? 10
What is the image height? 20
What is the file size (in bytes)? 202
The information is invalid – please re-enter it.
 Sample Output #3:
[Image Encoding Checker]
What is the image width? 50
What is the image height? 50
What is the file size (in bytes)? 7500
The RGB image is encoded with 8 bits per channel.
 Sample Output #4:
[Image Encoding Checker]
What is the image width? 100
What is the image height? 100
What is the file size (in bytes)? 60000
The RGB image is encoded with 16 bits per channel.
 */
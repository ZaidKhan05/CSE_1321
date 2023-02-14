/*
Lab6C: Cha-Ching For this lab, use a do-while loop.
A sentinel loop is a loop (a special while loop or a do-while loop) that continues to process data until it
reaches a specific value(s) that signals that it should stop looping; this special value(s) is usually
indicated as the condition of the while or do-while loop. A good example of a sentinel loop is the while
loop that you had to write to verify user input in Lab6B, the special values were anything in the range of
1 to 1000. Another very common application for this is allowing a user to rerun a program.
Please write a very simple program that mimics a bank account. The program should start the user out
with $1000. The program should print out a welcome menu once with the options present for the user.
The program should allow the user to make a deposit, withdrawal, and see their current balance.
Every time the user deposits or withdraws, the program should show the user their new balance; it
should also ask the user if they want to return to the main menu. As long as the user types ‘Y’ or ‘y’
the program should keep running.
Remember, the class name should be Lab6C.
The user input is indicated in bold.
Sample output:
Welcome!
You have $1000 in your account.
Menu
0 – Make a deposit
1 – Make a withdrawal
2 – Display account value
Please make a selection: 1
How much would you like to withdraw? : 50
Your current balance is $950
Would you like to return to the main menu (Y/N)? : Y
Menu
0 – Make a deposit
1 – Make a withdrawal
2 – Display account value
Please make a selection: 0
How much would you like to deposit? : 100
Your current balance is $1050
Would you like to return to the main menu (Y/N)? : Y
Menu
0 – Make a deposit
1 – Make a withdrawal
2 – Display account value
Please make a selection: 500
Invalid entry, please try again.
Would you like to return to the main menu (Y/N)? : Y
 Page 6 of 6
Menu
0 – Make a deposit
1 – Make a withdrawal
2 – Display account value
Please make a selection: 2
Your current balance is $1050
Would you like to return to the main menu (Y/N)? : N
Thank you for banking with us!
 */
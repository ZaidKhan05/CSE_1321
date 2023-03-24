/*
 Assignment 5 A: Hospital Directory. You’ve been asked to develop a directory look-up program
for Community General Hospital. You will create multiple 1D arrays, predefined with the
following information.
ID First Name Last Name Age Occupation Has Medical License?
0 Mark Sloan 67 Chief of Internal Medicine TRUE
1 Amanda Bentley 33 Pathologist TRUE
2 Norman Briggs 47 Administrator FALSE
3 Steve Sloan 35 Hospital Security FALSE
4 Jesse Travis 24 Surgeon Intern TRUE
The ID column serves as a common index; the rest of the columns should be stored in individual
arrays of the appropriate data type (especially important for the last column!).
You will then use a loop to create a menu that repeatedly gives the user the following choices:
 List all employee records (in order)
 Display an employee record by ID
◦ The user should enter a valid ID. If the employee exists, print out their
information. Otherwise, tell the user that it is an invalid ID
 Display an employee record by last name
◦ The user should enter a valid last name. If employee(s) exist, print out their
information. Otherwise, tell the user that there are no records.
 Quit
Sample Output:
[Community General Hospital Directory]
1) List all employees
2) Search employee records by ID
3) Search employee records by Last Name
4) Quit
Choice: 1
#0: Mark Sloan, Age 67, Chief of Internal Medicine, Medical License:
TRUE
#1: Amanda Bentley, Age 33, Pathologist, Medical License: TRUE
#2: Norman Briggs, Age 47, Administrator, Medical License: FALSE
#3: Steven Sloan, Age 35, Hospital Security, Medical License: FALSE
#4: Jesse Travis, Age 24, Surgeon Intern, Medical License: TRUE
1) List all employees
2) Search employee records by ID
3) Search employee records by Last Name
4) Quit
Choice: 2
ID: 10
Invalid ID!
ID: 1
#1: Amanda Bentley, Age 33, Pathologist, Medical License: TRUE
1) List all employees
2) Search employee records by ID
3) Search employee records by Last Name
4) Quit
Choice: 3
Last Name: Stewart
No Records Found!
1) List all employees
2) Search employee records by ID
3) Search employee records by Last Name
4) Quit
Choice: 3
Last Name: Sloan
#0: Mark Sloan, Age 67, Chief of Internal Medicine, Medical License:
TRUE
#3: Steven Sloan, Age 35, Hospital Security, Medical License: FALSE
1) List all employees
2) Search employee records by ID
3) Search employee records by Last Name
4) Quit
Choice: 5
No option 5!
Choice: 4
[Closing Directory...]
*/
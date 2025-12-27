/*

-------------------------------------------------------------------------------
1.1: GETTING STARTED WITH PROGRAMMING
-------------------------------------------------------------------------------

IDE - integrated development environment

Source code - "code" you write

Quiz:

Below is a program written with Java. What does it print?

public class Example {
    public static void main(String[] args) {
        // The statements used by the program are placed here
        System.out.println("Welcome to the course - you will learn to program!");
    }
}

Answer:

"Welcome to the course - you will learn to program!"

-------------------------------------------------------------------------------
1.2: PRINTING
-------------------------------------------------------------------------------

Commands are executed one line at a time

Hello World:

public class Example {
    public static void main(String[] args) {
        // Here goes the statements used by the program
        System.out.println("Hello world!");
    }
}

Boilerplate - code to function

sout --> shortcut for print

Parameters - info to be printed by print command

Semicolons - separate commands

// Comments

-------------------------------------------------------------------------------
1.3: READING INPUT
-------------------------------------------------------------------------------

Scanner tool for reading input

Variables - named containers that hold info of some specified type and have a
name

To declare variable, state type followed by name

Concatenation - joining strings together

scanner.nextLine() - reading strings

-------------------------------------------------------------------------------
1.4: VARIABLES
-------------------------------------------------------------------------------

Variable - container in which info of a given type can be stored

Variable names are unique

Variable type only stated during initial variable declaration

Integer can be assigned to double type

Floating-point value CANNOT be assigned to integer type

Java uses camelCase for variables

Integer.valueOf converts string to integer

Double.valueOf converts string to double

-------------------------------------------------------------------------------
1.5: CALCULATING WITH NUMBERS
-------------------------------------------------------------------------------

Parentheses - indicate order

Expression - combination of values

Type-casting operation - (double) to convert integer into floating point number

-------------------------------------------------------------------------------
1.6: CONDITIONAL STATEMENTS AND CONDITIONAL OPERATION
-------------------------------------------------------------------------------

{} to indicate blocks

Else - alternative option

Else if - multiple alternatives

Comparisons are executed top down - stops at first condition that evaluates
to true

Modulo operator (%) - check divisibility of number

Can't compare equality of strings using two equals signs - have to use .equals

-------------------------------------------------------------------------------
1.7: PROGRAMMING IN OUR SOCIETY
-------------------------------------------------------------------------------

Software is utilized in the world all around us today. It's the job of
software engineers to design these digital services that we use and to ensure
they function properly.

-------------------------------------------------------------------------------
2.1: RECURRING PROBLEMS AND PATTERNS TO SOLVE THEM
-------------------------------------------------------------------------------

Calculation Steps:

1. Define the inputs required for the calculation and declare variables for
them. Input refers to the values used in the calculation. You can typically identify the type of inputs from the problem description.

2. Identify the operation needed, and declare a variable for the result of the
calculation. Perform the calculation using the inputs, and assign the result to the variable that was reserved for it. The type of the result can also usually be identified from the problem description.

3. Once the calculation is done, do something with its result. This can mean
printing the result of a computation, or, for example, using it in calculating an average by dividing a sum of the inputs by their count.

Conditional logic - if else

*/
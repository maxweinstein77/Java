/*

-------------------------------------------------------------------------------
INTRODUCTION
-------------------------------------------------------------------------------

Java Development Kit (JDK) - environment that gives you everything you need to
develop Java applications

Java Runtime Environment (JRE) - included inside JDK; provides libraries and
classes needed to run Java applications

Java Virtual Machine (JVM) - included inside JRE; responsible for executing
Java bytecode

JDK Timeline:
- 01/1996: JDK 1.0
- 02/1997: JDK 1.1
- 12/1998: JDK 1.2
- 05/2000: JDK 1.3
- 02/2002: JDK 1.4
- 09/2004: JDK 5.0
- 12/2006: JDK 6
- 07/2011: JDK 7  (LTS)
- 03/2014: JDK 8  (LTS)
- 09/2017: JDK 9
- 03/2018: JDK 10
- 09/2018: JDK 11  (LTS)
- 03/2019: JDK 12
- 09/2019: JDK 13
- 03/2020: JDK 14
- 09/2020: JDK 15
- 03/2021: JDK 16
- 09/2021: JDK 17  (LTS)
- 03/2022: JDK 18
- 09/2022: JDK 19
- 03/2023: JDK 20
- 09/2023: JDK 21  (LTS)
- 03/2024: JDK 22
- 09/2024: JDK 23
- 03/2025: JDK 24
- 09/2025: JDK 25  (LTS)

Since JDK 9, new version released roughly every six months.

-------------------------------------------------------------------------------
LESSON 1: YOUR FIRST JAVA APP
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

-------------------------------------------------------------------------------
LESSON 2: UNDERSTANDING JAVA SYNTAX
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse

public class Main {

    public static void main(String[] args) {
        char a = 'A';
        System.out.println("Hello World");
    }
}

-------------------------------------------------------------------------------
LESSON 3: COMPILING JAVA AND BYTECODE
-------------------------------------------------------------------------------

Main.class is source code recreated from .class file by IntelliJ IDEA

Fernflower reading bytecode and transforming it into Java code

How Java Runs:
1. Write Java code
2. Java compiler (javac) turns it into bytecode (.class)
3. JVM reads bytecode and translates it into machine code
4. CPU runs machine code

-------------------------------------------------------------------------------
LESSON 4: RUNNING JAVA FROM TERMINAL
-------------------------------------------------------------------------------

Main entry point to execute Java program:
public static void main(String[] args)

To run Java program from terminal:
java com.mweinstein.projects.p1_helloworld.Main

-------------------------------------------------------------------------------
LESSON 5: RUNNING JAVA FROM INTELLIJ
-------------------------------------------------------------------------------

Purpose of IDE: compile and run application on JVM

-------------------------------------------------------------------------------
LESSON 6: PACKAGES
-------------------------------------------------------------------------------

Packages - way of organizing classes together

All Java classes should start with uppercase.

-------------------------------------------------------------------------------
LESSON 7: COMMENTS
-------------------------------------------------------------------------------
// Use two dashes for single-line comment

Multiline comments use slash-asterisk-asterisk-slash format

Comments help other developers understand functionality of what you wrote.

-------------------------------------------------------------------------------
LESSON 8: VARIABLES
-------------------------------------------------------------------------------

Variable - a box that stores one thing; placeholder where you can store values

package com.mweinstein.tutorials.amigoscode.javafullcourse

public class Main {
    public static void main(String[] args) {
        int number = 100;
        double number = 100.01; // Primitive
        String brand = "Amigoscode"; // Primitive
        Date date = new Date(); // Reference
    }
}

Declaring variables: [data type] [name of variable] --> [content]

Primitive types - storing simple values (e.g. numbers and single
characters)

Reference types - store complex data types

-------------------------------------------------------------------------------
LESSON 9: PRIMITIVE TYPES
-------------------------------------------------------------------------------

Data Type    | Size     | Description
 ---------------------------------------------------------------
 byte        | 1 byte   | Whole numbers from -128 to 127
 short       | 2 bytes  | Whole numbers from -32,768 to 32,767
 int         | 4 bytes  | Whole numbers from -2,147,483,648 to 2,147,483,647
 long        | 8 bytes  | Whole numbers from -9,223,372,036,854,775,808
             |          |   to 9,223,372,036,854,775,807
 float       | 4 bytes  | Fractional numbers (approx. 6–7 decimal digits)
 double      | 8 bytes  | Fractional numbers (approx. 15 decimal digits)
 boolean     | 1 bit    | true or false
 char        | 2 bytes  | A single character / ASCII value

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        byte theByte = -128; // Can't use reserved keywords for variable names
        short theShort = 32_000;
        int theInt = 787_838_334;
        long theLong = 7_878_383_432L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = true;

        char nameInitial = 'A';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);
    }
}

-------------------------------------------------------------------------------
LESSON 10: REFERENCE TYPES
-------------------------------------------------------------------------------

Majority of your code will be based off reference types

Reference types always start with uppercase letter

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Non-primitive data types AKA reference types
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}

-------------------------------------------------------------------------------
LESSON 11: DIFFERENCES BETWEEN PRIMITIVE AND REFERENCE TYPES
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("Alex");
        Person miriam = alex;

        System.out.println("Before changing Alex: ");
        System.out.println(alex.name + " " + miriam.name);

        alex.name = "Alexander";

        System.out.println("After changing Alex: ");
        System.out.println(alex.name + " " + miriam.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}

Primitive Memory:

addr:200 --> a = 10
After update: a = 100

addr:201 --> b = 10

Reference Memory:

addr:200 --> Person("Alex")
- This is an object.

addr:201 --> Alex
- This is a reference to the object (addr:200).

addr:202 --> Miriam
- This is a reference to the object (addr:200).

 */
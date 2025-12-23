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


-------------------------------------------------------------------------------
LESSON 12: NAMING VARIABLES
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        int zero = 0;
        int one = 1;
        double pi = 2.1415;
        int subscriberCountForAmigoscode = 1_000_000; // Camel case
    }
}

-------------------------------------------------------------------------------
LESSON 13: THE STRING CLASS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // String
        String name = "Amigoscode";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String("codes");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}

Pasted from W3 Schools:

Method                 Description                        Return
charAt()               Character at index                 char
codePointAt()          Unicode at index                   int
codePointBefore()      Unicode before index               int
codePointCount()       Count of Unicode values            int
compareTo()            Lexicographic comparison           int
compareToIgnoreCase()  Compare ignoring case              int
concat()               Append string                      String
contains()             Contains sequence                  boolean
contentEquals()        Exact sequence match               boolean
copyValueOf()          Char array to String               String
endsWith()             Ends with value                    boolean
equals()               Equality check                     boolean
equalsIgnoreCase()     Equality ignoring case             boolean
format()               Formatted string                   String
getBytes()             Convert to byte array              byte[]
getChars()             Copy chars to array                void
hashCode()             Hash code                          int
indexOf()              First occurrence                   int
intern()               Canonical string                   String
isEmpty()              Check if empty                     boolean
join()                 Join strings                       String
lastIndexOf()          Last occurrence                    int
length()               String length                      int
matches()              Regex match                        boolean
offsetByCodePoints()   Unicode index offset               int
regionMatches()        Compare string regions             boolean
replace()              Replace value                      String
replaceAll()           Replace regex matches              String
replaceFirst()         Replace first regex match          String
split()                Split into array                   String[]
startsWith()           Starts with value                  boolean
subSequence()          Return subsequence                 CharSequence
substring()            Extract substring                  String
toCharArray()          Convert to char array              char[]
toLowerCase()          Convert to lowercase               String
toString()             Return string                      String
toUpperCase()          Convert to uppercase               String
trim()                 Remove edge whitespace             String
valueOf()              Convert value to string            String

-------------------------------------------------------------------------------
LESSON 14: PACKAGING AND IMPORTING KEYWORDS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
    }
}

Only reason you'd want to do imnport explicitly is when you have, for example,
two dates --> java.util.Date + java.sal.Date (two classes with same name but
live in different packages)

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date dateSql = new java.sql.Date(1);
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime =
                LocalDateTime.now();
    }
}

-------------------------------------------------------------------------------
LESSON 15: RESERVED KEYWORDS
-------------------------------------------------------------------------------

Reserved keywords - keywords used for language itself (e.g. package, public,
class, static, void, etc.)

Can't use these to name your methods/variables

-------------------------------------------------------------------------------
LESSON 16: ARITHMETIC OPERATIONS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Arithmetic operations
        System.out.println(10 + 2 + 90);
        System.out.println(10 - 2);
        System.out.println((10 * 2) + 7);
        // Pemdas
        System.out.println(10 * (2 + 7) - 4.5);
        System.out.println(10 % 3);
    }
}

-------------------------------------------------------------------------------
LESSON 17: THE MATH CLASS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.pow(5.0, 2.0));
        System.out.println((int) Math.pow(5, 2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);
    }
}

-------------------------------------------------------------------------------
LESSON 17: COMPARISON OPERATORS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Comparison operators
        int khalidAge = 20;
        int miriamAge = 20;
        System.out.println(khalidAge > miriamAge);
        System.out.println(khalidAge >= miriamAge);
        System.out.println(khalidAge < miriamAge);
        System.out.println(khalidAge <= miriamAge);
        System.out.println(khalidAge == miriamAge);
        System.out.println(khalidAge != miriamAge);
    }
}

-------------------------------------------------------------------------------
LESSON 18: LOGICAL OPERATORS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Logical operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
        System.out.println(isAdult);
        System.out.println(!isAdult);
        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) &&
                !isAdult &&
                name.contains("M"));
    }
}

-------------------------------------------------------------------------------
LESSON 19: IF STATEMENTS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
       // If statements
        int age = 15;
        if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}

-------------------------------------------------------------------------------
LESSON 20: TERNARY OPERATOR
-------------------------------------------------------------------------------

Should only use this when evaluating one boolean expression or want to return
a value

More complex stuff --> if else

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
       // Ternary operator
        int age = 15;
        String message = age >= 18 ?
                "Hooray... I am an adult" :
                "I am not an adult";

        System.out.println(message);
    }
}

-------------------------------------------------------------------------------
LESSON 21: SWITCH STATEMENTS
-------------------------------------------------------------------------------

Use switch statements when switching on single values

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Switch statement
        String gender = "female";

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}

EQUIVALENTLY:

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        String gender = "FEMALE";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }
    }
}

-------------------------------------------------------------------------------
LESSON 22: ARRAYS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays
        int zero = 0;
        int one = 1;

        int [] numbers1 = new int[3];
        System.out.println(Arrays.toString(numbers1));

        boolean [] booleans = new boolean[3];
        System.out.println(Arrays.toString(booleans));

        String [] numbers2  = new String[3];
        System.out.println(Arrays.toString(numbers2));

        int [] numbers3 = new int[3];
        numbers3[0] = 2;
        numbers3[1] = 0;
        numbers3[2] = 1;
        System.out.println(Arrays.toString(numbers3));

        // Most efficient way
        int [] numbers4 = {2, 0, 1, 4, 100};
        System.out.println(Arrays.toString(numbers4));
        System.out.println(numbers4.length);

        String [] names = {"Ali", "Maria"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}

-------------------------------------------------------------------------------
LESSON 23: ARRAYS AND INDEXES
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Arrays
        int [] numbers = {2, 0, 1, 4, 100};
        int oneHundred = numbers[4];
        int arrayLength = numbers[numbers.length - 1];
        System.out.println(oneHundred);
        System.out.println(arrayLength);
    }
}

-------------------------------------------------------------------------------
LESSON 24: ++ & --
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
       // Loops
        int[] numbers = {2, 0, 1, 4, 100, 4,90, 78, 77};

        int number1 = 0;
        number1++; // Equivalently: number = number + 1 or number += 1;
        System.out.println(number1);

        int number2 = 0;
        number2--; // Equivalently: number = number - 1 or number -= 1;
        System.out.println(number2);
    }
}

-------------------------------------------------------------------------------
LESSON 25: ENHANCED FOR LOOP
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
       // Loops
        int[] numbers = {2, 0, 1, 4, 100, 4,90, 78, 77};
        String[] names = {"Ana", "Ali"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced for loop");

        for (int number : numbers) {
            System.out.println(number);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}

-------------------------------------------------------------------------------
LESSON 26: BONUS TIP
-------------------------------------------------------------------------------

Quicker way to code loops:
numbers.for

Advanced way to loop through array:
Arrays.stream(numbers).forEach(System.out::println);
Arrays.stream(names).forEach(System.out::println);

-------------------------------------------------------------------------------
LESSON 27: BREAK & CONTINUE
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            System.out.println(name);
            break; // Breaks out of loop
        }

        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }

        for (String name : names) {
            if (name.startsWith("A")) {
                continue; // Goes back to beginning of loop
            }
            System.out.println(name);
        }
    }
}

-------------------------------------------------------------------------------
LESSON 28: WHILE LOOP
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // While loop
        int count = 0;

        while (count <= 20) {
            System.out.println("count " + count);
            count++;
        }
    }
}

-------------------------------------------------------------------------------
LESSON 29: DO WHILE LOOP
-------------------------------------------------------------------------------

Executes at least once

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        int count = 22;

        do {
            System.out.println(count);
            count++;
        }
        while (count <= 20);
    }
}

-------------------------------------------------------------------------------
LESSON 30: SCANNER CLASS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult");
        } else {
            System.out.println("and you are an adult :)");
        }
    }
}

-------------------------------------------------------------------------------
LESSON 31: METHODS
-------------------------------------------------------------------------------

Method - block of code that only runs when we call it; used to perform logic
Parameters - the data we pass into the method
Built-in methods - methods provided by JRE
User pre-defined methods - methods we build ourselves
() - indicates we're invoking the method

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {

    public static void main(String[] args) {
        // Built-in methods
        System.out.println("Hello");
        String brand = "Samsung";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("S"));
    }
}

-------------------------------------------------------------------------------
LESSON 32: UNDERSTANDING METHODS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {
    public static void main(String[] args) {
        // Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters);
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters) {
        System.out.println("method countOccurrences was invoked");
        return -1;
    }
}

-------------------------------------------------------------------------------
LESSON 33: USER-DEFINED METHODS
-------------------------------------------------------------------------------

Programming - solving problems by creating methods and then writing
algorithms inside of those methods

Algorithm - sequence of steps to solve problem

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {
    public static void main(String[] args) {
        // Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    public static int countOccurrences(
            char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}

-------------------------------------------------------------------------------
LESSON 34: CLASSES AND OBJECTS
-------------------------------------------------------------------------------

Class - blueprint to create anything you want
1. Attributes - things that define object you want to create (e.g. color)
2. Behaviors - what it can do

Objects - anything you can think of in real world

-------------------------------------------------------------------------------
LESSON 35: CREATING CLASSES
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {
    public static void main(String[] args) {
        // Classes and Objects
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

-------------------------------------------------------------------------------
LESSON 35: CREATING OBJECTS
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true);

        Lens lensThree = new Lens(
                "canon",
                "24-70mm",
                false);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

-------------------------------------------------------------------------------
LESSON 36: PRINTING OBJECT ATTRIBUTES
-------------------------------------------------------------------------------

Class - blueprint for creating objects
Object - something that models something in the real world

package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Test {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true);

        Lens lensThree = new Lens(
                "canon",
                "24-70mm",
                false);
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
    }

    static class Lens {
        String brand;
        String model;
        String color;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

-------------------------------------------------------------------------------
LESSON 37: PASSPORT EXAMPLE
-------------------------------------------------------------------------------

package com.mweinstein.tutorials.amigoscode.javafullcourse;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Classes
        Passport ukPassport = new Passport(
                "1234",
                "England (UK)",
                LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport(
                "12399",
                "USA",
                LocalDate.of(2030, 1, 1));

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number,
                 String country,
                 LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}

-------------------------------------------------------------------------------
LESSON 38: LET'S WRAP UP
-------------------------------------------------------------------------------

Enroll in Java Essentials course for more advanced courses on Java

 */
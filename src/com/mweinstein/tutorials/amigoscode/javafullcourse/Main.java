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

 */
package classWork.javaDocumentation;

public class A2DataTypes {
    /*
    Kinds of variables in Java:

    1. INSTANCE VARIABLES (Non-Static Fields)
        Objects store their individual states in "non-static fields" (w/o the static keyword) - their values are unique
        to each instance of a class (to each object).

    2.CLASS VARIABLES (Static Fields)
        A class variable is any field declared with the static modifier. Это переменная, которая относится к нескольким
        обьектам и имеет одно и то же значение.

    3. LOCAL VARIABLES
        Are the variables that are created and executed inside the method. They are only visible in method, but not class.

    4. PARAMETERS
        belongs to method.
//==========================================================================================================

    PRIMITIVE DATA TYPES - predefined by the language and is named by a reserved keyword (8 primitive data types in JAVA)
    Variable declaration -> Variable type + Variable name : int age;
   */

//    1. byte
//        It stores a non-decimal integer ( -128 to 127). It is 8-bit two's signed complement integer

    byte age = 18;

    //    2.short
//          It stores a non-decimal integer ( -32 768 to 32 767). It is 16-bit signed two's complement integer
    short salary = 7000;
    //    3.int
    //          It stores a non-decimal integer ( -2.31 (billion) to 2.31). It is 32-bit signed two's complement integer
    int phoneNumber = 941545909;
    //    4.long
    //          It stores a non-decimal integer ( -2.63 (billion) to 2.63). It is 64-bit signed two's complement integer
    long transactionNumber = 2030405060;
    //    5.float
    //          It stores a decimal(floating) integer ( ends with f. smaller than double).
//          It is 32-bit single precision. never used for precise numbers
    float height = 5.5f;
    //    6.double
    //          It stores a  decimal integer ( bigger than float). It is 64-bit double precision
    double range = 54.3456787654321234;
    //    7. boolean
    //          It stores only two possible values: true or false (for true/false conditions). It is 1 bit
    boolean isRed = true;
    //    8. char
    //          It stores a single character from ASCII table. it is a 16 bit
    char name = 'A';
//       ==========================================================================================================

    /* DEFAULT VALUES
    byte = 0;
    short = 0;
    int = 0;
    long = 0;
    float = 0;
    double = 0;
    char = '000';
    String (or any object) = null;
    boolean = false;
    BUT LOCAL VARIABLES DO NOT HAVE DEFAULT VALUES! --> therefore, assign before using it.
    YOU CAN USE _ TO SEPARATE DIGITS IN A BIG NUMBER FOR READABILITY REASONS.
     */
//       ==========================================================================================================



}






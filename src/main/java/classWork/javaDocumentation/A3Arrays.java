package classWork.javaDocumentation;

import java.util.Arrays;

public class A3Arrays {
    /*
    An array is a container object that holds a fixed number of values of a single type. The length of the array is
    established when an array is created. After creation its length is fixed.
    Each item in an array is called an element. Each element is accessed by its numerical index. Index begins with 0.
     */

    public static void main(String[] args) {
        //declares an array of integers:
        int[] anArray;                  //creating array
//    allocates memory for 10 integers:

        anArray = new int[10];         //Initializing an array
                                        //1.way with new operator:

        //initialize first element:
        anArray[0] = 100;   //assign value to each element of the array;
        //initialize second element:
        anArray[1] = 200;
        //each array element is accessed by its numerical index:
        System.out.println(anArray[0] + " " + anArray[1]);

        //similarly you can declare arrays of other types:
        byte [] anArrayOfBytes;
        short[] anArraysOfShorts;
        long [] anArrayOfLongs;
        float [] anArrayOfFloats;
        double [] anArrayOfDoubles;
        boolean [] anArrayOfBooleans;
        char [] anArrayOfChars;
        String [] anArrayOfStrings;

        //you can also place the brackets after the array's name:
        //this form is discouraged by convention:
        float anArrayOfFloats1 [];

        //shortcut syntax to create and initialize an array:
        int [] arrayInts = {
                100, 200, 300, 500,
                600, 700, 800, 900,
                1000, 2000, 3000
        };
        //Here the length if the array is determined by the number of values provided btw braces and separated by commas;

        //Array manipulation:
        //toString converts an array to a string:
        System.out.println(Arrays.toString(arrayInts));

        /*
        Variables:
        1. The term "istance variable" is another name for instance fields;
        2. The term "class variable" is another term for class fields;
        3. A local variable stores temporary state. It is declared inside a method;
        4. A variable declared within the opening and closing parenthesis of a method signature is called parameter;
        5. What are the eight primitive data types supported by the Java programming language:
            1. byte
            2. short
            3. integer
            4.long
            5.float
            6.double
            7.char
            8.boolean
            9. String
         6. Character strings are represented by the class java.lang.string.
         7. An Array is a container of object that holds a fixed number of values of a single type.
         */









    }

}

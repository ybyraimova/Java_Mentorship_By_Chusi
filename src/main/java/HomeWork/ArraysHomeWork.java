package HomeWork;

public class ArraysHomeWork {
    public static void main(String[] args) {
          /*
    Create ArraysHomework java class and submit the file with following programs:
         */
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumUpArray(my_array);

        int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int [] ints = {1,2,3,4,5};
        averageCalculator(ints);
        averageCalculator(averValues);


//        3 task:
//        create 5 arrays of int with different sizes, names and values. Print all elements of one array.

        int [] age = {18, 20, 21, 25, 27, 30, 21, 20, 19};
        int [] price = {100, 120, 90, 77};
        int [] days = {1,2,3,4,5,6,7};
        int [] years=  {2022, 2023, 2024};
        int [] wholeNumbers = {1,2,3,4,5,6,7,8,9};

        getInts(age);
        getInts(price);
        getInts(days);
        getInts(years);
        getInts(wholeNumbers);

//        create 5 arrays of short with different sizes, names  and values. Print all elements of one array.

        short [] shorts = new short[5];
        shorts = new short[]{20, 25, -21, -30, -29};
        short [] shorts1 = new short[3];
        shorts1 = new short[]{-10000, -20000, -5000};
        short [] shorts2 = new short[2];
        shorts2 = new short[]{9999, 8888};
        short [] shorts3 = new short[10];
        shorts3 = new short[]{1,2,3,4,5,6,7,8,9,10};
        short [] shorts4 = new short[4];
        shorts4 = new short[] {10101, 20202, 30303, 4040};

        getShorts(shorts);
        getShorts(shorts1);
        getShorts(shorts2);
        getShorts(shorts3);
        getShorts(shorts4);

//        create 5 arrays of double with different sizes, names  and values. Print all elements of one array.
        double [] decimals1 = {1.1, 1.2, 1.3, 1.4};
        double [] decimals2 = {0.5, 0.6, 0.7, 0.9, 10, 1, 0};
        double [] decimals3 = {10, 20, 300.5, 47, 89.95, 97.65};
        double [] decimals4 = {0.5, 1, 1.5, 2};
        double [] decimals5 = {0.00001, 0.1111119, 0.5432343, 0.6543234, 0.54323212};

        getDoubles(decimals1);
        getDoubles(decimals2);
        getDoubles(decimals3);
        getDoubles(decimals4);
        getDoubles(decimals5);

//        create 5 arrays of boolean with different sizes, names  and values. Print all elements of one array.
        boolean [] isPrivate = {true, false};
        boolean [] isReady = {true, false, false, false, true};
        boolean [] isStudent = {true, false, false, false};
        boolean [] isOpen = {true, false, false, false, true, false};
        boolean [] isMatching = {true, false, false, true, true, true, false};

        getBooleans(isPrivate);

//        create 5 arrays of String with different sizes, names  and values. Print all elements of one array.

        String [] boysNames = new String[4];
        boysNames = new String[]{"Timur", "Abdulaziz", "Azamat", "Zhanybek"};
        String [] girlsNames = new String[3];
        girlsNames = new String[] {"Aigul", "Sezim", "Tomiris"};
        String [] kyrgyzNames = {"Manas", "Aibek", "Adygine", "Batyrkhan", "Shailoogul"};
        String [] russianNames = {"Ivan", "Pavel", "Vladimir"};
        String [] koreanNames = {"Kim Chen Eun", "Lee Min Ho", "Pak Min Zhu"};

        getName(koreanNames);
        getName(kyrgyzNames);
        getName(russianNames);
        getName(girlsNames);


    }
              /*  1. given below array of ints, write a program to sum values of array and print this sum.
    int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Expected output: The sum of given ints is: 55

        Pseudocode:
        1. create my_array;
        2. create integer where the sum will be stored;
        3.create for loop in order to sum up elements from index 0 until the end of array.length;
        4. start the loop from index 0 and end with the array.length-1; increment because we want from left to right
        5. store the sum and increment the new value in integer sum;
        6. print out the sum;
        7. return sum;
        8.call the method with a int array parameter inside;
               */
    public static int sumUpArray(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The sum of given ints is " + sum);
        return sum;
    }
/*
            2. given below array of ints, write a program to calculate the average value of array elements
    int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
    Expected output: The average value of given ints is: 18
 */
    /*
    Pseudocode:
    1. Create a double variable where we will store the average result;
    2. Create int variable where we will store the sum;
    3. create for loop which will sum all elements of the array;
    4. store the sum inside double;
    5. create another int variable to increment the number of elements in array(number of elements)
    5. outside the loop we want to write a formula to calculate average = sum/ number of elements;
    6. print the average;
    7.return the int average;
     */
    public static double averageCalculator(int [] averValues){
        double average = 0;
        int sum = 0;
        int numOfElements = 0;
        for(int i = 0; i < averValues.length; i++){
            sum += averValues[i];
            numOfElements++;

        } average = sum/numOfElements;
        System.out.println("The average value of given ints is " + average );
        return average;
    }
    /*
            3. create 5 arrays for each data type, with different sizes, names and values. try to use different
            declaration methods, and using for-loop print all values of one of the arrays of each type.
    create 5 arrays of int with different sizes, names and values. Print all elements of one array.
    create 5 arrays of short with different sizes, names  and values. Print all elements of one array.
    create 5 arrays of double with different sizes, names  and values. Print all elements of one array.
    create 5 arrays of boolean with different sizes, names  and values. Print all elements of one array.
    create 5 arrays of String with different sizes, names  and values. Print all elements of one array.
    */

// The variables are created in main method.

    public static void getInts(int [] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");

        }
        System.out.println();
    }

    public static void getShorts(short [] shorts){
        for(int i = 0; i < shorts.length; i++){
            System.out.print(shorts[i] + "; ");
        }
        System.out.println();
    }

    public static void getDoubles(double [] doubles){
        for(int i = 0; i < doubles.length; i++){
            System.out.print(doubles[i] + "; ");
        }
        System.out.println();
    }

    public static void getBooleans(boolean [] booleans){
        for (int i = 0; i < booleans.length; i++){
            System.out.print(booleans[i] + "; ");
        }
        System.out.println();
    }

    public static void  getName(String [] name){
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i] + "; ");
        }
        System.out.println();
    }
}

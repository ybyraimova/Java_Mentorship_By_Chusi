package problemSolving;

public class SwapTwoVariables {
    /*
    create a method that creates two integers a and b, and it will swap a and b values
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

//        with two variables:

        int swappeda =b;
        int swappedb =a;

        System.out.println(swappeda + " " + swappedb);

//        with one variable

        int empty = a;
        a = b;
        b=empty;
        System.out.println(a + " " + b);

//        String swap
        String str1 = "hello";
        String str2 = "bye-bye";

        String emptyString = str1;
        str1 =str2;
        str2 = emptyString;
        System.out.println(str1 + " " + str2);



    }
}

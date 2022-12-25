package HomeWork;

public class NestedForLoopHW {
    public static void main(String[] args) {
        /*
        write a program using nested for loop, that will print the following output. It's called Floyd's Triangle.

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
         */

        int number = 1;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}



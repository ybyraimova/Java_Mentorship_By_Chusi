package HomeWork;

import java.util.Scanner;

public class PrimeNumberHW {
    /*
    Write a program that checks whether a number entered by the user is a prime number or not.
    Using loop, if-else condition, Scanner class.
    Prime number is a whole number greater than 1 that cannot be exactly divided by any whole
    number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
    Use Scanner class that will ask for int from user and checks if the number is prime or not.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int givenNumber = scanner.nextInt();
        boolean check =true;

        for(int i = 2; i< givenNumber; i++) {
            if (givenNumber % i == 0) {
                System.out.println(givenNumber + " is not a prime");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(givenNumber + " is a prime");
        }

        }
    }





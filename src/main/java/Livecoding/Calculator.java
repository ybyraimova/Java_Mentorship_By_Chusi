package Livecoding;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter first number");
            int a = scanner.nextInt();
            System.out.println("Enter arithmetic operator");
            String q = scanner.next();
            System.out.println("Enter second number");
            int b = scanner.nextInt();


            if (q.equals("*")) {
                System.out.println(a + " * " + b + " = " + (a * b));
            } else if (q.equals("/")) {
                System.out.println(a + " / " + b + " = " + (a / b));
            } else if (q.equals("-")) {
                System.out.println(a + " - " + b + " = " + (a - b));
            } else if (q.equals("+")) {
                System.out.println(a + " + " + b + " = " + (a + b));
            } else if (q.equals("%")) {
                System.out.println(a + " % " + b + " = " + (a % b));
            }else{
                System.out.println("Incorrect arithmetic operator");
            }

            System.out.println("Do you want to try one more time?");
            String answer = scanner.next();
            if(answer.equals("No")|| answer.equals("no")|| answer.equals("NO")){
                break;
            }
            
        }


    }
}

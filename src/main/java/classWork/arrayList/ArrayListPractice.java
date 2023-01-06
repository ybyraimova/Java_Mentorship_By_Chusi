package classWork.arrayList;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        contains (element) it will return boolean
        true if contains, false does not contain;
         */
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //into even numbers add even numbers from 0 to 20;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);


        //create arraylist of integers and put numbers divisible by 3. in a range from 0 to 100;

        ArrayList<Integer> divisible3 = new ArrayList<>();
        for (int j = 3; j <= 100; j++) {
            if (j % 3 == 0) {
                divisible3.add(j);
            }
        }
        System.out.println(divisible3);

        //create arraylist of strings, put 100 apples inside:
        // 1 apple, 2 apples, 3 apples,
        //after remove apples number: 10, 20, 30, 40, 50, 60, 70, 80, 90
        //print size of array;
        //in the same list add more apples in a range from 1000 to 1100;
        //only add numbers 1001 , 1003, 1005, 1099

        ArrayList <String> apples = new ArrayList<>();
        apples.add("1 apple");
        for(int i = 2; i <= 100; i++){
            apples.add(i + " apples");
        }
        for (int g = 2; g <= 100; g++){
            if( g %  10 != 0){
                apples.add(g + " apples");
            }
        }
        System.out.println(apples);

        for (int j = 100; j <= 1100; j++){
            if(j % 2 != 0){
                apples.add(j + " apples");
            }
        }





        //this printed out half tree for some reason
//        for (int i = 0; i <= 10; i++ ){
//            if(apples.indexOf(0) == 0){
//                apples.add("*");
//        }else {
//                apples.add("*");
//            }
//            System.out.println(apples);
//        }



        //contains method
        boolean b = apples.contains("2 apples");
        System.out.println(b); //true

        b = apples.contains("2 apple");
        System.out.println(b); //false

        b= apples.contains("10 apples"); //false we removed 10


    }


}

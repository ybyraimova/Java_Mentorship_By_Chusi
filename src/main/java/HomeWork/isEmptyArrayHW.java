package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class isEmptyArrayHW {
    public static void main(String[] args) {
     /*1. create arrayList of Strings, add 5 values
    check whether arrayList is empty and assign value into boolean variable
    remove all values from arrayList
    check whether arrayList is empty and assign value into boolean variable */

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("world!");
        stringList.add("Here");
        stringList.add("I");
        stringList.add("am");
        boolean isEmptyStringList = stringList.isEmpty();
        System.out.println(isEmptyStringList);

/*2. create array of Strings, add 5 values
    check whether array is empty and assign value into boolean variable
    remove all values from array
    check whether array is empty and assign value into boolean variable  */

        String[] strings = {"Hello", "world!", "Here", "I", "am"};
        boolean isEmptyString = strings.toString().isEmpty();
        System.out.println("Strings array is empty: " + isEmptyString);



        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (String temp : stringArrayList){
            stringArrayList.add(temp);
        }
        stringArrayList.clear();

        boolean isEmptyString2 = stringArrayList.isEmpty();
        System.out.println("Strings array after removal is empty: " + isEmptyString2);





    }
}


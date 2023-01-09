package classWork.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isEmptyArrayList {
    public static void main(String[] args) {
        ArrayList <String> companies = new ArrayList<>();
        boolean isListEmpty = companies.isEmpty();
        System.out.println("Is companies list empty? " + isListEmpty);
        
        companies.add("Google");
        companies.add("Microsoft");
        companies.add("BofA");
        companies.add("Cisco");
        companies.add("Oracle");
        companies.add("Uber");
        
        
        String [] arrayOfCompanies = new String[companies.size()]; //list to array
        companies.toArray(arrayOfCompanies);

        System.out.println(Arrays.toString(arrayOfCompanies));
        
        String [] geeks = {"Saikal", "Myrzakhan", "Ilgiz", "Zhamal"};
        List<String> arrayListGeeks = Arrays.asList(geeks); //array to list;
        
        String [] arrayofGeeks = new String[arrayListGeeks.size()]; // list to array
        arrayListGeeks.toArray(arrayofGeeks);
        
        
        String [] testers = {"Alex", "Amanda", "Gabby", "Haley"};
        List <String> al = new ArrayList(Arrays.asList(testers)); // array to string

        System.out.println(al);
        
        /*
        using for each loop print testers 
        
        using while loop print al
        
        using do -while loop, print arrayofGeeks;
        
        using for loop, print arrayListGeeks 
         */


        for ( String tester : testers) {
            System.out.println("for each loop: " + tester);
        }
        System.out.println();
        int i = 0;
        while (i < al.size()){
            System.out.println("while loop: " + al.get(i));
            i++;
        }

        System.out.println();

        int g = 0;
        do {
            System.out.println("do while loop: " + arrayofGeeks[g]);
            g++;
        }while (g < arrayofGeeks.length);


        System.out.println();

        for(int x =0; x < arrayListGeeks.size(); x++){
            System.out.println("for loop: " + arrayListGeeks.get(x));
        }
        
    }


}

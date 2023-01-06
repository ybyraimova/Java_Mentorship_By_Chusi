package classWork.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of queries: ");
        int n = in.nextInt(); //number of persons in our phone book
        in.nextInt();

        HashMap <String, Integer> phonebook = new HashMap<>();

        for(int i =0; i<n; i++){
            System.out.println("Enter person's name: ");
            String name = in.next();

            System.out.println("Enter person's phone number:");
            long phone = in.nextLong();
            
        }


    }
}

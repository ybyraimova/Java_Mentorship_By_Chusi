package classWork.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyEntrySet {
    public static void main(String[] args) {
        HashMap <Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");

        //Print only keys:
        for(Integer key: numbers.keySet()){
            System.out.println(key);
        }

        //Print only values:
        for(Integer key: numbers.keySet()){
            System.out.println(numbers.get(key));
        }

        //print the hashmap:
        System.out.println(numbers);

        //using for each loop:
        for(Integer key: numbers.keySet()){
            System.out.println(key + " - " + numbers.get(key));
        }

        //EntrySt() returns set of keys and values:
        // (key - value) = entry

        for (Map.Entry <Integer, String> entry : numbers.entrySet()){
            System.out.println(entry);
        }


    }




}

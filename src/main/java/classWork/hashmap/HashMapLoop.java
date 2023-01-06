package classWork.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap <String, Integer> ages = new HashMap<>();
        ages.put("John", 30);
        ages.put("Lucas", 48);
        ages.put("Rose", 32);
        ages.put("Mohammed", 30);
        ages.put("Deepak", 28);
        ages.put("Rahul", 67);

        //keySet() return the set of keys

        for(String age: ages.keySet()){
            System.out.println(ages.get(age));
        }

        for(String name: ages.keySet()){
            System.out.println(name);
        }

        String userName2 = null;
        int age2 = 0;

        for(String name: ages.keySet()){
            if(name.equals("Deepak")){
                userName2 = name;
                age2 = ages.get(name);
            }
        }
        System.out.println("Name: " + userName2 + " Age " + age2);


        //create array of names
        String [] names = new String[ages.keySet().size()];
        int i = 0;
        for(String name: ages.keySet()){
            names[i] = name;
            i++;

        }System.out.println(Arrays.toString(names));

        //create array of int and store ages:

        int [] arrayOfAges = new int[ages.size()];
        int k = 0;
        for(String name: ages.keySet()){
            arrayOfAges[k] = ages.get(name);
            k++;
        }
        System.out.println(Arrays.toString(arrayOfAges));


        System.out.println("Just printing the hashmap itself: " + ages);
        System.out.println("Printing the entryset of the map: "+ ages.entrySet());

        /*
        keySet()
        entrySet() return a collection of keys
         */

        HashMap<String, String> fruitsAndVeggies = new HashMap<>();
        fruitsAndVeggies.put("apple", "fruit");
        fruitsAndVeggies.put("bananas", "fruit");
        fruitsAndVeggies.put("carrots", "veggies");
        fruitsAndVeggies.put("cabbage", "veggies");
        fruitsAndVeggies.put("pear", "fruit");
        fruitsAndVeggies.put("potatoes", "veggies");

        //print only fruits:

        for(String key: fruitsAndVeggies.keySet()) {
            if (fruitsAndVeggies.get(key).equals("fruit")) {
                System.out.println("fruits: " + key);
            }
        }

        //print veggies only:

        for(String key: fruitsAndVeggies.keySet()){
            if(fruitsAndVeggies.get(key).equals("veggies")){
                System.out.println(fruitsAndVeggies.get(key) + ": "+ key);
            }
        }

        HashMap <String, String> words = new HashMap<>();
        words.put("window", "house");
        words.put("brick", "house");
        words.put("rain", "nature");
        words.put("water", "swimming");
        words.put("association", "organization");
        words.put("software", "system");

        /*
        print the values with length <= 5;
        length() <= 5: house

        2. print the values with length >= 7;
        length () >=7: swimming;

        3, print keys that start with letter a, or b , or c.
        starts with a or b or c, word

        4. print keys that end with letter e or o,
        ends with e or o: word;
         */

        for(String key: words.keySet()){
            if(words.get(key).length() <= 5){
                System.out.println("length() <= 5: " + words.get(key));
            }
            if(words.get(key).length() >= 7){
                System.out.println("length () >=7: " + words.get(key));
            }
        }
        for(String key: words.keySet()){
            if(key.startsWith("a")|| key.startsWith("b")|| key.startsWith("c")){
                System.out.println("starts with a or b or c: " + words.get(key));
            }
            if(key.endsWith("e")|| key.endsWith("o")){
                System.out.println("ends with e or o: " + words.get(key));
            }
        }


        boolean isEmpty = words.isEmpty();
        System.out.println(isEmpty);



    }


    }


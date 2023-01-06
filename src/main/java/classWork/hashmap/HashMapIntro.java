package classWork.hashmap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

//        class  key     value name         declaration
        HashMap<String, String> Antonyms = new HashMap<>();
                Antonyms.put("cold", "hot");
                Antonyms.put("long", "short");
                Antonyms.put("hard", "soft");
                Antonyms.put(null, "no data");
                Antonyms.put("table", null);
                Antonyms.put("screen", null);

        System.out.println(Antonyms);
//        There is no order, nor indexes. HashMap's elements do not have indexes or object numbers;

        System.out.println(Antonyms.get("cold"));
//        this will print hot.
        System.out.println(Antonyms.get("longi"));
//        if you provide non-existing key in get method hashmap returns null.
        System.out.println(Antonyms.get(null)); // it will return no data. because null is the key value

        /*
        CREATE HASHMAP PRODUCTPRICE     <STRING , DOUBLE> 5 ELEMENTS
         */
        HashMap <String, Double> productPrice = new HashMap<>();
        productPrice.put("Macbook Air 2022 case", 75.5);
        productPrice.put("Samsung Tablet case", 30.5);
        productPrice.put("Airpods 3D Generation case", 20.0);
        productPrice.put("Ipad 9th generation case", 35.5);
        productPrice.put("Ipad 10th generation case", 37.8);

        System.out.println(productPrice);
        System.out.println(productPrice.get("Macbook Air 2022 case"));
        System.out.println(productPrice.get("Ipad 9th generation case"));

        System.out.println(productPrice.size());


        HashMap <String, String> fullName = new HashMap<>();
        fullName.put("Kim", null);
        fullName.put("Kortney", null);
        fullName.put(null, "Kardashian");
        fullName.put(null, "West");
        fullName.put("Kylie", "Jenner");

        /*
        You can copy another hashmap values by putting it in parentheses while hashmap declaration
         */

        HashMap <String, String> NewMap = new HashMap<>(Antonyms);

        HashMap <String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        HashMap <Integer, Integer> decimals = new HashMap<>();
        decimals.put(1, 100);
        decimals.put(2, 200);
        decimals.put(3, 300);
        decimals.put(4, 400);
        decimals.put(5, 500);

        boolean contains = decimals.containsKey(2); //true;
        System.out.println(contains);

        System.out.println(decimals.containsKey(500)); //false;

        System.out.println(decimals.containsValue(10000-9000)); //true
        System.out.println(decimals.containsValue(null)); //false
        System.out.println(decimals.containsKey(decimals.get(1)-99));//true;


        HashMap <String, HashMapIntro2> myObject = new HashMap<>();
        myObject.put("first object", new HashMapIntro2());
        myObject.put("second object", new HashMapIntro2());

        System.out.println("decimals: " + decimals);
        System.out.println("decimals size: " + decimals.size());

        decimals.remove(2);
        System.out.println("decimals size after removal: " + decimals.size());

        decimals.remove(1);
        System.out.println("decimals size after 2 removal: " + decimals.size());
        decimals.clear();
        System.out.println("decimals size after clear(): " + decimals.size());


        HashMap <Double, Integer> nums = new HashMap<>();
        nums.put(1.99, 1);
        nums.put(2.99, 2);
        nums.put(3.99, 3);
        nums.put(4.99, 4);
        nums.put(5.99, 5);
        nums.put(6.99, 6);
        nums.put(9.99, 7);
        System.out.println("nums" + nums);

        HashMap <Integer, Integer> orders = new HashMap<>();
        orders.put(1, 4);
        orders.put(12, 41);
        orders.put(13, 42);
        orders.put(14, 43);
        orders.put(15, 44);
        orders.put(16, 45);














    }
}

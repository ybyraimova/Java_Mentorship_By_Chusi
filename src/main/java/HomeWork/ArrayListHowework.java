package HomeWork;

import java.util.ArrayList;

public class ArrayListHowework {
    public static void main(String[] args) {
        /*
        Create ArrayListLoops class,  add following tasks and upload the file:
1. Create ArrayList<String> of 10 fruits, print all fruits using for each loop in the manner:
1 fruit - apple, 2 fruit - banana, 3 fruit - pear, etc
2. Create ArrayList<String> of 10 vegetables, print all vegetables using do while loop, in same manner as fruits
3. Create ArrayList<String> of 10 cities, print all cities using while loop, in same manner as fruits
4. Create ArrayList<String> of 10 foods, print all foods using for loop loop, in same manner as fruits
         */

        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("grapefruit");
        fruits.add("pineapple");
        fruits.add("dragon fruit");
        fruits.add("melon");
        fruits.add("mango");
        fruits.add("jack-fruit");
        fruits.add("mangosteen");
        //for-each loop:

        int count = 1;
        for(String fruit: fruits){
                System.out.println(count + " fruit - " + fruit);
                count++;
            }
        System.out.println();

        ArrayList <String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("pumpkin");
        vegetables.add("carrot");
        vegetables.add("onion");
        vegetables.add("tomato");
        vegetables.add("pepper");
        vegetables.add("broccoli");
        vegetables.add("cauliflower");
        vegetables.add("spinach");
        vegetables.add("cabbage");
        //do-while loop:
        int index= 0;
        int numeration =1;
        do{
            System.out.println(numeration + " vegetable - " + vegetables.get(index));
            index++;
            numeration++;
        }while(index <  vegetables.size());

        ArrayList <String> cities = new ArrayList<>();
        cities.add("Bucharest");
        cities.add("Nordhausen");
        cities.add("Cologne");
        cities.add("Riga");
        cities.add("Nicosia");
        cities.add("Warsaw");
        cities.add("Prague");
        cities.add("Budapest");
        cities.add("Catania");
        cities.add("Cagliari");
        //while loop:
        System.out.println();
        int ind = 0;
        int num = 1;
        while (ind < cities.size()){
            System.out.println(num + " city - " + cities.get(ind));
            ind++;
            num++;
        }

        ArrayList <String> food = new ArrayList<>();
        food.add("Kimchi");
        food.add("Kimchi-Chigae");
        food.add("Rameon");
        food.add("Udong");
        food.add("Samgeopsal");
        food.add("Takkalbi");
        food.add("Kimpab");
        food.add("Tteokpokki");
        food.add("Mandu");
        food.add("Chajameon");
        //for loop
        System.out.println();
        for(int i = 0; i < food.size(); i++){
                System.out.println(i + " food - " + food.get(i));
            }

        }
            }


        





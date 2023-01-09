package HomeWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        /*
        Create ArrayToArrayList java class, add following and upload the file:
1. Create array of Strings, put 10 elements inside. Print all values and size of array. Convert array to ArrayList.
Print all values and size of arraylist.*/
        String [] Pokemon =  {"Ash", "Pikachu", "Chermander", "JigliPuf", "Kate", "R", "Bulbazaur",
                                                "K", "Pokemon", "?"};
        System.out.println(Arrays.toString(Pokemon));
        System.out.println(Pokemon.length);

        List <String> arrayListPokemon = Arrays.asList(Pokemon);
        System.out.println(arrayListPokemon);
        System.out.println(arrayListPokemon.size());

/*2. Create array of int, put 10 elements inside. Print all values and size of array. Convert array to ArrayList.
Print all values and size of arraylist. */
        int [] integers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers.length);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int temp : integers){
            integerArrayList.add(temp);
        }
        System.out.println(integerArrayList);
        System.out.println(String.valueOf(integerArrayList.size()));

/*3. Create array of doubles, put 5 elements inside. Print all values and size of array. Convert array to ArrayList.
 Print all values and size of arraylist.*/
        double [] doubles = {99.9, 88.8, 77.7, 66.6, 55.5};
        System.out.println(Arrays.toString(doubles));
        System.out.println(doubles.length);

        ArrayList <Double> doubleArrayList = new ArrayList<Double>();
        for(double temp: doubles){
            doubleArrayList.add(temp);
        }
        System.out.println(doubleArrayList);
        System.out.println(doubleArrayList.size());

/*4. Create array of char, put 8 elements inside. Print all values and size of array. Convert array to ArrayList.
Print all values and size of arraylist.*/
        char [] chars = {'c', 'a', 'k', 'e', 's', 'y', 'u', 'm'};
        System.out.println(Arrays.toString(chars));
        System.out.println(chars.length);

        ArrayList <Character> charArrayList = new ArrayList<Character>();
        for(char temp: chars){
            charArrayList.add(temp);
        }
        System.out.println(charArrayList);
        System.out.println(charArrayList.size());

/*5. Create array of boolean, put 5 elements inside. Print all values and size of array. Convert array to ArrayList.
Print all values and size of arraylist. */
        boolean [] booleans = {true, false, true, false, true};
        System.out.println(Arrays.toString(booleans));
        System.out.println(booleans.length);

        ArrayList <Boolean> booleanArrayList = new ArrayList<Boolean>();
        for(boolean temp: booleans){
            booleanArrayList.add(temp);
        }
        System.out.println(booleanArrayList);
        System.out.println(booleanArrayList.size());













    }
}

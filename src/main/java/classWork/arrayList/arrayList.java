package classWork.arrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.add("Maserati");
        cars.add("Lamborghini");
        cars.add("Porsche");
        cars.add("MAzda");
        cars.add("Bugatti");

        System.out.println(cars);

        cars.set(3, "Ferrari"); //====> replaces the value inside the list;
        System.out.println(cars);

        //change Maserati to Mercedes:
        cars.set(0, "Mercedes");
        System.out.println(cars);

        cars.set(cars.size()-1, "Aston Martin"); //change last element
        System.out.println(cars);

        System.out.println("size " + cars.size());

        //method remove()

        cars.remove(0); //===> removes first element
        System.out.println(cars);
        System.out.println(cars.get(0)); //==> returns Lambo;
        cars.remove(2);
        System.out.println(cars.size());
        System.out.println(cars);

        //add Ferrari and Maserati again
        //[Maserati, Lamborghini, Porsche, Ferrari, Aston Martin]
        //use add(int index, String element)
        cars.add(0, "Maserati");
        cars.add(3, "Ferrari");
        System.out.println(cars);









    }

}

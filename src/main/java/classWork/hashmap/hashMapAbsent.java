package classWork.hashmap;

import java.util.HashMap;

public class hashMapAbsent {
    public static void main(String[] args) {
        HashMap<String, String> catOwners = new HashMap<>();
        catOwners.put("Tom", "Mira");
        catOwners.put("Garfield", "Aisuluu");
        catOwners.put("Akzholtoi", "Saikal");
        catOwners.put("Arti", "Alina");
        catOwners.put("Myimyi", "Myrzhakhan");

        int i =1;
//        for(String cat: catOwners.keySet()){
//            System.out.println("cat #: "+  i + " " + cat);
//            i++;
//        }

        for(String cat: catOwners.keySet()){
            System.out.println("cat #"+  i + ": " + cat + "\nowner #" + i + ": " + catOwners.get(cat));
            i++;
        }

        for(String catOwnersName: catOwners.values()){
            System.out.println("Cat owner name: " + catOwnersName);
        }






    }
}

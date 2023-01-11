package classWork.lalafo;

import java.util.ArrayList;

public abstract class Account {

    String username;
    String password;

    String location;
    String fullName;
    String phoneNumber;

    ArrayList <Ad>  adsList;

    public Account(String username, String password, String location, String fullName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.location = location;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;

        this.adsList = new ArrayList<>();
    }

    public abstract void logIn();


    public void addToBucket(Ad ad){
        adsList.add(ad);
        System.out.println("You have added " + ad.name);
    }


}

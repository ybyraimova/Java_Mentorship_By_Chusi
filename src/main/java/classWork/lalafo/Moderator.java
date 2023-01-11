package classWork.lalafo;

import java.util.ArrayList;
import java.util.List;

public class Moderator extends Account{

    public Moderator(String username, String password, String location, String fullName, String phoneNumber) {
        super(username, password, location, fullName, phoneNumber);
        this.adList = new ArrayList<>();
    }

    @Override
    public void logIn() {
        System.out.println("You have logged in (moderator)");

    }


    List <Ad> adList;

    public void approve(Ad ad){ //one object of Ad;
        if(ad.category.equals("books")){
            adList.add(ad);
            System.out.println("Approved " + ad.name);
        }else{
            System.out.println("Rejected " + ad.name);
        }
    }

    public MainPage launchBooks(MainPage mainPage){
        mainPage.addAd(adList);
        adList.clear();
        return mainPage;

    }
}

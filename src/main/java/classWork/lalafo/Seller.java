package classWork.lalafo;

public class Seller extends Account {
    public Seller(String username, String password, String location, String fullName, String phoneNumber) {
        super(username, password, location, fullName, phoneNumber);
    }

    @Override
    public void logIn() {
        System.out.println("You have logged in (seller)");

    }


    public void postAd(Ad ad, Moderator moderator) {
        moderator.approve(ad);
        System.out.println("You can post ad");
    }
}

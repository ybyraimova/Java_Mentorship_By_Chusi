package classWork.lalafo;

public class Main {
    public static void main(String[] args) {
        Moderator moderator = new Moderator("moderator", "1343", "bishkek", "harry potter", "0987654");
        Customer customer = new Customer("customer", "1343", "bishkek", "harry potter", "0987654");
        Seller seller = new Seller("seller", "1343", "bishkek", "harry potter", "0987654");

        MainPage mainpage = new MainPage(); //to store books

        Ad ad1 = new Ad("Book1", "230202", 1234, "shelf");
        Ad ad2 = new Ad("Book2", "230202", 1234, "books");


        seller.postAd(ad1, moderator);
        seller.postAd(ad2, moderator);
        mainpage.showAd();
        mainpage = moderator.launchBooks(mainpage);
        mainpage.showAd();

        Ad ad3 = new Ad("Book3", "230202", 1234, "books");

        NewComment newComment1 = new NewComment
                ("This is very good book!",
                "2029",
                        customer.fullName);

        ad3 =customer.addNewComment(newComment1, ad3);
        seller.postAd(ad3, moderator);
        mainpage.showAd();
        mainpage = moderator.launchBooks(mainpage);
        mainpage.showAd();





    }




}

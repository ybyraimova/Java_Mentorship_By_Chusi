package Instagram;

public class InstagramSoftware {
    public static void main(String[] args) {
        InstagramUser user1 = new InstagramUser
                ("Kim Kardahsian", "kimkardashian", "NORTH2022");

        user1.displayInfo();


        InstagramUser user2 = new InstagramUser
                ("Kanye West", "westkanye", "GOD2021", "Kanye West's BIO");

        user2.displayInfo();


        InstagramUser user3 = new InstagramUser ("Kylie Jenner", "kyliejenner",
                "Jenner2021", "Kylie Jenner's bio","http://instagram.com/kyliejenner/accountinfo");


        user3.displayInfo();

        InstagramUser user4 = new InstagramUser ("Madonna", "madonnasinger",
                "Madonna1234", "Madonna's bio","http://instagram.com/madonna/accountinfo");
        user1.postStory("Hello World!");
        user3.postStory("I am going to Gala 2023!");

       user3.visitProfile(user1);
       user1.visitProfile(user2);

       user4.isPrivate = true;
       user3.visitProfile(user4);

    }
}

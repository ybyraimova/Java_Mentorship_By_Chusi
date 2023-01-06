package HomeWork;

import com.sun.security.jgss.GSSUtil;

public class UserConstructor {
    //    Please create User class, and inside create 10 constructors.
    String fullName;
    String email;
    String phoneNumber;
    String username;
    String password;
    int age;
    String bio;
    String location;
    String link;
    boolean isPrivate;

    //    1
    public UserConstructor(String fullName) {
        System.out.println();
        this.fullName = fullName;
        System.out.println("Full name: " + fullName);


    }


    //    2
    public UserConstructor(String fullName, String email) {
        this(fullName);
        this.email = email;
        System.out.println("Email: " + email);
    }

    //    3
    public UserConstructor(String fullName, String email,
                           String phoneNumber) {
        this(fullName, email);
        this.phoneNumber = phoneNumber;
        System.out.println("Phone number:" + phoneNumber);
    }

    //    4
    public UserConstructor(String fullName, String email,
                           String phoneNumber, String username) {
        this(fullName, email, phoneNumber);
        this.username = username;
        System.out.println("User name: "+ username);
    }

    //    5
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password) {
        this(fullName, email, phoneNumber, username);
        this.password = password;
        System.out.println("Password"+ password);
    }

    //    6
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password, int age) {
        this(fullName, email, phoneNumber, username, password);
        this.age = age;
        System.out.println("Age:" + age);
    }

    //    7
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password, int age, String bio) {
        this(fullName, email, phoneNumber, username, password, age);
        this.bio = bio;
        System.out.println("BIO: "+ bio);
    }

    //    8
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password, int age, String bio, String location) {
        this(fullName, email, phoneNumber, username, password, age, bio);
        this.location = location;
        System.out.println("Location: "+ location);
    }

    //    9
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password, int age, String bio,
                           String location, boolean isPrivate) {
        this(fullName, email, phoneNumber, username, password, age, bio, location);
        this.isPrivate = isPrivate;
        System.out.println("Account is private: " + isPrivate);
    }

    //    10
    public UserConstructor(String fullName, String email, String phoneNumber,
                           String username, String password, int age, String bio,
                           String location, boolean isPrivate, String link) {
        this(fullName, email, phoneNumber, username, password, age, bio, location, isPrivate);
        this.link = link;
        System.out.println("Link: " + link);
    }
}
     class Software{
        public static void main(String[] args) {
            UserConstructor user1 = new UserConstructor("Kim Kardashian");
            UserConstructor user2 = new UserConstructor("Kim West", "kardashian@gmail.com");
            UserConstructor user3 = new UserConstructor("Kortney","kardhashian@apple.com",
                    "9410987654");
            UserConstructor user4 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk");
            UserConstructor user5 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020");
            UserConstructor user6 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020", 37);
            UserConstructor user7 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020", 37,
                    "I love puppies!");
            UserConstructor user8 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020", 37,
                    "I love puppies!", "Armenia");
            UserConstructor user9 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020", 37,
                    "I love puppies!", "Armenia", false);
            UserConstructor user10 = new UserConstructor("Kim Kardashian", "kardashian@gmail.com",
                    "94109876543", "kimkkk", "NORTH2020", 37,
                    "I love puppies!", "Armenia", false, "www.skims.com");
        }
    }


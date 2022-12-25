package Instagram;

public class InstagramUser {
    String name;
    String username;
    String password;
    String bio;
    String link;
    boolean isPrivate;

    public InstagramUser(String name, String username, String password){
//        this - keyword is a reference to an object of the class.
//        Most common use of this keyword is to set values of instance variables
//        when they have the same name with constructor parameter:
        this.name = name;
        this.username = username;
        this.password = password;
        this.link = "www.instagram.com"; //default values passed.
        this.isPrivate = false; //default values passed.
    }

    public InstagramUser(String name, String username, String password, String bio){
        this(name, username, password);
        this.bio =bio;
    }

    public InstagramUser(String name, String username, String password, String bio, String link){
        this(name, username, password, bio);
        this.link = link;
    }

    public  void displayInfo(){
        System.out.println("USER DETAILS:");
        System.out.println("Name: " + name +
                           "\nUsername: "+ username +
                           "\nPassword: "+ password+
                           "\nBIO: " + bio +
                           "\nLink: " + link +
                           "\nAccount is private: " +isPrivate);
        System.out.println();
    }

//    Create a method in InstagramUser called postStory.
//    This method accepts string for message and print out the messaage:

    public void postStory(String message){
        System.out.println();
        System.out.println(this.name + " just posted a story: "+ message); //it's better to use this.name in case you
        //create a local variable inside the method or outside, so java won't be confused.
    }

    public void visitProfile(InstagramUser user){ //Class object
        System.out.println();
        if(user.isPrivate ==true){
            System.out.println("The user is private.Can't see profile details");

        }else{
            System.out.println("Visiting the profile is success");
            System.out.println("Visited profile: "+ user.name);
        }
    }





}

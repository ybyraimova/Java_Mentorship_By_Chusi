package classWork.oop.inheritance;

public class Mobile extends Device{
    String brand;
    double price;
    boolean hasTouchScreen;
    boolean hasCamera;


    //the following constructor is there by default. but you do not see it.
    //if you type it then it won't be a default anymore.
//    public Mobile(){
//        super();
//    }

    public void call(){
        System.out.println("calling");
    }
    public void text(){
        System.out.println("texting");
    }

    public void takePhoto(){
        System.out.println("take photo");
    }
}

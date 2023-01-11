package classWork.oop.inheritance;

public class Device {
    String size;
    boolean isBAtteryBased;
    boolean hasMonitor;
    boolean hasInternet;
    int memory;
    //the following constructor is there by default. but you do not see it. but once
    //you create one it will be gone.
//    public Device(){
//
//    }

    public void switchOn(){
        System.out.println("switch on");

    }

    public  void switchOff(){
        System.out.println("switch off");

    }
}

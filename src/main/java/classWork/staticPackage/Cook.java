package classWork.staticPackage;

public class Cook {
    String name;
    static String order;


    public Cook(String name){
        this.name = name;
    }

    public void washHands(){
        System.out.println(name + " is washing hands");

    }
    public void prepareSalad(String salad){
        System.out.println(name + " is preparing "+ salad);
    }
    public static void takeOrder(String orderName){
        System.out.println(orderName + " order received");
        order = orderName;
    }
//block of code
    {
        System.out.println("This is a block of code");
    }

    static {
        System.out.println("this is a static block of code");
    }
}

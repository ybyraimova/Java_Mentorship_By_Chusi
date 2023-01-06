package classWork.staticPackage;

public class Restaurant {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Ramsey Gordon");
        Cook cook2 = new Cook("Salt Bae");

        cook1.washHands();
        cook2.prepareSalad("Greek salad");

        cook1.takeOrder("Rib Eye Steak");
        System.out.println(cook2.order);//rib eye steak

        Cook.takeOrder("pasta");
        cook2.takeOrder("fettuccine");

        System.out.println(cook1.order);


    }
}

package classWork.oop.abstraction;

public class Race {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();


        Tesla tesla = new Tesla();
        Car tesla2 = new Tesla();
        ElectricCar tesla3 = new Tesla();

        Object tesla4 = new Tesla();

        Object mercedes2 = new Mercedes();

        //car is interface - is representative of mercedes class;
        Car mercedes3 = new Mercedes();


    }
}

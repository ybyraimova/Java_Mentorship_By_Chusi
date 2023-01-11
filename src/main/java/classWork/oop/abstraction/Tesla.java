package classWork.oop.abstraction;

public class Tesla implements ElectricCar{

    public void drive() {
        System.out.println("Tesla is driving");
    }

    public void stop() {
        System.out.println("Tesla is breaking");
    }

    public void accelerate(int speed) {
        System.out.println("Tesla is accelerating by " + speed);
    }

    public void heat(double temp) {

    }

    public void electricCharge() {
        System.out.println("Tesla is charging");

    }
}

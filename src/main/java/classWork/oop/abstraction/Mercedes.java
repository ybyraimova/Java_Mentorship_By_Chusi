package classWork.oop.abstraction;

public class Mercedes implements Car{
    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Mercedes is accelerating " + speed + " miles.");

    }

    @Override
    public void heat(double temp) {
        System.out.println("Mercedes is heating up to temp "+ temp);
    }
}

package classWork.oop.abstraction;

public interface Car {

    /*
    interface is fully abstract type, that is used to describe the behavior that classes must implement
    you can only have abstract methods to set the behavior;
    interface can be implemented, not extended;
     */

    public abstract void drive();

    public abstract  void  stop();

    public abstract void accelerate(int speed);
    public abstract void heat(double temp);



    //default method which can have body(implementation)
    default void putOnSeatBelt(){
        System.out.println("the car's defalt method");
    }








}

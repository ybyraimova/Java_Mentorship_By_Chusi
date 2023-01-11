package classWork.oop.abstraction;

import java.util.stream.BaseStream;

public abstract class TriangleTypes extends Shapes{

    public abstract void printAngle();


    public void printInfo(){
        System.out.println("print from triangle types");
    }

    public static void printStaticInfo(){
        System.out.println("this is static method");

    }

    String shape = "triangle";
    int angles = 3;


}

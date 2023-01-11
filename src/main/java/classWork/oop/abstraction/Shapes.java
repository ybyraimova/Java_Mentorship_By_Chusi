package classWork.oop.abstraction;

import javax.swing.*;

public abstract class Shapes {
    String name;
    String color;


    public abstract int getArea(int length, int width);

    public abstract int getPerimeter(int length, int width);

    public abstract  int getPerimeter(int a, int b, int c);

}

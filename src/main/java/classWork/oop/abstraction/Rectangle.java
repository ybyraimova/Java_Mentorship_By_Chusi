package classWork.oop.abstraction;

public class Rectangle extends Shapes {


    public int getArea(int length, int width) {
        return length*width;
    }

    public int getPerimeter(int length, int width) {
        return 2*(length+width);
    }

    @Override
    public int getPerimeter(int a, int b, int c) {
        return 0;
    }
}

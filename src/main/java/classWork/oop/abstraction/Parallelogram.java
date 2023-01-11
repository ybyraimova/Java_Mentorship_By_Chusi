package classWork.oop.abstraction;

public class Parallelogram extends Shapes{
    public int getArea(int base, int height) {
        return base*height;
    }

    public int getPerimeter(int length, int width) {
        return 2*(length + width);
    }

    @Override
    public int getPerimeter(int a, int b, int c) {
        return 0;
    }
}

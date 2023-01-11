package classWork.oop.abstraction;

public class Triangle extends Shapes {

    public int getArea(int base, int height) {
        return (int)((double)(1/2)*base*height);
    }

    @Override
    public int getPerimeter(int length, int width) {
        System.out.println("provide a, b, c");
        return 0;
    }

    public int getPerimeter(int a, int b, int c) {
        return a+b+c;
    }
}

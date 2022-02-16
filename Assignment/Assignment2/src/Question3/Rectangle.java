package Question3;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        this.area = length * width;
    }

    public void computePerimeter() {
        this.perimeter = (length + width) * 2;
    }


}


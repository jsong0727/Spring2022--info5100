package Question3;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public void computeArea() {
        this.area = radius * radius * Math.PI;
    }

    public void computePerimeter() {
        this.perimeter = radius * 2 * Math.PI;
    }


}

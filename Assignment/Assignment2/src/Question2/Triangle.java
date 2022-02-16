package Question2;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height) {
        super("Triangle", "red");
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, double side) {
        super("Triangle", "red");
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return base * height * 0.5;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

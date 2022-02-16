package Question2;

public class Rhombus extends Shape {
    public double d1;
    public double d2;

    public Rhombus(String name, String color, double d1, double d2) {
        super("Rhombus", "Blue");
        this.d1 = d1;
        this.d2 = d2;
    }

    public Rhombus(String name, String color, double d1) {
        super("Rhombus", "Blue");
        this.d1 = d1;
        this.d2 = d1;
    }

    @Override
    public double getArea() {
        return d1 * d2 * 0.5;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.sqrt(d1 * d1 + d2 * d2);
    }


    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}

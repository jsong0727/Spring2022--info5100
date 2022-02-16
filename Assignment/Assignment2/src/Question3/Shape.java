package Question3;

public class Shape {
    String name;
    double area;
    double perimeter;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Shape: " + name + "\nArea: " + area + "\nPerimeter: " + perimeter);
    }


}

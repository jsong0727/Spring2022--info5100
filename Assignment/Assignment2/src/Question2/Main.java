package Question2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4);
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        triangle.printShape();
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}

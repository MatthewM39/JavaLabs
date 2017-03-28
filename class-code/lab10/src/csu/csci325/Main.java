package csu.csci325;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle();
        System.out.println("Circle of radius 10:");
        printShape2D(circle);
        System.out.println("Rectangle:");
        printShape2D(rectangle);
    }

    public static void printShape2D(Shape2D shape) {
        System.out.println("\tArea:" + shape.getArea());
        System.out.println("\tCircumference:" + shape.getCircumference());
        System.out.println("\tNumAngles:" + shape.getNumAngles());
    }
}

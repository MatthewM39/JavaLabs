package csujava;

public class Main {

    // testing creation of shapes
    public static void main(String[] args) {
        Circle circle = new Circle(10); //circle with radius 10
        Rectangle rectangle = new Rectangle(5, 10); // 5 x 10 rectangle
        RightTriangle rightTriangle = new RightTriangle(3, 4); // 3x4x5 triangle
        System.out.println("Circle of radius 10:");
        printShape2D(circle);
        System.out.println("Rectangle (" + 5 + "x" + 10 + "):" );
        printShape2D(rectangle);
        System.out.println("Right Triangle (3x4x5):");
        printShape2D(rightTriangle);
    }

    public static void printShape2D(Shape2D shape) {
        System.out.println("\tArea:" + shape.getArea());
        System.out.println("\tCircumference:" + shape.getCircumference());
        System.out.println("\tNumAngles:" + shape.getNumAngles());
    }
}


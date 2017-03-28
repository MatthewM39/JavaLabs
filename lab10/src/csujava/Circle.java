package csujava;

/**
 * Created by pwest on 10/15/15.
 */

public class Circle extends Shape2D {
    private float mRadius; // radius for the circle

    // returns the area of the circle
    public double getArea() {
        return Math.PI * mRadius * mRadius;
    }

    // returns the circumference
    public double getCircumference() {
        return 2.0 * Math.PI * mRadius;
    }

    // creates a circle with the given radius and 0 angles
    public Circle (float radius) {
        mRadius = radius;
        mAngles = 0;
    }
}
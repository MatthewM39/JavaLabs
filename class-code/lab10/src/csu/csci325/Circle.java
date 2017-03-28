package csu.csci325;

/**
 * Created by pwest on 10/15/15.
 */
public class Circle extends Shape2D {
    private float mRadius;

    public double getArea() {
        return Math.PI * mRadius * mRadius;
    }

    public double getCircumference() {
        return 2.0 * Math.PI * mRadius;
    }

    public Circle (float radius) {
        mRadius = radius;
        mAngles = 0;
    }
}

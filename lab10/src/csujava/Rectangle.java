package csujava;


/**
 * Created by pwest on 10/15/15.
 */

public class Rectangle extends Shape2D {

    // length and width of the rectangle
    private double mLength, mWidth;

    // gets the area
    public double getArea(){
        return mLength * mWidth;
    }

    // get the circumference
    public double getCircumference(){
        return 2 * (mLength + mWidth);
    }

    // sets the length, width, and number of angles for the rectangle
    public Rectangle(double length, double width){
        mLength = length;
        mWidth = width;
        mAngles = 4;
    }
}

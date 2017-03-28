package csujava;

/**
 * Created by pwest on 10/15/15.
 */
public class RightTriangle extends Shape2D {

    // three legs for the right triangle
    private double mLeg1, mLeg2, mLeg3;

    // area of a right triangle is (1/2) leg1 * leg2
    public double getArea(){
        return (mLeg1 * mLeg2) / 2;
    }

    // return the perimeter of the triangle
    public double getCircumference(){
        return mLeg1 + mLeg2 + mLeg3;
    }

    // set the length of the legs
    public RightTriangle(double leg1, double leg2){
        mLeg1 = leg1;
        mLeg2 = leg2;
        mLeg3 = Math.sqrt((mLeg1 * mLeg1) + (mLeg2 * mLeg2)); // the hypotenuse is found using the pythagorean theorem.
        mAngles = 3; // triangles have three angles
    }

}

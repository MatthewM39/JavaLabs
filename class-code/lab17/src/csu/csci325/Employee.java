package csu.csci325;

/**
 * Created by pwest on 11/17/15.
 */
public class Employee {
    private String mFirstName, mLastName, mAddress;
    private int mSSN;
    Employee( String fname, String lname, String address, int SSN) {
        mFirstName = fname;
        mLastName = lname;
        mAddress = address;
        mSSN = SSN;
    }

    @Override
    public String toString() {
        return mFirstName + " " + mLastName + " @ " + mAddress;
    }

    @Override
    public int hashCode() {
        return mSSN;
    }
}

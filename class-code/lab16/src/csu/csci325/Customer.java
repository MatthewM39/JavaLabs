package csu.csci325;

/**
 * Created by pwest on 11/10/15.
 */
public class Customer {
    private int mArrivalTime, mDepartureTime;
    /**
     * Creates a new customer with the specified arrival time.
     * @param arrives the arrival time
     */
    public Customer(int arrives) {
        mArrivalTime = arrives;
        mDepartureTime = 0;
    }

    public int getArrivalTime(){
        return mArrivalTime;
    }

    public void setDepartureTime(int departs) {
        mDepartureTime = departs;
    }

    public int getDepartureTime() {
        return mDepartureTime;
    }

    public int totalTime() {
        return mDepartureTime - mArrivalTime;
    }
}

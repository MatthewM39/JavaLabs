package csu.csci325;

/**
 * Created by pwest on 11/5/15.
 */
public class TowersOfHanoi {
    private int mDisks;
    TowersOfHanoi(int disks) {
        mDisks = disks;
    }
    public int solve() {
        return moveTower(mDisks, 1, 3, 2);
    }

    public int moveTower(int disks, int start, int end, int temp) {
        int ret = 0;
        if (disks == 1) {
            movePeg(start, end);
            return 1;
        }
        ret += moveTower(disks - 1, start, temp, end);
        movePeg(start, end);
        ret += 1;
        ret += moveTower(disks - 1, temp, end, start);

        return ret;
    }

    public void movePeg(int start, int end) {
        System.out.println("Move from " + start + " to " + end);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pwest on 9/24/15.
 */
public class TimeOutPanel extends JPanel {
    JLabel mTitle;
    Timer mTimeOut;

    public TimeOutPanel() {
        mTitle = new JLabel("Start");
        mTimeOut = new Timer(200, new TimeOutListener());

        this.add(mTitle);
        mTimeOut.start();
        mTimeOut.setRepeats(true);
    }
    static int start = 1;
    class TimeOutListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mTitle.setText("Start: " + start);
            start++;
            if (start > 50) {
                mTimeOut.stop();
            }
        }
    }
}

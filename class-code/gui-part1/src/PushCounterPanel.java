/**
 * Created by pwest on 9/22/15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PushCounterPanel extends JPanel {
    private int mCount;
    private JButton mButton;
    private JLabel mLabel;

    PushCounterPanel() {
        mCount = 0;
        mButton = new JButton("Push me!");
        mLabel = new JLabel("Count: " + mCount);
        this.add(mButton);
        this.add(mLabel);
        mButton.addActionListener(new ButtonListener());

        //this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(200, 100));
    }

    public void incrementLabel() {
        mCount++;
        mLabel.setText("Count: " + mCount);
    }

    public int getCount() {
        return mCount;
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            incrementLabel();
        }
    }
}

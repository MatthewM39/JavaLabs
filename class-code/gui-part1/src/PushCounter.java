/**
 * Created by pwest on 9/22/15.
 */

import javax.swing.*;
import java.awt.*;

public class PushCounter {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Push Counter");
        frame.add(new PushCounterPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setPreferredSize(new Dimension(640, 480));
        frame.pack();
        frame.setVisible(true);
    }
}

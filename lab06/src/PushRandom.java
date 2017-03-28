

/**
 * Created by Matthew on 9/28/2015.
 */

import javax.swing.*;



public class PushRandom {
    public static void main(String args[]){
        JFrame frame = new JFrame("Random Number Generator");
        frame.add(new PushRandomPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

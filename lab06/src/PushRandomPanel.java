/**
 * Created by Matthew on 9/28/2015.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PushRandomPanel extends JPanel{
    private int mRand;
    private JButton mButton;
    private JLabel mLabel;

    PushRandomPanel(){
        mButton = new JButton("Click Here");
        mLabel = new JLabel();
        this.add(mButton);
        this.add(mLabel);
        mButton.addActionListener(new ButtonListener());

        //set a preferred program size so that it's visible on my pc
        this.setPreferredSize(new Dimension(300, 50));
    }

    // When the button is clicked, set mRand to a number between 1 and 100 and set mLabel to the number
   private class ButtonListener implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
          mRand = (int) (Math.random() * 100) + 1;
          mLabel.setText("" + mRand);
       }
   }

    // get the mLabel
    public JLabel getMLabel(){
        return mLabel;
    }

    // get the mButton
    public JButton getMButton(){
        return mButton;
    }

}

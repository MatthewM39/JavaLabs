import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pwest on 9/24/15.
 */
public class FtoCPanel extends JPanel {
    private JLabel mTitle, mResult;
    private JTextField mTemp;
    public FtoCPanel() {
        mTitle = new JLabel("Please enter temperature in F:");
        mResult = new JLabel("In C:");
        mTemp = new JTextField();
        mTemp.setPreferredSize(new Dimension(100, 20));
        mTemp.addActionListener(new TempListener());
        this.add(mTitle);
        this.add(mTemp);
        this.add(mResult);
    }

    private class TempListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("TextField contents ->" + mTemp.getText());
            int f = Integer.parseInt(mTemp.getText());
            int c = 5 * (f-32) / 9;
            mResult.setText("In C: " + c);
        }
    }
}

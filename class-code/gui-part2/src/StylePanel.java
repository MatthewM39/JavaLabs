import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pwest on 9/24/15.
 */
public class StylePanel extends JPanel {
    public JLabel mTitle;
    public JCheckBox mBold, mItalic;
    public StylePanel () {
        mTitle = new JLabel("Say it with Style");
        mBold = new JCheckBox("Bold");
        mItalic = new JCheckBox("Italic");

        this.add(mTitle);
        this.add(mBold);
        this.add(mItalic);

        mBold.addActionListener(new StyleListener());
        mItalic.addActionListener(new StyleListener());
    }

    class StyleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;

            if (mBold.isSelected()) {
                style = Font.BOLD;
            }

            if (mItalic.isSelected()) {
                style += Font.ITALIC;
            }

            mTitle.setFont(new Font("Helvetica", style, 12));
        }
    }
}

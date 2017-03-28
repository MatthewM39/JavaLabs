import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pwest on 9/24/15.
 */
public class MeasurePanel extends JPanel {
    JLabel mQuote;
    JRadioButton mComedy, mPhil, mCarp;
    public MeasurePanel() {
        mQuote = new JLabel("Measure twice, cut once");
        mComedy = new JRadioButton("Comedy");
        mPhil = new JRadioButton("Philosophy");
        mCarp = new JRadioButton("Carpentry");

        ButtonGroup bg = new ButtonGroup();
        bg.add(mComedy);
        bg.add(mPhil);
        bg.add(mCarp);

        mComedy.addActionListener(new QuoteListener());
        mPhil.addActionListener(new QuoteListener());
        mCarp.addActionListener(new QuoteListener());

        this.add(mQuote);
        this.add(mComedy);
        this.add(mPhil);
        this.add(mCarp);
    }

    class QuoteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object s = e.getSource();

            if (s == mComedy) {
                mQuote.setText("knock knock");
            } else if (s == mPhil) {
                mQuote.setText("Now is the time...");
            } else if (s == mCarp) {
                mQuote.setText("Measure Twice cut once");
            }
        }
    }
}

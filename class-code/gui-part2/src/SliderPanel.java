import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created by pwest on 9/24/15.
 */
public class SliderPanel extends JPanel {
    JLabel mRedLabel, mGreenLabel, mBlueLabel;
    JSlider mRedSlider, mGreenSlider, mBlueSlider;

    public SliderPanel() {
        mRedLabel = new JLabel("RED: ");
        mRedSlider = new JSlider(0, 255, 75);

        JPanel jp = new JPanel();
        BoxLayout bl = new BoxLayout(jp, BoxLayout.Y_AXIS);
        jp.add(mRedLabel);
        jp.add(mRedSlider);
        jp.setLayout(bl);

        this.add(jp);

        mRedSlider.addChangeListener(new ColorChange());
    }

    class ColorChange implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            int red = mRedSlider.getValue();
            mRedLabel.setText("RED: " + red);
        }
    }
}

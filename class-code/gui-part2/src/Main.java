import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created by pwest on 9/24/15.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FtoC");
        //frame.add(new FtoCPanel());
        //frame.add(new StylePanel());
        //frame.add(new MeasurePanel());
        //frame.add(new SliderPanel());
        //frame.add(new GradePanel());
        //frame.add(new TimeOutPanel());
        //frame.add(new LayoutPanel());
        //frame.add(new MousePanel());
        frame.add(new DialogPanel());

                frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

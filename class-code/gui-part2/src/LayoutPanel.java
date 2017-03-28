import javax.swing.*;
import java.awt.*;

/**
 * Created by pwest on 9/24/15.
 */
public class LayoutPanel extends JPanel {
    public LayoutPanel () {
        //BoxLayout bl = new BoxLayout(this, BoxLayout.Y_AXIS);
        //this.setLayout(bl);

        //GridLayout gl = new GridLayout(2, 3);
        //this.setLayout(gl);

        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        this.add(new JLabel("Message 1!"));
        this.add(new JLabel("Message 2!"));
        this.add(new JLabel("Message 3!"));
        this.add(new JLabel("Message 4!"));
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Created by pwest on 9/24/15.
 */
public class DialogPanel extends JPanel {
    public DialogPanel() {
        String str = JOptionPane.showInputDialog("Please input an Integer");

        System.out.println("You entered: " + str);

        JOptionPane.showMessageDialog(null, "You entered: " + str);

        int result = JOptionPane.showConfirmDialog(null, "Would you like to do it again?");

        System.out.println("result = " + result);

        this.setPreferredSize(new Dimension(640, 480));
    }
}

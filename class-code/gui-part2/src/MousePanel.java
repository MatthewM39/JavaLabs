import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by pwest on 9/24/15.
 */
public class MousePanel extends JPanel {
    public MousePanel() {
        this.addMouseListener(new MMouseListener());
        this.setPreferredSize(new Dimension(640, 480));
        this.addKeyListener(new KKeyListener());
        this.setFocusable(true);
    }
    class KKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Typed: " + e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Pressed: " + e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Released: " + e.getKeyChar());
        }
    }
    class MMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("CLICK");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Released");
            System.out.println("x = " + e.getX() + "|y = " + e.getY());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Exited");
        }
    }
}

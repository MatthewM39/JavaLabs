import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pwest on 9/24/15.
 */
public class GradePanel extends JPanel {
    JLabel mTitle;
    JComboBox mGradeSelection;

    public GradePanel() {
        mTitle = new JLabel("Grade:");
        String grades[] = {"A", "B", "C", "D", "F"};
        mGradeSelection = new JComboBox(grades);

        this.add(mTitle);
        this.add(mGradeSelection);
        mGradeSelection.addActionListener(new GradeListener());
    }

    private class GradeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object s = e.getSource();
            if (s == mGradeSelection) {
                System.out.println("Grade Selection: " + mGradeSelection.getSelectedItem());
                mTitle.setText("Grade: " + mGradeSelection.getSelectedItem());
            }
        }
    }
}

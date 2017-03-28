import javax.swing.*;

/**
 * Created by Matthew on 9/30/2015.
 */

public class SumProductDialog {
    public static void main(String[] args){
        String toInt, result;
        int input1, input2, repeat;

        do{
            // get user input for the integers and converts them from strings to int
            toInt = JOptionPane.showInputDialog("Please enter the first integer: ");
            input1 = Integer.parseInt(toInt);
            toInt = JOptionPane.showInputDialog("Please enter the second integer: ");
            input2 = Integer.parseInt(toInt);

            // sets the result string to the sum and products of the integers then displays them
            result = "The sum is: " + (input1 + input2) + "\n" + "The product is: " + (input1 * input2);
            JOptionPane.showMessageDialog(null, result);

            // check if the user wishes to repeat the program
            repeat = JOptionPane.showConfirmDialog(null, "Do you wish to process another?");
        }

        // runs while the user chooses yes at the end
        while (repeat == JOptionPane.YES_OPTION);
    }

}

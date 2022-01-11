package pl.mkluzniak;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or inform  them of something.


        //basic dialog messages
//        JOptionPane.showMessageDialog(null, "This is info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "more info","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "for real??","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "OMG VIRUS!!!","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Call ambulance!","title",JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "do you even code?", "This title", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?:"); //window that asking for name
//        JOptionPane.showMessageDialog(null, "Hello " + name, "Name", JOptionPane.PLAIN_MESSAGE); //pop up window with name and welcome word

        String[] responses = {"No, you're awesome!", "Thank You!", "blush"}; //string response under buttons
        ImageIcon icon = new ImageIcon("PIN2.png");//adding my icon to window
        JOptionPane.showOptionDialog(
                null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);//values for poped window


    }
}

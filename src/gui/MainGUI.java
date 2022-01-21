package gui;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
    private static void createGUI() {
        JFrame frame = new JFrame("SecurePass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    private static void login() {

    }
    public static void main(String[] args) {
        createGUI();
    }
}

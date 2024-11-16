import java.awt.Component;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 400;
        int boardHeight = 400;
        JFrame frame = new JFrame();
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Pacman pacman = new Pacman();
        frame.add(pacman);
        frame.pack();
        frame.setVisible(true);
    }
}

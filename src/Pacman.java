import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.*;

public class Pacman extends JPanel {
    int boardWidth = 400;
    int boardHeight = 400;



    private class InnerPacman {
        int x = 185;
        int y = 185;
        int width = 25;
        int height = 25;
        Image pacImage;

        InnerPacman(Image pacImage) {
            this.pacImage = pacImage;
        }
        
    }


    //game logic
    InnerPacman pacman;

    Pacman() {
        //Game Panel setting
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);

        //load images
        URL imageURL = getClass().getResource("/pacmanDown.png");
        if (imageURL == null) {
            throw new RuntimeException("Image not found: pacmanDown.png");
        }
        Image pacmanDown = new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        Image pacmanUp = new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        Image pacmanLeft = new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        Image pacmanRight = new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();
        Image wall = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        Image blueGhost = new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        Image redGhost = new ImageIcon(getClass().getResource("./redGhost.png")).getImage();
        Image pinkGhost = new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();
        Image orangeGhost = new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        Image scaredGhost = new ImageIcon(getClass().getResource("./scaredGhost.png")).getImage();
        Image food = new ImageIcon(getClass().getResource("./powerFood.png")).getImage();


        pacman = new InnerPacman(pacmanDown);
        startGame();
    }

    public void startGame() {
        // Initialization
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pacman.pacImage, pacman.x, pacman.y, pacman.width, pacman.height, null);
    }
}
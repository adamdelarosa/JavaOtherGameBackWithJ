package game;

import javax.swing.*;

/**
 * Created by ROSA on 25/06/2016.
 */
public class Frame {

    public static void main(String args[]){
        mainFrame();
    }

    private static void mainFrame() {
        JFrame gameFrame = new JFrame("Game");

        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(1200,400);
        gameFrame.setVisible(true);
    }
}

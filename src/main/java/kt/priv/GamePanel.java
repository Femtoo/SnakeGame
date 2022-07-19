package kt.priv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener{

    static final int SCREEN_HEIGHT = 800;
    static final int SCREEN_WIDTH = 800;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGHT * SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY = 80;
    int bodyParts = 8;
    int fruitsEaten;
    int fruitX;
    int fruitY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    final int [] x = new int[GAME_UNITS];
    final int [] y = new int[GAME_UNITS];  

    GamePanel() {

    }

    public void start() {

    }

    public void paintComp(Graphics g) {

    }

    public void draw(Graphics g) {

    }
    public void move() {

    }
    public void checkFruit() {

    }
    public void checkCollisions() {

    }
    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}

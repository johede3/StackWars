import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;

public class Stack {

    private int population, stackPosX, stackPosY;
    private BufferedImage image;
    public Stack(int posX, int posY){
        population = 10;
        stackPosX = posX;
        stackPosY = posY;
    }

    public Graphics getGraphicsAs(){
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(200, 62, 30, 10);
        };
    }
}


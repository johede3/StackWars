import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class GraphicsGen extends JPanel{
    private BufferedImage image;
    GraphicsGen() {
        try
        {
            image = ImageIO.read(new File("C:\\Users\\Frost\\IdeaProjects\\StackWars\\Graphics\\Stack.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            g.drawImage(image, 1000, 300, null);
        }

}


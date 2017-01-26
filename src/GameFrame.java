import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GameFrame {

    private JFrame mainFrame;
    private BufferedImage image;
    private JPanel mainPanel;
    public GameFrame() {
        mainFrame = buildFrame();
        Level level = new Level(1);
        try
        {
            image = ImageIO.read(new File("C:\\Users\\Frost\\IdeaProjects\\StackWars\\Graphics\\Stack.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        mainPanel = level.getPanel();
        GraphicsGen gen = new GraphicsGen();
        mainPanel.add(gen);
        mainFrame.add(mainPanel);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    }
    private JFrame buildFrame() {
        JFrame frame;
        frame = new JFrame("Stack Wars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 250);
        frame.setVisible(true);
        return frame;
    }

}

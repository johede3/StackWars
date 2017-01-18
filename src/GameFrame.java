import javax.swing.JFrame;


public class GameFrame {

    private JFrame mainFrame;

    public GameFrame() {
        mainFrame = buildFrame();
        Level level = new Level(1);

        mainFrame.add(level.getPanel());
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

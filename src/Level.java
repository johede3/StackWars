import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Level {

    JPanel panel = new JPanel();
    private ArrayList<Stack> listStack = new ArrayList<Stack>();
    private HashMap<Integer, ArrayList<Stack>> levelStack = new HashMap<Integer, ArrayList<Stack>>();

    public Level(int level) {

        addLevels();
        listStack = new ArrayList<Stack>();
        initLevel(level);
        JButton button = new JButton("asd");
        button.get
    }

    private void initLevel(final int level) {
        if(levelStack.containsKey(level)){
            Iterator<Stack> iter = levelStack.get(level).iterator();
            while(iter.hasNext()){
                Stack temp = iter.next();
                panel.add(temp.getGraphicsAs());
            }
        }
    }

    private void addLevels() {
        int x[] = {100, 700, 100, 700, 350};
        int y[] = {100, 100, 700, 700, 350};
        for (int i = 0; i <= 5; i++) {
            Stack temp = new Stack(x[i], y[i]);
            listStack.add(temp);
        }
        levelStack.put(1, listStack);
    }

    public JPanel getPanel(){
        panel.setBackground(Color.white);
        return panel;
    }
}

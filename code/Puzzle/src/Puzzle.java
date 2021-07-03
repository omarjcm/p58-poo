import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzle extends JFrame {

    private ArrayList<Icon> allImages = new ArrayList<Icon>();
    private ArrayList<JButton> allButtons = new ArrayList<JButton>();
    private JPanel panel;

    public Puzzle() {
        super("Picture Puzzle");
        storageImages();
        init();
    }

    public void init() {
        this.panel = new JPanel();
        this.panel.setLayout( new GridLayout(3, 3, 1,1));
        getContentPane().add(this.panel, BorderLayout.CENTER);

        createButtons();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void storageImages() {
        for (int i=1; i<=9; i++) {
            Icon icon = new ImageIcon(getClass().getResource("dog-puzzle/" + i + ".jpg"));
            allImages.add( icon );
        }
    }

    public void createButtons() {
        for (int i=0; i < 9; i++) {
            JButton btn = new JButton( allImages.get(i) );
            allButtons.add( btn );
        }

        Collections.shuffle( allButtons );

        for (int i=0; i<9; i++) {
            panel.add( allButtons.get(i) );
        }
    }

    public static void main(String[] args) {
        new Puzzle();
    }
}

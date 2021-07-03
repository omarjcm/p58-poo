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
            this.allImages.add( icon );
        }
    }

    public void createButtons() {
        for (int i=0; i < 9; i++) {
            JButton btn = new JButton( resizeIcon( this.allImages.get(i) ) );
            btn.setPreferredSize(new Dimension(150, 150));
            this.allButtons.add( btn );
        }

        Collections.shuffle( this.allButtons );

        for (int i=0; i<9; i++) {
            this.panel.add( this.allButtons.get(i) );
        }
    }

    public Icon resizeIcon(Icon input) {
        ImageIcon img = new ImageIcon(((ImageIcon) input).getImage().getScaledInstance(150, 150, DO_NOTHING_ON_CLOSE));
        return img;
    }

    public static void main(String[] args) {
        new Puzzle();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzle extends JFrame implements ActionListener {

    private ArrayList<Icon> allImages;
    private ArrayList<JButton> allButtons;
    private JPanel panel;
    private boolean firstClick;
    private JButton firstBtn;
    private JButton secondBtn;

    public Puzzle() {
        super("Picture Puzzle");
        this.allImages = new ArrayList<Icon>();
        this.allButtons = new ArrayList<JButton>();
        this.firstClick = false;
        storageImages();
        init();
    }

    public void init() {
        this.panel = new JPanel();
        this.panel.setLayout( new GridLayout(3, 3, 1,1));
        getContentPane().add(this.panel, BorderLayout.CENTER);

        createButtons();

        JButton reset = new JButton("RESET");
        getContentPane().add(reset, BorderLayout.SOUTH);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allButtons.clear();
                getContentPane().removeAll();
                init();
            }
        });

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
            ((ImageIcon) btn.getIcon()).setDescription( String.valueOf( i ) );
            btn.setPreferredSize( new Dimension(150, 150) );
            btn.addActionListener(this );
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!firstClick) {
            firstClick = true;
            this.firstBtn = (JButton) e.getSource();
        } else {
            firstClick = false;
            this.secondBtn = (JButton) e.getSource();

            if (this.secondBtn != this.firstBtn) {
                swap();
            }

            boolean result = checkWin();
            if (result) {
                JOptionPane.showMessageDialog(this, "??Muy bien, ganaste!", "Felicitaciones1", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    public void swap() {
        Icon icon1 = this.firstBtn.getIcon();
        Icon icon2 = this.secondBtn.getIcon();

        this.firstBtn.setIcon( icon2 );
        this.secondBtn.setIcon( icon1 );
    }

    public boolean checkWin() {
        boolean win = true;

        for (int i=0; i<9; i++) {
            if ( !((ImageIcon)allButtons.get(i).getIcon() ).getDescription().equals( String.valueOf(i) ) )  {
                win = false;
                break;
            }
        }

        return win;
    }
}

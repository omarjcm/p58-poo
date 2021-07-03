package ups.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaGUI {
    private JTextField textField1;
    private JButton guardarButton;
    private JButton cerrarButton;
    private JPasswordField passwordField1;
    private JPanel sisbib;

    public BibliotecaGUI() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola mundo.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Información Bibliotecario");
        frame.setContentPane( new BibliotecaGUI().sisbib );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }
}

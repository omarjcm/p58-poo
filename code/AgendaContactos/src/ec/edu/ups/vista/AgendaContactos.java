package ec.edu.ups.vista;

import javax.swing.*;

public class AgendaContactos {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AgendaContactosGUI();
            }
        });
    }
}

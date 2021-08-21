package ec.edu.ups.controlador;

import ec.edu.ups.Constantes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionarListener implements ActionListener {

    private JMenuItem item;
    private JFrame frame;

    public GestionarListener(JFrame frame, JMenuItem item){
        this.frame = frame;
        this.item = item;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.item.getActionCommand());
        switch (this.item.getActionCommand()) {
            case Constantes.OPCION_C:
                break;
            case Constantes.OPCION_U:
                break;
            case Constantes.OPCION_D:
                break;
            case Constantes.OPCION_R:
                break;
            case Constantes.OPCION_G:
                break;
            case Constantes.OPCION_S:
                this.frame.setVisible(false);
                this.frame.dispose();
                break;
        }
    }
}

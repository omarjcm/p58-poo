package ec.edu.ups.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdernarListener implements ActionListener {

    private GestionarBarras barras;

    public OrdernarListener(GestionarBarras barras) {
        this.barras = barras;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.barras.ordenar();
    }
}

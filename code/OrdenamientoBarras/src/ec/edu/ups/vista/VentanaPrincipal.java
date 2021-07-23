package ec.edu.ups.vista;

import ec.edu.ups.Constante;
import ec.edu.ups.controlador.GestionarBarras;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrdenamientoBarras();
            }
        });
    }
}

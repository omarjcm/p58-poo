package ec.edu.ups.vista;

import ec.edu.ups.Constante;
import ec.edu.ups.controlador.GestionarBarras;

import javax.swing.*;
import java.awt.*;

public class OrdenamientoBarras extends JFrame {

    private GestionarBarras barras;

    public OrdenamientoBarras() {

        super("Ordenamiento de Barras");
        Container container = this.getContentPane();
        this.barras = new GestionarBarras();
        container.add( barras );
        this.pack();

        this.setSize( Constante.ANCHO,Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }
}

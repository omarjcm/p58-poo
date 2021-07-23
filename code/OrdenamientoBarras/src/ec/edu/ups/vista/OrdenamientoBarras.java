package ec.edu.ups.vista;

import ec.edu.ups.Constante;
import ec.edu.ups.controlador.GestionarBarras;
import ec.edu.ups.controlador.ReiniciarListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdenamientoBarras extends JFrame {

    private GestionarBarras barras;

    public OrdenamientoBarras() {
        super("Ordenamiento de Barras");

        GridBagLayout gb = new GridBagLayout();
        this.setLayout( gb );

        GridBagConstraints cons = new GridBagConstraints();

        JButton reiniciarBtn = new JButton("Reiniciar");
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        this.getContentPane().add( reiniciarBtn, cons );

        JButton ordernarBtn = new JButton("Ordenar");
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        this.getContentPane().add( ordernarBtn, cons );

        this.barras = new GestionarBarras();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 2;
        cons.gridheight = 3;
        cons.weightx = 1.0;
        cons.weighty = 1.0;
        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add( this.barras, cons );
        this.pack();

        ActionListener reiniciarLstnr = new ReiniciarListener( this.barras );
        reiniciarBtn.addActionListener( reiniciarLstnr );

        this.setSize( Constante.ANCHO,Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }
}

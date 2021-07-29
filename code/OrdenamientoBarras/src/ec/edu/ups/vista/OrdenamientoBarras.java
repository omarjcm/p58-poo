package ec.edu.ups.vista;

import ec.edu.ups.Constante;
import ec.edu.ups.controlador.GestionarBarras;
import ec.edu.ups.controlador.OrdernarListener;
import ec.edu.ups.controlador.PausarListener;
import ec.edu.ups.controlador.ReiniciarListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class OrdenamientoBarras extends JFrame {

    private GestionarBarras barras;
    private ResourceBundle rb;

    public OrdenamientoBarras() {
        super();

        this.rb = ResourceBundle.getBundle( Constante.RECURSO, Locale.FRENCH);
        this.setTitle(this.rb.getString("ventana.titulo"));

        GridBagLayout gb = new GridBagLayout();
        this.setLayout( gb );

        GridBagConstraints cons = new GridBagConstraints();

        JButton reiniciarBtn = new JButton("Reiniciar");
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( reiniciarBtn, cons );

        JButton ordernarBtn = new JButton("Ordenar");
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( ordernarBtn, cons );

        JButton pausarBtn = new JButton("Pausar");
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( pausarBtn, cons );

        String lengualesLst[] = {"Español", "Inglés", "Francés"};
        JComboBox lenguajesCmbbx = new JComboBox(lengualesLst);
        lenguajesCmbbx.setSelectedIndex(0);
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( lenguajesCmbbx, cons );

        this.barras = new GestionarBarras();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 4;
        cons.gridheight = 3;
        cons.weightx = 1.0;
        cons.weighty = 1.0;
        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add( this.barras, cons );
        this.pack();

        ActionListener reiniciarLstnr = new ReiniciarListener( this.barras );
        reiniciarBtn.addActionListener( reiniciarLstnr );

        ActionListener ordenarLstnr = new OrdernarListener( this.barras );
        ordernarBtn.addActionListener( ordenarLstnr );

        ActionListener pausarLstnr = new PausarListener( this.barras );
        pausarBtn.addActionListener( pausarLstnr );

        this.setSize( Constante.ANCHO,Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }
}

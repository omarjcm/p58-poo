package ec.edu.ups.vista;

import ec.edu.ups.Constantes;

import javax.swing.*;
import java.util.ResourceBundle;

public class AgendaContactosGUI extends JFrame {

    private ResourceBundle rb;

    public AgendaContactosGUI() {
        super();

        this.rb = ResourceBundle.getBundle( Constantes.DATOS );
        this.setTitle( this.rb.getString( Constantes.TITULO_PRINCIPAL ) );



        this.setSize( Constantes.ANCHO, Constantes.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }
}

package ec.edu.ups.vista;

import ec.edu.ups.Constantes;

import javax.swing.*;

public class AgendaContactosGUI extends JFrame {

    private JPanel panel;
    private JTextField buscarTxt;
    private JButton buscarBtn;
    private JButton agregarBtn;
    private JTable datosTbl;
    private JLabel buscarLbl;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.setSize( Constantes.ANCHO, Constantes.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }

    public AgendaContactosGUI() {
        setContentPane( this.panel );
        createUIComponents();
    }
}

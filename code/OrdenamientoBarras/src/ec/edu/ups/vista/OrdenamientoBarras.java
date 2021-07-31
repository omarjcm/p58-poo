package ec.edu.ups.vista;

import ec.edu.ups.Constante;
import ec.edu.ups.controlador.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class OrdenamientoBarras extends JFrame {

    private GestionarBarras barras;
    private ResourceBundle rb;

    private String lengualesLst[][] = {{"Español", "Inglés", "Francés", "Alemán"},
            {"Spanish", "English", "French", "German"},
            {"Espagnol", "Anglais", "Français", "Allemand"},
            {"Spanisch", "Englisch", "Französisch", "Deutsch"}};

    private JButton reiniciarBtn;
    private JButton ordernarBtn;
    private JButton pausarBtn;
    private JComboBox lenguajesCmbbx;

    public OrdenamientoBarras() {
        super();

        this.rb = ResourceBundle.getBundle( Constante.RECURSO );
        this.setTitle( this.rb.getString( Constante.VENTANA_TITULO ) );

        GridBagLayout gb = new GridBagLayout();
        this.setLayout( gb );

        GridBagConstraints cons = new GridBagConstraints();

        this.reiniciarBtn = new JButton( this.rb.getString( Constante.VENTANA_BTN_INICIAR ) );
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( reiniciarBtn, cons );

        this.ordernarBtn = new JButton( this.rb.getString( Constante.VENTANA_BTN_ORDENAR ) );
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( ordernarBtn, cons );

        this.pausarBtn = new JButton( this.rb.getString( Constante.VENTANA_BTN_PAUSAR ) );
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( pausarBtn, cons );

        this.lenguajesCmbbx = new JComboBox( lengualesLst[0] );
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

        ActionListener lenguajeLstnr = new LenguajesListener( this );
        lenguajesCmbbx.addActionListener( lenguajeLstnr );

        this.setSize( Constante.ANCHO,Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }

    public GestionarBarras getBarras() {
        return barras;
    }

    public void setBarras(GestionarBarras barras) {
        this.barras = barras;
    }

    public ResourceBundle getRb() {
        return rb;
    }

    public void setRb(ResourceBundle rb) {
        this.rb = rb;
    }

    public JButton getReiniciarBtn() {
        return reiniciarBtn;
    }

    public void setReiniciarBtn(JButton reiniciarBtn) {
        this.reiniciarBtn = reiniciarBtn;
    }

    public JButton getOrdernarBtn() {
        return ordernarBtn;
    }

    public void setOrdernarBtn(JButton ordernarBtn) {
        this.ordernarBtn = ordernarBtn;
    }

    public JButton getPausarBtn() {
        return pausarBtn;
    }

    public void setPausarBtn(JButton pausarBtn) {
        this.pausarBtn = pausarBtn;
    }

    public JComboBox getLenguajesCmbbx() {
        return lenguajesCmbbx;
    }

    public void setLenguajesCmbbx(JComboBox lenguajesCmbbx) {
        this.lenguajesCmbbx = lenguajesCmbbx;
    }

    public String[][] getLengualesLst() {
        return lengualesLst;
    }

    public void setLengualesLst(String[][] lengualesLst) {
        this.lengualesLst = lengualesLst;
    }
}

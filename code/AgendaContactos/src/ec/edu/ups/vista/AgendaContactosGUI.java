package ec.edu.ups.vista;

import ec.edu.ups.Constantes;
import ec.edu.ups.controlador.GestionarListener;

import javax.swing.*;
import java.util.ResourceBundle;

public class AgendaContactosGUI extends JFrame {

    private ResourceBundle rb;

    public AgendaContactosGUI() {
        super();

        this.rb = ResourceBundle.getBundle( Constantes.DATOS );
        this.setTitle( this.rb.getString( Constantes.TITULO_PRINCIPAL ) );

        JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu( this.rb.getString( Constantes.SUBTITULO_PRINCIPAL ) );

        var iconoNuevo = new ImageIcon("images/agregar-icono.png");
        var iconoModificar = new ImageIcon("images/editar-icono.png");
        JMenuItem item1 = new JMenuItem( this.rb.getString( Constantes.OPCION_C ), iconoNuevo );
        item1.setActionCommand( Constantes.OPCION_C );
        item1.addActionListener( new GestionarListener(this, item1) );
        JMenuItem item2 = new JMenuItem( this.rb.getString( Constantes.OPCION_U ), iconoModificar );
        item2.setActionCommand( Constantes.OPCION_U );
        item2.addActionListener( new GestionarListener(this, item2) );
        JMenuItem item3 = new JMenuItem( this.rb.getString( Constantes.OPCION_D ) );
        item3.setActionCommand( Constantes.OPCION_D );
        item3.addActionListener( new GestionarListener(this, item3) );
        JMenuItem item4 = new JMenuItem( this.rb.getString( Constantes.OPCION_R ) );
        item4.setActionCommand( Constantes.OPCION_R );
        item4.addActionListener( new GestionarListener(this, item4) );
        JMenuItem item5 = new JMenuItem( this.rb.getString( Constantes.OPCION_G ) );
        item5.setActionCommand( Constantes.OPCION_G );
        item5.addActionListener( new GestionarListener(this, item5) );
        JMenuItem item6 = new JMenuItem( this.rb.getString( Constantes.OPCION_S ) );
        item6.setActionCommand( Constantes.OPCION_S );
        item6.addActionListener( new GestionarListener(this, item6) );
        menu1.add( item1 );
        menu1.add( item2 );
        menu1.add( item3 );
        menu1.add( item4 );
        menu1.add( item5 );
        menu1.addSeparator();
        menu1.add( item6 );
        mb.add( menu1 );

        JMenu menu2 = new JMenu(this.rb.getString( Constantes.OPCION_ID ));
        JMenuItem item21 = new JMenuItem(this.rb.getString( Constantes.OPCION_ES ));
        JMenuItem item22 = new JMenuItem(this.rb.getString( Constantes.OPCION_IN ));
        menu2.add(item21);
        item21.addActionListener( new GestionarListener(this, item21) );
        menu2.add(item22);
        item22.addActionListener( new GestionarListener(this, item22) );
        mb.add( menu2 );

        this.setJMenuBar(mb);

        this.setSize( Constantes.ANCHO, Constantes.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);

        this.setVisible( true );
        this.setResizable( false );
    }
}

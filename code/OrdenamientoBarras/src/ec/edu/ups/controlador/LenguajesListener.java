package ec.edu.ups.controlador;

import ec.edu.ups.Constante;
import ec.edu.ups.vista.OrdenamientoBarras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class LenguajesListener implements ActionListener {

    private OrdenamientoBarras frame;

    public LenguajesListener(OrdenamientoBarras frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int indiceLenguaje = this.frame.getLenguajesCmbbx().getSelectedIndex();
        // String lengualesLst[] = {"Español", "Inglés", "Francés", "Alemán"};
        switch (indiceLenguaje) {
            case 0:
                this.frame.setRb( ResourceBundle.getBundle( Constante.RECURSO ) );
                break;
            case 1:
                this.frame.setRb( ResourceBundle.getBundle( Constante.RECURSO, Locale.ENGLISH ) );
                break;
            case 2:
                this.frame.setRb( ResourceBundle.getBundle( Constante.RECURSO, Locale.FRENCH ) );
                break;
            case 3:
                this.frame.setRb( ResourceBundle.getBundle( Constante.RECURSO, Locale.GERMAN ) );
                break;
        }

        this.frame.setTitle( this.frame.getRb().getString( Constante.VENTANA_TITULO ) );
        this.frame.getReiniciarBtn().setText( this.frame.getRb().getString( Constante.VENTANA_BTN_INICIAR ) );
        this.frame.getOrdernarBtn().setText( this.frame.getRb().getString( Constante.VENTANA_BTN_ORDENAR ) );
        this.frame.getPausarBtn().setText( this.frame.getRb().getString( Constante.VENTANA_BTN_PAUSAR ) );

        this.frame.getLenguajesCmbbx().removeAllItems();
        String lista[] = this.frame.getLengualesLst()[indiceLenguaje];
        for (int i=0; i<lista.length; i++) {
            this.frame.getLenguajesCmbbx().insertItemAt(lista[i], this.frame.getLenguajesCmbbx().getItemCount());
        }
        this.frame.getLenguajesCmbbx().setSelectedIndex( indiceLenguaje );
    }
}

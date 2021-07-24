package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Barra;

import java.lang.*;
import java.util.ArrayList;

public class OrdenamientoBurbuja implements Runnable {

    private GestionarBarras barras;
    private Barra barra_01;
    private Barra barra_02;

    public OrdenamientoBurbuja(GestionarBarras barras) {
        this.barras = barras;
    }

    private void intercambiar(int j, int j_1) {
        Barra barra = new Barra(barra_02.getPosicionX(), barra_01.getPosicionY(), barra_01.getAncho(), barra_01.getAlto(), barra_01.getColor());
        this.barra_01 = new Barra(barra_01.getPosicionX(), barra_02.getPosicionY(), barra_02.getAncho(), barra_02.getAlto(), barra_02.getColor());
        this.barra_02 = new Barra(barra.getPosicionX(), barra.getPosicionY(), barra.getAncho(), barra.getAlto(), barra.getColor());
        this.barras.getBarras().set(j, this.barra_01);
        this.barras.getBarras().set(j+1, this.barra_02);
    }

    @Override
    public void run() {
        for (int i=this.barras.getBarras().size()-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                this.barra_01 = this.barras.getBarras().get(j);
                this.barra_02 = this.barras.getBarras().get(j + 1);
                if (barra_01.getAlto() > barra_02.getAlto()) {
                    intercambiar(j, j+1);
                    try {
                        Thread.sleep( 40 );
                        this.barras.repaint();
                    } catch(InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
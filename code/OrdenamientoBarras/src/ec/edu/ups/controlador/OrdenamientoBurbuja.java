package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Barra;

import javax.swing.*;
import java.util.ArrayList;

public class OrdenamientoBurbuja implements Ordenamiento {

    private ArrayList<Barra> barras;

    public OrdenamientoBurbuja(ArrayList<Barra> barras) {
        this.barras = barras;
    }

    @Override
    public void ordenar() {
        for (int i=this.barras.size()-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                Barra barra_01 = this.barras.get(j);
                Barra barra_02 = this.barras.get(j + 1);
                if (barra_01.getAlto() > barra_02.getAlto()) {
                    intercambiar(barra_01, barra_02);
                }
            }
        }
    }

    private void intercambiar(Barra barra_01, Barra barra_02) {
        Barra barra = new Barra(barra_01.getPosicionX(), barra_01.getPosicionY(),
                barra_01.getAncho(), barra_01.getAlto(), barra_01.getColor());
        barra_01 = new Barra(barra_02.getPosicionX(), barra_02.getPosicionY(),
                barra_02.getAncho(), barra_02.getAlto(), barra_02.getColor());
        barra_02 = new Barra(barra.getPosicionX(), barra.getPosicionY(),
                barra.getAncho(), barra.getAlto(), barra.getColor());
    }
}

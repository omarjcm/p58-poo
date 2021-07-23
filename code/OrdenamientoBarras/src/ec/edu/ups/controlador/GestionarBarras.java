package ec.edu.ups.controlador;

import ec.edu.ups.Constante;
import ec.edu.ups.modelo.Barra;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GestionarBarras extends JPanel {

    private ArrayList<Barra> barras;
    private Color[] colores;
    private int[] altoBarras;
    private int[] anchoBarras;

    public GestionarBarras() {
        super(true);
        this.barras = new ArrayList<Barra>();
    }

    private void generarColoresAleatorios() {
        this.colores = new Color[ Constante.NUM_BARRAS ];
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);

            this.colores[i] = new Color( r, g, b );
        }
    }

    private void generarAltoBarrasAleatorio() {
        this.altoBarras = new int[ Constante.NUM_BARRAS ];
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            this.altoBarras[i] = (int) (Math.random() * Constante.ALTO_BARRA + 10);
        }
    }

    private void cargarBarras(Graphics g) {
        generarColoresAleatorios();
        generarAltoBarrasAleatorio();

        this.barras = new ArrayList<Barra>();
        int desplazamiento = 0;
        int anchoBarra = Constante.ANCHO / Constante.NUM_BARRAS;
        for (int i=0; i<this.colores.length; i++) {
            this.barras.add( new Barra( desplazamiento, 100, anchoBarra, this.altoBarras[i], this.colores[i] ));
            desplazamiento += anchoBarra;
        }

        for (Barra barra : this.barras) {
            g.fillRect( barra.getPosicionX(), barra.getPosicionY(), barra.getAncho(), barra.getAlto() );
            g.setColor( barra.getColor() );
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground( Color.LIGHT_GRAY );

        cargarBarras(g);
    }
}

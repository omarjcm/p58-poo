package ups.modelo.dominio.universidad;

import java.util.*;

/**
 * 
 */
public class Docente extends Persona {

    /**
     * Default constructor
     */
    public Docente() {
    }

    /**
     * 
     */
    private List<Titulo> refTitulos;

    public List<Titulo> getRefTitulos() {
        return refTitulos;
    }

    public void setRefTitulos(List<Titulo> refTitulos) {
        this.refTitulos = refTitulos;
    }

    public void calificar() {
        System.out.println("Estoy calificando.");
    }

    public void calificar(String numVeces) {
        System.out.println("Estoy calificando " + numVeces + " veces.");
    }
}
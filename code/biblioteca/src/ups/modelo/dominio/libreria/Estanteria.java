package ups.modelo.dominio.libreria;

import java.util.*;

/**
 * 
 */
public class Estanteria {

    /**
     * Default constructor
     */
    public Estanteria() {
    }

    /**
     * 
     */
    private String ubicacion;

    /**
     * 
     */
    private List<CopiaLibro> refCopiaLibros;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<CopiaLibro> getRefCopiaLibros() {
        return refCopiaLibros;
    }

    public void setRefCopiaLibros(List<CopiaLibro> refCopiaLibros) {
        this.refCopiaLibros = refCopiaLibros;
    }
}
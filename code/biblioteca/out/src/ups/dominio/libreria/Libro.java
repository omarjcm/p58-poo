package ups.dominio.libreria;

import java.util.*;

/**
 * 
 */
public class Libro {

    /**
     * Default constructor
     */
    public Libro() {
    }

    /**
     * 
     */
    private String isbn;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private int anioPublicacion;

    /**
     * 
     */
    private List<CopiaLibro> refCopiaLibros;

    /**
     * 
     */
    private List<Editorial> refEditorial;

}
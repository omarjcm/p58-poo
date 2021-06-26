package ups.modelo.dominio.libreria;

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

    public Libro(int anioPublicacion, String isbn) {
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }

    public Libro(int anioPublicacion, int isbn) {
        this.anioPublicacion = anioPublicacion;
        this.isbn = String.valueOf(isbn);
    }

    public Libro(int anioPublicacion, String isbn, String titulo) {
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.titulo = titulo;
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
    private List<Autor> refAutores;

    /**
     * 
     */
    private List<Editorial> refEditorial;

    public List<Autor> getRefAutores() {
        return refAutores;
    }

    public void setRefAutores(List<Autor> refAutores) {
        this.refAutores = refAutores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public List<CopiaLibro> getRefCopiaLibros() {
        return refCopiaLibros;
    }

    public void setRefCopiaLibros(List<CopiaLibro> refCopiaLibros) {
        this.refCopiaLibros = refCopiaLibros;
    }

    public List<Editorial> getRefEditorial() {
        return refEditorial;
    }

    public void setRefEditorial(List<Editorial> refEditorial) {
        this.refEditorial = refEditorial;
    }

    public void imprimir(ArrayList<Libro> libros) {
        for (int i=0; i<libros.size(); i++) {
            Libro libro = libros.get(i);
            libro.imprimir();
        }
    }

    public void imprimir() {
        System.out.println( "ISBN: " + this.isbn );
        System.out.println( "Título: " + this.titulo );
        System.out.println( "Año Publicación: " + this.anioPublicacion );

        for (int i=0; i<this.refAutores.size(); i++) {
            Autor autor = this.refAutores.get(i);
            autor.imprimir();
        }

        for (int i=0; i<this.refEditorial.size(); i++) {
            Editorial editorial = this.refEditorial.get(i);
            editorial.imprimir();
        }

        for (int i=0; i<this.refCopiaLibros.size(); i++) {
            CopiaLibro copiaLibro = this.refCopiaLibros.get(i);
            copiaLibro.imprimir();
        }
    }
}
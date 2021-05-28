package ups.modelo.libreria;

/**
 * 
 */
public class Pais {

    /**
     * Default constructor
     */
    public Pais() {
    }

    /**
     * 
     */
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("País: " + this.nombre);
    }
}
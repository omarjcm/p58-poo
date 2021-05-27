package ups.modelo.universidad;

/**
 * 
 */
public class Titulo {

    /**
     * Default constructor
     */
    public Titulo() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String tipoTitulo;

    /**
     * 
     */
    private String universidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(String tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
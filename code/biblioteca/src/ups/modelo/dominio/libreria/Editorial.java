package ups.modelo.dominio.libreria;

/**
 * 
 */
public class Editorial {

    /**
     * Default constructor
     */
    public Editorial() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String domicilio;

    /**
     * 
     */
    private Ciudad refCiudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Ciudad getRefCiudad() {
        return refCiudad;
    }

    public void setRefCiudad(Ciudad refCiudad) {
        this.refCiudad = refCiudad;
    }

    public void imprimir() {
        System.out.println("Editorial: " + this.nombre);
        System.out.println("Domicilio: " + this.domicilio);
        this.refCiudad.imprimir();
    }
}
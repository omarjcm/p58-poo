package ups.modelo.dominio.libreria;

/**
 * 
 */
public class Autor {

    /**
     * Default constructor
     */
    public Autor() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private Boolean esPrincipal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public void imprimir() {
        if (this.esPrincipal) {
            System.out.println("----------> Autor principal");
        } else {
            System.out.println("----------> Autor");
        }
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
}
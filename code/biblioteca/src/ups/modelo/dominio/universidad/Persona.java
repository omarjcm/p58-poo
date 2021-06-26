package ups.modelo.dominio.universidad;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    protected String cedula;

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String apellido;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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

    public void imprimir() {
        System.out.println( "Cédula: " + this.cedula );
        System.out.println( "Nombre: " + this.nombre );
        System.out.println( "Apellido: " + this.apellido );
    }
}
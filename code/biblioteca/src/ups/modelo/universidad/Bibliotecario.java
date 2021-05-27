package ups.modelo.universidad;

/**
 * 
 */
public class Bibliotecario extends Persona {

    /**
     * Default constructor
     */
    public Bibliotecario() {
    }

    /**
     * 
     */
    private String usuario;

    /**
     * 
     */
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean existeUsuario() {
        if (this.usuario.compareTo("gpizarro") == 0 && this.clave.compareTo("123") == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Clave: " + this.clave);
    }
}
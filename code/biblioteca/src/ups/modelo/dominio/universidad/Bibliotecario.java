package ups.modelo.dominio.universidad;

import java.util.ArrayList;

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

    public void imprimir() {
        System.out.println("**********************************");
        super.imprimir();
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Clave: " + this.clave);
        System.out.println("**********************************");
        System.out.println();
    }
}
package dominio;

import java.io.Serializable;

public class Contacto implements Serializable {

    private String telefono;
    private String nombres;

    public Contacto() {
    }

    public Contacto(Contacto contacto) {
        this.telefono = contacto.getTelefono();
        this.nombres = contacto.getNombres();
    }

    public Contacto(String telefono, String nombres) {
        this.telefono = telefono;
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void imprimirContacto( ) {
        System.out.println("----------------------------");
        System.out.println("Teléfono: " + this.getTelefono());
        System.out.println("Nombre(s) y Apellido(s): " + this.getNombres());
        System.out.println("----------------------------");
    }
}

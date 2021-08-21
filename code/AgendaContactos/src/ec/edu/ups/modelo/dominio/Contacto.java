package ec.edu.ups.modelo.dominio;

import ec.edu.ups.Constantes;

import java.util.ArrayList;

public class Contacto {

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

    public static void imprimirContacto( Contacto contacto ) {
        System.out.println(Constantes.TEXT_GREEN + "----------------------------");
        System.out.println("Teléfono: " + contacto.getTelefono());
        System.out.println("Nombre(s) y Apellido(s): " + contacto.getNombres());
        System.out.println("----------------------------" + Constantes.TEXT_RESET);
    }

    public static void imprimirContactos(ArrayList<Contacto> contactos) {
        for (int i=0; i<contactos.size(); i++) {
            System.out.println("----------------------------");
            System.out.println("Contacto No. " + (i+1));
            Contacto.imprimirContacto( contactos.get(i) );
        }
    }
}

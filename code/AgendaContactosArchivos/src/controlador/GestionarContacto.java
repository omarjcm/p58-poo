package controlador;

import dominio.ArchivoBinario;
import dominio.Contacto;
import informacion.Constantes;

import java.util.ArrayList;

public class GestionarContacto {

    private ArrayList<Contacto> contactos;
    private ArchivoBinario fichero;

    public GestionarContacto() {
        this.fichero = new ArchivoBinario( Constantes.ARCHIVO_NOMBRE );
        this.contactos = new ArrayList<Contacto>();
    }

    public Boolean registrarContacto(Contacto contacto) {
        this.contactos.add( contacto );
        return this.fichero.escribirArchivo( this.contactos );
    }

    public Boolean modificarContacto(Contacto contacto) {
        this.contactos = this.fichero.leerArchivo();

        for (int i=0; i<this.contactos.size(); i++) {
            Contacto elemento = this.contactos.get(i);
            if (contacto.getNombres().compareTo(elemento.getNombres()) == 0) {
                elemento.setTelefono( contacto.getTelefono() );
            }
        }
        return this.fichero.escribirArchivo( this.contactos );
    }

    public Boolean eliminarContacto(Contacto contacto) {
        this.contactos = this.fichero.leerArchivo();

        for (int i=0; i<this.contactos.size(); i++) {
            Contacto elemento = this.contactos.get(i);
            if (contacto.getNombres().compareTo(elemento.getNombres()) == 0) {
                this.contactos.remove(i);
                break;
            }
        }
        return this.fichero.escribirArchivo( this.contactos );
    }

    public Contacto buscarContacto(String nombres) {
        this.contactos = this.fichero.leerArchivo();

        for (int i=0; i<this.contactos.size(); i++) {
            Contacto elemento = this.contactos.get(i);
            if (nombres.compareTo(elemento.getNombres()) == 0) {
                return elemento;
            }
        }
        return null;
    }

    public void listarContactos() {
        this.contactos = this.fichero.leerArchivo();

        for (int i=0; i<this.contactos.size(); i++) {
            Contacto contacto = this.contactos.get(i);
            contacto.imprimirContacto();
        }
    }
}
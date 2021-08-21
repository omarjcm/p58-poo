package ec.edu.ups.controlador;

import ec.edu.ups.modelo.dominio.Archivo;
import ec.edu.ups.modelo.dominio.Contacto;

import java.util.ArrayList;

public class GestionarContactos {

    private ArrayList<Contacto> contactos;

    public GestionarContactos() {
        this.contactos = new ArrayList<Contacto>();
    }

    public void registrarContacto(String telefono, String nombres) {
        Contacto contacto = new Contacto(telefono, nombres);

        // PASO 1: Extraigo a todos los contactos existentes en el archivo.
        Archivo archivo = new Archivo();
        this.contactos = archivo.lecturaArchivo();
        // PASO 2: Agrego el nuevo contacto a la lista
        this.contactos.add( contacto );
        // PASO 3: Registro los contactos al archivo (todos nuevamente).
        archivo.registrarArchivo(this.contactos);
    }

    public void modificarContacto(Contacto contacto) {
        // PASO 1: Extraigo a todos los contactos existentes en el archivo.
        Archivo archivo = new Archivo();
        this.contactos = archivo.lecturaArchivo();
        // PASO 2: Buscar el contacto a modificar
        for (Contacto objeto : this.contactos) {
            if (objeto.getNombres().compareTo(contacto.getNombres()) == 0) {
                objeto.setTelefono( contacto.getTelefono() );
                break;
            }
        }
        // PASO 3: Registro los contactos al archivo (todos nuevamente).
        archivo.registrarArchivo(this.contactos);
    }

    public void eliminarContacto(Contacto contacto) {
        // PASO 1: Extraigo a todos los contactos existentes en el archivo.
        Archivo archivo = new Archivo();
        this.contactos = archivo.lecturaArchivo();
        // PASO 2: Buscar el contacto a eliminar
        for (int i=0; i<this.contactos.size(); i++) {
            if (this.contactos.get(i).getNombres().compareTo(contacto.getNombres()) == 0) {
                this.contactos.remove(i);
                break;
            }
        }
        // PASO 3: Registro los contactos al archivo (todos nuevamente).
        archivo.registrarArchivo(this.contactos);
    }

    public Contacto buscarContacto(String nombres) {
        Contacto contacto = new Contacto();
        Archivo archivo = new Archivo();
        ArrayList<Contacto> contactos = archivo.lecturaArchivo();
        for (Contacto objeto : contactos) {
            if (objeto.getNombres().contains(nombres)) {
                return objeto;
            }
        }
        return null;
    }

    public void listarContactos() {
        Archivo archivo = new Archivo();
        Contacto.imprimirContactos( archivo.lecturaArchivo() );
    }
}

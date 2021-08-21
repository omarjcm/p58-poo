package ec.edu.ups.controlador;

import ec.edu.ups.modelo.bd.ContactoBD;
import ec.edu.ups.modelo.dominio.Contacto;

import java.util.ArrayList;

public class GestionarContactosBD {

    public GestionarContactosBD() {
    }

    public Contacto registrarContacto(Contacto contacto) {
        ContactoBD dato = new ContactoBD();
        return dato.registrar( contacto );
    }

    public Contacto modificarContacto(Contacto contacto) {
        ContactoBD dato = new ContactoBD();
        return dato.modificar(contacto);
    }
    public Contacto eliminarContacto(Contacto contacto) {
        ContactoBD dato = new ContactoBD();
        return dato.eliminar(contacto);
    }
    public ArrayList<Contacto> buscar(String nombres) {
        ContactoBD dato = new ContactoBD();

        Contacto objeto = new Contacto();
        objeto.setNombres( nombres );
        return dato.buscar( objeto );
    }

    public void buscarContacto(String nombres) {
        ContactoBD dato = new ContactoBD();

        Contacto objeto = new Contacto();
        objeto.setNombres( nombres );
        ArrayList<Contacto> contactos = dato.buscar( objeto );
        if (contactos != null) {
            Contacto.imprimirContactos( contactos );
        }
    }

    public void listarContactos() {
        ContactoBD dato = new ContactoBD();
        Contacto.imprimirContactos( dato.listar() );
    }
}

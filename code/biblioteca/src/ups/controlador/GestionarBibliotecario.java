package ups.controlador;

import ups.modelo.bd.universidad.BibliotecarioBD;
import ups.modelo.dominio.universidad.Bibliotecario;

import java.util.ArrayList;

public class GestionarBibliotecario implements Gestionar {

    private ArrayList<Bibliotecario> bibliotecarios;

    public GestionarBibliotecario() {
        this.bibliotecarios = new ArrayList<Bibliotecario>();
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    @Override
    public void registrar(Object objeto) {
        BibliotecarioBD gestionar = new BibliotecarioBD();
        Bibliotecario bibliotecario = (Bibliotecario) gestionar.registrar( objeto );
        this.bibliotecarios.add( bibliotecario );
    }

    @Override
    public void modificar(Object objeto) {
        Bibliotecario obj = (Bibliotecario) objeto;
        for (int i=0; i<this.bibliotecarios.size(); i++) {
            Bibliotecario bibliotecario = this.bibliotecarios.get(i);
            if (bibliotecario.getCedula().compareTo( obj.getCedula() ) == 0) {
                bibliotecario.setNombre( obj.getNombre() );
                bibliotecario.setApellido( obj.getApellido() );
                bibliotecario.setUsuario( obj.getUsuario() );
                bibliotecario.setClave( obj.getClave() );

                return;
            }
        }
    }

    @Override
    public void eliminar(String cedula) {
        for (int i=0; i<this.bibliotecarios.size(); i++) {
            Bibliotecario bibliotecario = this.bibliotecarios.get(i);
            if (bibliotecario.getCedula().compareTo( cedula ) == 0) {
                this.bibliotecarios.remove(i);
                return;
            }
        }
    }

    @Override
    public void listar() {
        BibliotecarioBD gestionar = new BibliotecarioBD();
        ArrayList<Object> objetos = gestionar.listar();

        for (int i=0; i<objetos.size(); i++) {
            Bibliotecario objeto = (Bibliotecario) objetos.get(i);
            objeto.imprimir();
        }
    }

    @Override
    public Object buscar(String cedula) {
        for (int i=0; i<this.bibliotecarios.size(); i++) {
            Bibliotecario bibliotecario = this.bibliotecarios.get(i);
            if (bibliotecario.getCedula().compareTo( cedula ) == 0) {
                return this.bibliotecarios.get(i);
            }
        }
        return null;
    }
}
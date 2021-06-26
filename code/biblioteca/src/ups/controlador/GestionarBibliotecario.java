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
        BibliotecarioBD gestionar = new BibliotecarioBD();
        Bibliotecario bibliotecario = (Bibliotecario) gestionar.modificar( objeto );
    }

    @Override
    public void eliminar(String cedula) {
        BibliotecarioBD gestionar = new BibliotecarioBD();

        Bibliotecario objeto = new Bibliotecario();
        objeto.setCedula( cedula );
        Bibliotecario bibliotecario = (Bibliotecario) gestionar.eliminar(
                gestionar.buscar( objeto )
        );
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
        BibliotecarioBD gestionar = new BibliotecarioBD();

        Bibliotecario objeto = new Bibliotecario();
        objeto.setCedula( cedula );
        objeto = (Bibliotecario) gestionar.buscar( objeto );
        if (objeto != null) {
            objeto.imprimir();
            return objeto;
        } else {
            return null;
        }
    }
}
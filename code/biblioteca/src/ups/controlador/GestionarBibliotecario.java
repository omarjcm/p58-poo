package ups.controlador;

import ups.modelo.universidad.Bibliotecario;

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
        this.bibliotecarios.add((Bibliotecario) objeto);
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
    public void eliminar() {

    }

    @Override
    public void listar() {

    }
}
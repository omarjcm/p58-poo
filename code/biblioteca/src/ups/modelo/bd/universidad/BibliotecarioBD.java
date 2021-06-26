package ups.modelo.bd.universidad;

import ups.datos.BaseDatos;
import ups.modelo.bd.BD;
import ups.modelo.dominio.universidad.Bibliotecario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BibliotecarioBD extends Bibliotecario implements BD {

    @Override
    public void registrar(Object objeto) {

    }

    @Override
    public void modificar(Object objeto) {

    }

    @Override
    public void eliminar(Object objeto) {

    }

    @Override
    public Object buscar(Object objeto) {
        return null;
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> bibliotecarios = new ArrayList<Object>();

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();
            String sql = "SELECT cedula, nombres, apellidos, usuario, clave FROM bibliotecario;";
            ResultSet rs = bd.ejecutarConsulta( sql );
            while(rs.next()) {
                Bibliotecario objeto = new BibliotecarioBD();

                objeto.setCedula( rs.getString(1) );
                objeto.setNombre( rs.getString(2) );
                objeto.setApellido( rs.getString(3) );
                objeto.setUsuario( rs.getString(4) );
                objeto.setClave( rs.getString(5) );

                bibliotecarios.add( objeto );
            }
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
        return bibliotecarios;
    }
}

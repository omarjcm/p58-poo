package ups.modelo.bd.universidad;

import ups.datos.BaseDatos;
import ups.modelo.bd.BD;
import ups.modelo.dominio.universidad.Bibliotecario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BibliotecarioBD extends Bibliotecario implements BD {

    public boolean existeUsuario(String usuario, String clave) {
        BibliotecarioBD gestionar = new BibliotecarioBD();
        Bibliotecario objeto = new Bibliotecario();
        objeto.setUsuario( usuario );
        objeto.setClave( clave );

        objeto = (Bibliotecario) gestionar.buscar( objeto );
        if (objeto != null) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public Object registrar(Object objeto) {
        Bibliotecario bibliotecario = (Bibliotecario) objeto;

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "INSERT INTO bibliotecario VALUES(?, ?, ?, ?, ?);";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, bibliotecario.getCedula() );
            bd.getPs().setString(2, bibliotecario.getNombre() );
            bd.getPs().setString(3, bibliotecario.getApellido() );
            bd.getPs().setString(4, bibliotecario.getUsuario() );
            bd.getPs().setString(5, bibliotecario.getClave() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            objeto = null;
        }

        return objeto;
    }

    @Override
    public Object modificar(Object objeto) {
        Bibliotecario bibliotecario = (Bibliotecario) objeto;

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "UPDATE bibliotecario " +
                            "SET nombres=?, apellidos=?, usuario=?, clave=? " +
                            "WHERE cedula=?;";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, bibliotecario.getNombre() );
            bd.getPs().setString(2, bibliotecario.getApellido() );
            bd.getPs().setString(3, bibliotecario.getUsuario() );
            bd.getPs().setString(4, bibliotecario.getClave() );
            bd.getPs().setString(5, bibliotecario.getCedula() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            objeto = null;
        }

        return objeto;
    }

    @Override
    public Object eliminar(Object objeto) {
        Bibliotecario bibliotecario = (Bibliotecario) objeto;

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "DELETE  FROM bibliotecario WHERE cedula=?;";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, bibliotecario.getCedula() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            objeto = null;
        }

        return objeto;

    }

    @Override
    public Object buscar(Object objeto) {
        Bibliotecario bibliotecario = (Bibliotecario) objeto;
        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();
            String sql = "SELECT cedula, nombres, apellidos, usuario, clave " +
                    "FROM bibliotecario " +
                    "WHERE cedula=? OR (usuario=? AND clave=?);";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, bibliotecario.getCedula() );
            bd.getPs().setString(2, bibliotecario.getUsuario() );
            bd.getPs().setString(3, bibliotecario.getClave() );

            ResultSet rs = bd.getPs().executeQuery();
            while(rs.next()) {
                bibliotecario.setCedula( rs.getString(1) );
                bibliotecario.setNombre( rs.getString(2) );
                bibliotecario.setApellido( rs.getString(3) );
                bibliotecario.setUsuario( rs.getString(4) );
                bibliotecario.setClave( rs.getString(5) );

                return bibliotecario;
            }
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
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
                Bibliotecario objeto = new Bibliotecario();

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

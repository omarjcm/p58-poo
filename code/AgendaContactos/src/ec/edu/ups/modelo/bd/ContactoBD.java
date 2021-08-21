package ec.edu.ups.modelo.bd;

import ec.edu.ups.datos.BaseDatos;
import ec.edu.ups.modelo.dominio.Contacto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactoBD extends Contacto {

    public Contacto registrar(Contacto contacto) {
        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "INSERT INTO contacto VALUES(?, ?);";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, contacto.getTelefono() );
            bd.getPs().setString(2, contacto.getNombres() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            contacto = null;
        }

        return contacto;
    }

    public Contacto eliminar(Contacto contacto) {
        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "DELETE FROM contacto WHERE nombres=?;";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, contacto.getNombres() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            contacto = null;
        }

        return contacto;
    }

    public Contacto modificar(Contacto contacto) {
        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();

            String sql = "UPDATE contacto " +
                    "SET telefono=? " +
                    "WHERE nombres=?;";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, contacto.getTelefono() );
            bd.getPs().setString(2, contacto.getNombres() );

            bd.getPs().execute();
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            contacto = null;
        }

        return contacto;
    }

    public ArrayList<Contacto> buscar(Contacto contacto) {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();
            String sql = "SELECT telefono, nombres " +
                    "FROM contacto " +
                    "WHERE nombres LIKE CONCAT( '%',?,'%');";

            bd.setPs( bd.getConexion().prepareStatement( sql ) );
            bd.getPs().setString(1, contacto.getNombres() );

            ResultSet rs = bd.getPs().executeQuery();
            while(rs.next()) {
                Contacto objeto = new Contacto();
                objeto.setTelefono( rs.getString(1) );
                objeto.setNombres( rs.getString(2) );

                contactos.add( objeto );
            }
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
            contactos = null;
        }
        return contactos;
    }

    public ArrayList<Contacto> listar() {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();
            String sql = "SELECT telefono, nombres FROM contacto;";
            ResultSet rs = bd.ejecutarConsulta( sql );
            while(rs.next()) {
                Contacto objeto = new Contacto();

                objeto.setTelefono( rs.getString(1) );
                objeto.setNombres( rs.getString(2) );

                contactos.add( objeto );
            }
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
        return contactos;
    }
}

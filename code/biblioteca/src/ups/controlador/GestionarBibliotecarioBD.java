package ups.controlador;

import ups.datos.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarBibliotecarioBD implements Gestionar {
    @Override
    public void registrar(Object objeto) {

    }

    @Override
    public void modificar(Object objeto) {

    }

    @Override
    public void eliminar(String cedula) {

    }

    @Override
    public Object buscar(String cedula) {
        return null;
    }

    @Override
    public void listar() {
        try {
            BaseDatos bd = new BaseDatos();
            bd.conectar();
            String sql = "SELECT * FROM bibliotecario;";
            ResultSet rs = bd.ejecutarConsulta( sql );
            while(rs.next()) {
                int numColumnas = rs.getMetaData().getColumnCount();
                for (int i=1; i<numColumnas; i++) {
                    if (rs.getObject(i) != null) {
                        System.out.println( rs.getMetaData().getColumnLabel(i) );
                        System.out.println( rs.getObject(i) );
                    }
                }
            }
            bd.cerrar();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }

    }
}
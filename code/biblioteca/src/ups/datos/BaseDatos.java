package ups.datos;

import ups.informacion.Valores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
    public void conectar() {
        try {
            try {
                Class.forName( Valores.DRIVER_POSTGRESQL );
            } catch (ClassNotFoundException ex) {
                System.out.println("[Error]: Error al registrar el driver de PostgreSQL.");
            }
            Connection conexion = null;
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca", "postgres", "inexcelsisdeo");

            boolean valid = conexion.isValid(5000);
            System.out.println( valid ? "TEST OK" : "TEST FAIL" );
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        BaseDatos conexion = new BaseDatos();
        conexion.conectar();
    }
}

package ups.datos;

import java.sql.*;

public class BaseDatos {

    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public void conectar() {
        try {
            LeerArchivo archivo = new LeerArchivo();
            archivo.obtenerValores();
            Class.forName( archivo.getConexion().getDriverClass() );
            this.conexion = DriverManager.getConnection(
                    archivo.obtenerUrlConexion(),
                    archivo.getConexion().getUsuario(),
                    archivo.getConexion().getClave());

            System.out.println("TEST OK");
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("[Error]: Error al registrar el driver de PostgreSQL.");
        }
    }

    public ResultSet ejecutarConsulta(String sql) {
        try {
            this.ps = this.conexion.prepareStatement( sql );
            this.rs = this.ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
        return this.rs;
    }

    public void cerrar() {
        try {
            if (this.ps != null) {
                this.ps.close();
            }
            this.conexion.close();
        } catch (SQLException ex) {
            System.out.println("[Error]: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        BaseDatos conexion = new BaseDatos();
        conexion.conectar();
        conexion.cerrar();
    }
}

package ups.datos;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class LeerArchivo {

    private String nombreArchivo;
    private InputStream inputStream;
    private Conexion conexion;

    public LeerArchivo() {
        this.nombreArchivo = "db.properties";
        this.conexion = new Conexion();
    }

    public void obtenerValores() {
        try {
            Properties prop = new Properties();
            this.inputStream = getClass().getClassLoader().getResourceAsStream( this.nombreArchivo );
            if (this.inputStream != null) {
                prop.load( this.inputStream );
            }

            this.conexion.setDriver( prop.getProperty("db.driver") );
            this.conexion.setHost( prop.getProperty("db.host") );
            this.conexion.setPuerto( prop.getProperty("db.puerto") );
            this.conexion.setUsuario( prop.getProperty("db.usuario") );
            this.conexion.setClave( prop.getProperty("db.clave") );
            this.conexion.setDbname( prop.getProperty("db.dbname") );
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no fue encontrado.");
        } catch(Exception ex) {
            System.out.println("[error] - " + ex.getMessage());
        }
    }

    public String obtenerUrlConexion() {
        return this.conexion.getDriver() + "://" +
                this.conexion.getHost() + ":" + this.conexion.getPuerto() + "/" + this.conexion.getDbname();
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public static void main(String[] args) {
        LeerArchivo obj = new LeerArchivo();
        obj.obtenerValores();
        System.out.println( obj.getConexion().getDriver() );
        System.out.println( obj.getConexion().getUsuario() );
        System.out.println( obj.getConexion().getClave() );
        System.out.println( obj.getConexion().getHost() );
    }
}

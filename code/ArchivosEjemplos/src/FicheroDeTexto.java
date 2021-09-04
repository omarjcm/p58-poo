import java.io.FileWriter;
import java.io.PrintWriter;

public class FicheroDeTexto {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            // Creación del iniciador
            FileWriter file = new FileWriter("ficheroTexto.txt", true);
            // Creación del filtro
            output = new PrintWriter( file );
            output.println("¡Hola mundo!");
            output.println("Curso de Programación Orientada a Objetos");
            output.println("Universidad Politécnica Salesiana");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}

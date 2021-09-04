import java.io.FileWriter;
import java.io.PrintWriter;

public class FicheroDeTextoConFormato {
    public static void main(String[] args) {
        String nombres[] = {"Guillermo Pizarro", "Diego Mero", "Jorge Macías"};

        PrintWriter output = null;
        try {
            // Creación del iniciador
            FileWriter file = new FileWriter("ficheroTextoFormato.txt");
            // Creación del filtro
            output = new PrintWriter( file );
            for (String nombre: nombres) {
                output.printf("%-25s %d%n", nombre, 10);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}

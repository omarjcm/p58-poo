import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class FicheroLecturaConFormato {
    public static void main(String[] args) {
        Scanner lector = null;
        try {
            FileReader fichero = new FileReader("ficheroLectura.txt");
            lector = new Scanner( fichero );
            lector.useLocale(Locale.ENGLISH);
            while (lector.hasNext()) {
                String palabra = lector.next();
                System.out.println(palabra);
                while (lector.hasNextDouble()) {
                    double numero = lector.nextDouble();
                    System.out.println("Número: " + numero);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            } else {
                System.out.println("Finalización del programa.");
            }
        }
    }
}

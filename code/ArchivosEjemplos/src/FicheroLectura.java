import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class FicheroLectura {
    public static void main(String[] args) {
        Scanner lector = null;
        try {
            FileReader fichero = new FileReader("ficheroLectura.txt");
            lector = new Scanner( fichero );
            lector.useLocale(Locale.ENGLISH);
            while (lector.hasNextLine()) {
                String palabra = lector.nextLine();
                System.out.println(palabra);
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LecturaEscrituraArchivo {
    public static void main(String[] args) {
        File archivo = new File("programacion_oo2.txt");
        if (archivo.exists()) {
            try {
                Scanner lectura = new Scanner(archivo);
                System.out.println(lectura.nextLine());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                PrintStream archivo_nuevo = new PrintStream( new File("programacion_oo3.txt") );
                archivo_nuevo.println("Hola mundo nuevo.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

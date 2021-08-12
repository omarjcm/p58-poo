import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        File archivo = new File("programacion_oo.txt");
        if (archivo.exists()) {
            try {
                Scanner lectura = new Scanner(archivo);
                System.out.println(lectura.nextLine());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

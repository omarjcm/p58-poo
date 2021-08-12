import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        File archivo = new File("agenda.txt");
        try {
            Scanner lectura_archivo = new Scanner(archivo);
            while(lectura_archivo.hasNext()) {
                String[] agenda = lectura_archivo.nextLine().split("\\$");
                for (String contacto : agenda) {
                    System.out.print( contacto + " " );
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

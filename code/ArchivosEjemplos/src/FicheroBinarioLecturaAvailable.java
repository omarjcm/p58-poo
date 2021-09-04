import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FicheroBinarioLecturaAvailable {
    public static void main(String[] args) throws IOException {
        ObjectInputStream lector = null;
        try {
            FileInputStream fichero = new FileInputStream("fichero.dat");
            lector = new ObjectInputStream( fichero );
            while (lector.available() > 0) {
                System.out.println( lector.readInt() );
            }
        } catch(FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            }
        }
    }
}

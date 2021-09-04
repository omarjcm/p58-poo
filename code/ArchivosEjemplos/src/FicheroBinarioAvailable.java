import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicheroBinarioAvailable {
    public static void main(String[] args) {
        ObjectOutputStream salida = null;
        try {
            FileOutputStream fichero = new FileOutputStream("fichero2.dat");
            salida = new ObjectOutputStream( fichero );
            salida.writeInt(100);
            salida.writeInt(200);
            salida.writeInt(300);
            salida.writeInt(400);
            salida.writeInt(500);
            salida.writeInt(600);
        } catch(FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (salida != null) {
            try {
                salida.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

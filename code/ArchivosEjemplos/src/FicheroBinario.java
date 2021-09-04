import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.System.*;

public class FicheroBinario {
    public static void main(String[] args) {
        ObjectOutputStream salida = null;
        try {
            FileOutputStream fichero = new FileOutputStream("fichero1.dat");
            salida = new ObjectOutputStream( fichero );
            salida.writeInt(100);
            salida.writeBoolean( true );
            salida.writeDouble( 2.2 );
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

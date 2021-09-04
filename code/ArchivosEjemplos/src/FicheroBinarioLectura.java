import java.io.*;

public class FicheroBinarioLectura {
    public static void main(String[] args) throws IOException {
        ObjectInputStream lector = null;
        try {
            FileInputStream fichero = new FileInputStream("fichero.dat");
            lector = new ObjectInputStream( fichero );
            System.out.println(lector.readInt());
            System.out.println(lector.readBoolean());
            System.out.println(lector.readDouble());
        } catch(FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            }
        }
    }
}

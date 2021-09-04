package dominio;

import java.io.*;
import java.util.ArrayList;

public class ArchivoBinario {
    private String nombreArchivo;

    public ArchivoBinario(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Boolean escribirArchivo(ArrayList<Contacto> contactos) {
        ObjectOutputStream filtro = null;

        try {
            FileOutputStream fichero = new FileOutputStream( this.nombreArchivo );
            filtro = new ObjectOutputStream( fichero );
            filtro.writeObject( contactos );
            return Boolean.TRUE;
        } catch (IOException ex) {
            System.out.println( ex.getMessage() );
        }

        if (filtro != null) {
            try {
                filtro.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Boolean.FALSE;
    }

    public ArrayList<Contacto> leerArchivo() {
        ObjectInputStream filtro = null;

        try {
            FileInputStream fichero = new FileInputStream( this.nombreArchivo );
            filtro = new ObjectInputStream( fichero );
            return (ArrayList) filtro.readObject();
        } catch (IOException ex) {
            System.out.println( ex.getMessage() );
        } catch (ClassNotFoundException ex) {
            System.out.println( ex.getMessage() );
        }

        if (filtro != null) {
            try {
                filtro.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}

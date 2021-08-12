package ec.edu.ups.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

    private String nombreArchivo;

    public Archivo() {
        this.nombreArchivo = "agenda.txt";
    }

    public void registrarArchivo(ArrayList<Contacto> contactos) {
        File archivo = new File(this.nombreArchivo);
        try {
            PrintStream archivoEscribir = new PrintStream(archivo);
            for (Contacto contacto: contactos) {
                archivoEscribir.println(contacto.getTelefono()+"$"+contacto.getNombres());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Contacto> lecturaArchivo() {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        File archivo = new File(this.nombreArchivo);
        try {
            Scanner archivoLectura = new Scanner(archivo);
            while(archivoLectura.hasNext()) {
                String registro = archivoLectura.nextLine();
                String[] datos = registro.split("\\$");
                Contacto objeto = new Contacto(datos[0], datos[1]);
                contactos.add( objeto );
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return contactos;
    }
}

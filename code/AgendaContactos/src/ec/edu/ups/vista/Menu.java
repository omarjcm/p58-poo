package ec.edu.ups.vista;

import ec.edu.ups.controlador.GestionarContactos;
import ec.edu.ups.modelo.Archivo;
import ec.edu.ups.modelo.Contacto;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Menu {
    private int opcion;
    private Scanner consola;
    private GestionarContactos contactos;

    public Menu(int opcion) {
        this.opcion = opcion;
        this.consola = new Scanner(System.in);
        this.contactos = new GestionarContactos();
    }

    public void seleccionarOpcion() {
        String nombres = "";
        String numTelefono = "";
        Contacto contacto = null;

        switch (this.opcion) {
            case 1:
                MenuPrincipal.subTitulo("REGISTRAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                System.out.print("Teléfono: ");
                numTelefono = this.consola.nextLine();
                this.contactos.registrarContacto(numTelefono, nombres);
                break;
            case 2:
                MenuPrincipal.subTitulo("MODIFICAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                contacto = this.contactos.buscarContacto( nombres );
                if (contacto != null) {
                    System.out.print("Teléfono: ");
                    numTelefono = this.consola.nextLine();
                    contacto.setTelefono( numTelefono );
                    this.contactos.modificarContacto( contacto );
                    System.out.println("----------------------------------");
                    System.out.println("Modificación exitosa.");
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("No existe el contacto a modificar.");
                    System.out.println("----------------------------------");
                }
                break;
            case 3:
                MenuPrincipal.subTitulo("ELIMINAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                contacto = this.contactos.buscarContacto( nombres );
                if (contacto != null) {
                    this.contactos.eliminarContacto( contacto );
                    System.out.println("----------------------------------");
                    System.out.println("Eliminación exitosa.");
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("No existe el contacto a eliminar.");
                    System.out.println("----------------------------------");
                }
                break;
            case 4:
                MenuPrincipal.subTitulo("LISTAR");
                this.contactos.listarContactos();
                break;
            case 5:
                MenuPrincipal.subTitulo("BUSCAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                contacto = this.contactos.buscarContacto( nombres );
                if (contacto != null) {
                    Contacto.imprimirContacto( contacto );
                }
                break;
        }
    }
}

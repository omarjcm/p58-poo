package vista;

import controlador.GestionarContacto;
import dominio.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int opcion;
    private Scanner consola;
    private GestionarContacto contactos;

    public Menu(int opcion, GestionarContacto contactos) {
        this.opcion = opcion;
        this.consola = new Scanner(System.in);
        this.contactos = contactos;
    }

    public void seleccionarOpcion() {
        String nombres = "";
        String numTelefono = "";
        Contacto contacto = null;
        ArrayList<Contacto> objetos = null;

        switch (this.opcion) {
            case 1:
                MenuPrincipal.subTitulo("REGISTRAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                System.out.print("Teléfono: ");
                numTelefono = this.consola.nextLine();

                contacto = new Contacto(numTelefono, nombres);
                if (this.contactos.registrarContacto(contacto)) {
                    System.out.println("----------------------------------");
                    System.out.println("Registro exitoso.");
                    System.out.println("----------------------------------");
                }
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
                    if (this.contactos.modificarContacto( contacto )) {
                        System.out.println("----------------------------------");
                        System.out.println("Modificación exitosa.");
                        System.out.println("----------------------------------");
                    }
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("No existe el contacto a modificar o existen varios contactos con el mismo nombre.");
                    System.out.println("----------------------------------");
                }
                break;
            case 3:
                MenuPrincipal.subTitulo("ELIMINAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                contacto = this.contactos.buscarContacto( nombres );
                if (contacto != null) {
                    if(this.contactos.eliminarContacto( contacto )) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminación exitosa.");
                        System.out.println("----------------------------------");
                    }
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("No existe el contacto a eliminar o existen varios contactos con el mismo nombre.");
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
                    contacto.imprimirContacto();
                } else {
                    System.out.println("El contacto no se encuentra.");
                }
                break;
        }
    }
}

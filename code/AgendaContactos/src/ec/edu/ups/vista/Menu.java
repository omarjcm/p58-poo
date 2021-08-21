package ec.edu.ups.vista;

import ec.edu.ups.controlador.GestionarContactosBD;
import ec.edu.ups.modelo.dominio.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int opcion;
    private Scanner consola;
    private GestionarContactosBD contactos;

    public Menu(int opcion) {
        this.opcion = opcion;
        this.consola = new Scanner(System.in);
        this.contactos = new GestionarContactosBD();
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
                if (this.contactos.registrarContacto(contacto) != null) {
                    System.out.println("----------------------------------");
                    System.out.println("Registro exitoso.");
                    System.out.println("----------------------------------");
                }
                break;
            case 2:
                MenuPrincipal.subTitulo("MODIFICAR");
                System.out.print("Nombres y Apellidos: ");
                nombres = this.consola.nextLine();
                objetos = this.contactos.buscar( nombres );
                if (objetos != null && objetos.size() == 1) {
                    contacto = new Contacto( objetos.get(0) );
                    System.out.print("Teléfono: ");
                    numTelefono = this.consola.nextLine();
                    contacto.setTelefono( numTelefono );
                    if (this.contactos.modificarContacto( contacto ) != null) {
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
                objetos = this.contactos.buscar( nombres );
                if (objetos != null && objetos.size() == 1) {
                    contacto = new Contacto( objetos.get(0) );
                    if (this.contactos.eliminarContacto( contacto ) != null) {
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
                this.contactos.buscarContacto( nombres );
                break;
        }
    }
}

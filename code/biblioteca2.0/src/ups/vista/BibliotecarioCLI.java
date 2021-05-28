package ups.vista;

import ups.controlador.GestionarBibliotecario;
import ups.modelo.universidad.Bibliotecario;

import java.util.Scanner;

public class BibliotecarioCLI {
    public void gestionar(GestionarBibliotecario objeto) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("************************************");
            System.out.println("GESTIONAR BIBLIOTECARIO");
            System.out.println("************************************");
            System.out.println("[1].- Registrar Bibliotecario.");
            System.out.println("[2].- Modificar Bibliotecario.");
            System.out.println("[3].- Eliminar Bibliotecario.");
            System.out.println("[4].- Buscar Bibliotecario.");
            System.out.println("[5].- Listar Bibliotecarios.");
            System.out.println("[6].- Salir.");
            System.out.println("************************************");
            System.out.print("Opción: ");
            opcion = consola.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    this.registrarBibliotecario(objeto);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    this.listarBibliotecarios(objeto);
                    break;
            }
        }
    }

    public void registrarBibliotecario(GestionarBibliotecario objeto) {
        Scanner consola = new Scanner(System.in);
        Bibliotecario bibliotecario = new Bibliotecario();

        System.out.println("************************************");
        System.out.println("REGISTRAR BIBLIOTECARIO");
        System.out.println("************************************");
        System.out.println("Cédula: ");
        bibliotecario.setCedula( consola.nextLine() );
        System.out.println("Nombre: ");
        bibliotecario.setNombre( consola.nextLine() );
        System.out.println("Apellido: ");
        bibliotecario.setApellido( consola.nextLine() );
        System.out.println("Usuario: ");
        bibliotecario.setUsuario( consola.nextLine() );
        System.out.println("Clave: ");
        bibliotecario.setClave( consola.nextLine() );

        objeto.registrar( bibliotecario );
    }

    public void listarBibliotecarios(GestionarBibliotecario objeto) {
        for (int i=0; i<objeto.getBibliotecarios().size(); i++) {
            Bibliotecario bibliotecario = objeto.getBibliotecarios().get(i);
            bibliotecario.imprimir();
        }
    }
}

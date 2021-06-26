package ups.vista;

import ups.controlador.GestionarBibliotecario;
import ups.informacion.Menu;
import ups.modelo.bd.universidad.BibliotecarioBD;
import ups.modelo.dominio.universidad.Bibliotecario;

import java.util.Scanner;

public class BibliotecarioCLI implements GestionarCLI {
    public void gestionar(GestionarBibliotecario objeto) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            Menu.menu_gestionar( "Bibliotecario" );
            opcion = consola.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    this.registrarCLI(objeto);
                    break;
                case 2:
                    this.modificarCLI(objeto);
                    break;
                case 3:
                    this.eliminarCLI(objeto);
                    break;
                case 4:
                    this.buscarCLI(objeto);
                    break;
                case 5:
                    this.listarCLI(objeto);
                    break;
            }
        }
    }

    @Override
    public void registrarCLI(Object objeto) {
        GestionarBibliotecario gestionar = (GestionarBibliotecario) objeto;

        Scanner consola = new Scanner(System.in);
        Bibliotecario bibliotecario = new Bibliotecario();

        Menu.cabecera("REGISTRAR BIBLIOTECARIO");
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

        gestionar.registrar( bibliotecario );
    }

    @Override
    public void modificarCLI(Object objeto) {
        GestionarBibliotecario gestionar = (GestionarBibliotecario) objeto;

        Scanner consola = new Scanner(System.in);

        Menu.cabecera("MODIFICAR BIBLIOTECARIO");
        System.out.println("Cédula: ");

        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario = (Bibliotecario) gestionar.buscar( consola.nextLine() );

        if (bibliotecario != null) {
            System.out.println("Nombre: " + bibliotecario.getNombre());
            System.out.println("Nombre: ");
            String cadena = consola.nextLine();
            if (cadena.compareTo("") != 0)
                bibliotecario.setNombre( cadena );
            System.out.println("Apellido: " + bibliotecario.getApellido());
            System.out.println("Apellido: ");
            cadena = consola.nextLine();
            if (cadena.compareTo("") != 0)
                bibliotecario.setApellido( cadena );
            System.out.println("Usuario: " + bibliotecario.getUsuario());
            System.out.println("Usuario: ");
            cadena = consola.nextLine();
            if (cadena.compareTo("") != 0)
                bibliotecario.setUsuario( cadena );
            System.out.println("Clave: " + bibliotecario.getClave());
            System.out.println("Clave: ");
            cadena = consola.nextLine();
            if (cadena.compareTo("") != 0)
                bibliotecario.setClave( cadena );

            gestionar.modificar( bibliotecario );
        } else {
            System.out.println("El usuario no existe.");
        }
    }

    @Override
    public void eliminarCLI(Object objeto) {
        GestionarBibliotecario gestionar = (GestionarBibliotecario) objeto;

        Scanner consola = new Scanner(System.in);
        Bibliotecario bibliotecario = new Bibliotecario();

        Menu.cabecera("ELIMINAR BIBLIOTECARIO");
        System.out.println("Cédula: ");
        bibliotecario = (Bibliotecario) gestionar.buscar( consola.nextLine() );

        if (bibliotecario != null) {
            System.out.println("¿Está seguro de eliminar al usuario [S o N]?");
            String respuesta = consola.nextLine();
            if (respuesta.compareTo("S") == 0)
                gestionar.eliminar( bibliotecario.getCedula() );
        } else {
            System.out.println("El usuario no existe.");
        }
    }

    @Override
    public void buscarCLI(Object objeto) {
        GestionarBibliotecario gestionar = (GestionarBibliotecario) objeto;

        Scanner consola = new Scanner(System.in);
        Bibliotecario bibliotecario = new Bibliotecario();

        Menu.cabecera("BUSCAR BIBLIOTECARIO");
        System.out.println("Cédula: ");
        bibliotecario = (Bibliotecario) gestionar.buscar( consola.nextLine() );
        bibliotecario.imprimir();
    }

    @Override
    public void listarCLI(Object objeto) {
        GestionarBibliotecario gestionar = (GestionarBibliotecario) objeto;
        Menu.cabecera("LISTAR BIBLIOTECARIOS");
        gestionar.listar();
    }
}

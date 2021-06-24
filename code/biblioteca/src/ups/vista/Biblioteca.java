package ups.vista;

import ups.controlador.GestionarBibliotecario;
import ups.controlador.GestionarBibliotecarioBD;
import ups.controlador.GestionarDocente;

import java.util.Scanner;

public class Biblioteca {


    public static void main(String[] args) {

        int intentos = 1;
        while (intentos <= 3) {
            System.out.println("************************************");
            System.out.println("SISTEMA DE INFORMACIÓN BIBLIOTECARIO");
            System.out.println("************************************");

            VerificarUsuarioCLI cli = new VerificarUsuarioCLI();
            if (cli.verificarUsuario()) {
                GestionarBibliotecarioBD bibliotecarios = new GestionarBibliotecarioBD();
                GestionarDocente docentes = new GestionarDocente();
                menuPrincipal(bibliotecarios, docentes);

                break;
            } else {
                System.out.println("Usuario y/o clave incorrecta.");
                intentos++;
            }
        }
    }

    public static void menuPrincipal(GestionarBibliotecarioBD bibliotecarios, GestionarDocente docentes) {
        Scanner consola = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("************************************");
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("************************************");
            System.out.println("[1].- Gestionar Bibliotecario.");
            System.out.println("[2].- Gestionar Docente.");
            System.out.println("[3].- Gestionar Estudiante.");
            System.out.println("[4].- Salir.");
            System.out.println("************************************");
            System.out.print("Opción: ");
            opcion = consola.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    BibliotecarioCLIBD objeto = new BibliotecarioCLIBD();
                    objeto.gestionar( bibliotecarios );
                    break;
                case 2:
                    DocenteCLI docente = new DocenteCLI();
                    docente.gestionar( docentes );
                    break;
                case 3:
                    break;
            }
        }
    }
}
package ups.vista;

import ups.controlador.GestionarBibliotecario;
import ups.controlador.GestionarDocente;
import ups.controlador.GestionarEstudiante;
import ups.informacion.Menu;

import java.util.Scanner;

public class EstudianteCLI implements GestionarCLI {

    public void gestionar(GestionarEstudiante objeto) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            Menu.menu_gestionar( "Estudiante" );
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

    }

    @Override
    public void modificarCLI(Object objeto) {

    }

    @Override
    public void eliminarCLI(Object objeto) {

    }

    @Override
    public void buscarCLI(Object objeto) {
    }

    @Override
    public void listarCLI(Object objeto) {

    }

    public static class Biblioteca {


        public static void main(String[] args) {

            int intentos = 1;
            while (intentos <= 3) {
                System.out.println("************************************");
                System.out.println("SISTEMA DE INFORMACIÓN BIBLIOTECARIO");
                System.out.println("************************************");

                VerificarUsuarioCLI cli = new VerificarUsuarioCLI();
                if (cli.verificarUsuario()) {
                    GestionarBibliotecario bibliotecarios = new GestionarBibliotecario();
                    GestionarDocente docentes = new GestionarDocente();
                    menuPrincipal(bibliotecarios, docentes);

                    break;
                } else {
                    System.out.println("Usuario y/o clave incorrecta.");
                    intentos++;
                }
            }
        }

        public static void menuPrincipal(GestionarBibliotecario bibliotecarios, GestionarDocente docentes) {
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
                        BibliotecarioCLI objeto = new BibliotecarioCLI();
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
}

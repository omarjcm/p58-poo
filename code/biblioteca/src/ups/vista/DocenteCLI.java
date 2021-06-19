package ups.vista;

import ups.controlador.GestionarDocente;
import ups.informacion.Menu;

import java.util.Scanner;

public class DocenteCLI implements GestionarCLI {

    public void gestionar(GestionarDocente objeto) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            Menu.menu_gestionar( "Docente" );
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
}
package vista;

import controlador.GestionarContacto;

import java.util.Scanner;

public class AgendaContactosApp {
    public static void main(String[] args) {
        GestionarContacto contactos = new GestionarContacto();

        while(true) {
            MenuPrincipal.tituloPrincipal();
            MenuPrincipal.opcionesPrincipales();

            Scanner consola = new Scanner(System.in);
            int opcion = consola.nextInt();
            if (opcion == 6)
                break;

            Menu menu = new Menu(opcion, contactos);
            menu.seleccionarOpcion();
        }
    }
}

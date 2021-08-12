package ec.edu.ups.vista;

import java.util.Scanner;

public class AgendaContactosApp {
    public static void main(String[] args) {
        while(true) {
            MenuPrincipal.tituloPrincipal();
            MenuPrincipal.opcionesPrincipales();

            Scanner consola = new Scanner(System.in);
            String opcion = consola.nextLine();
            if (opcion.compareTo("S") == 0)
                break;

            Menu menu = new Menu(opcion);
            menu.seleccionarOpcion();
        }
    }
}

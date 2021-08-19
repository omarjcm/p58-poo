package ec.edu.ups.vista;

import ec.edu.ups.Constantes;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AgendaContactosApp {
    public static void main(String[] args) {
        ResourceBundle rs = ResourceBundle.getBundle( Constantes.DATOS );

        while(true) {
            MenuPrincipal.tituloPrincipal(rs);
            MenuPrincipal.opcionesPrincipales(rs);

            Scanner consola = new Scanner(System.in);
            int opcion = consola.nextInt();
            if (opcion == 6)
                break;

            Menu menu = new Menu(opcion);
            menu.seleccionarOpcion();
        }
    }
}

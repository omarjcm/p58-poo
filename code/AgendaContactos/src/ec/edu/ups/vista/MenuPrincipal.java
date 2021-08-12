package ec.edu.ups.vista;

import ec.edu.ups.Constantes;

public class MenuPrincipal {
    public static void tituloPrincipal() {
        System.out.println(Constantes.TEXT_YELLOW + "===================================");
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("===================================");
    }

    public static void opcionesPrincipales() {
        System.out.println("[C]rear Contacto.");
        System.out.println("[M]odificar Contacto.");
        System.out.println("[E]liminar Contacto.");
        System.out.println("[B]uscar Contacto.");
        System.out.println("[L]istar Contactos.");
        System.out.println("[S]alir.");
        System.out.println("==================================="+ Constantes.TEXT_RESET);
        System.out.print("Ingresar opción: ");
    }

    public static void subTitulo(String opcion) {
        System.out.println("===================================");
        System.out.println(opcion + " CONTACTO");
        System.out.println("===================================");
    }
}

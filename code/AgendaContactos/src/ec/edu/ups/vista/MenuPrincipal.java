package ec.edu.ups.vista;

import ec.edu.ups.Constantes;

import java.util.ResourceBundle;

public class MenuPrincipal {

    public static void tituloPrincipal(ResourceBundle rs) {
        System.out.println(Constantes.TEXT_YELLOW + "===================================");
        System.out.println(rs.getString(Constantes.TITULO_PRINCIPAL));
        System.out.println("===================================");
    }

    public static void opcionesPrincipales(ResourceBundle rs) {
        System.out.println("[1]. " + rs.getString( Constantes.OPCION_C ));
        System.out.println("[2]. " + rs.getString( Constantes.OPCION_U ));
        System.out.println("[3]. " + rs.getString( Constantes.OPCION_D ));
        System.out.println("[4]. " + rs.getString( Constantes.OPCION_G ));
        System.out.println("[5]. " + rs.getString( Constantes.OPCION_R ));
        System.out.println("[6]. " + rs.getString( Constantes.OPCION_S ));
        System.out.println("==================================="+ Constantes.TEXT_RESET);
        System.out.print("Ingresar opción: ");
    }

    public static void subTitulo(String opcion) {
        System.out.println("===================================");
        System.out.println(opcion + " CONTACTO");
        System.out.println("===================================");
    }
}

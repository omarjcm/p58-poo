package vista;

public class MenuPrincipal {

    public static void tituloPrincipal() {
        System.out.println("===================================");
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("===================================");
    }

    public static void opcionesPrincipales() {
        System.out.println("[1]. Registrar Contacto");
        System.out.println("[2]. Modificar Contacto");
        System.out.println("[3]. Eliminar Contacto");
        System.out.println("[4]. Listar Contactos");
        System.out.println("[5]. Buscar Contacto");
        System.out.println("[6]. Salir");
        System.out.println("===================================");
        System.out.print("Ingresar opción: ");
    }

    public static void subTitulo(String opcion) {
        System.out.println("===================================");
        System.out.println(opcion + " CONTACTO");
        System.out.println("===================================");
    }
}

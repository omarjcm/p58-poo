package ups.informacion;

public class Menu {

    public static void cabecera(String titulo) {
        System.out.println("************************************");
        System.out.println(titulo );
        System.out.println("************************************");
    }

    public static void menu_gestionar(String objeto) {
        System.out.println("************************************");
        System.out.println("GESTIONAR " + objeto.toUpperCase() );
        System.out.println("************************************");
        System.out.println("[1].- Registrar "+objeto+".");
        System.out.println("[2].- Modificar "+objeto+".");
        System.out.println("[3].- Eliminar "+objeto+".");
        System.out.println("[4].- Buscar "+objeto+".");
        System.out.println("[5].- Listar "+objeto+"s.");
        System.out.println("[6].- Salir.");
        System.out.println("************************************");
        System.out.print("Opción: ");
    }
}

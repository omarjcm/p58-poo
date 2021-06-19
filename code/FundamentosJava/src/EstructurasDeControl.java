import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("¿Tienes novio? ");
        String opcion = consola.nextLine();

        if (opcion.compareTo("Si") == 0) {
            System.out.println("Ahhh... pensé que no tenías novio.");
        } else if (opcion.compareTo("No") == 0) {
            System.out.println("¿Podemos salir?");
        } else {
            System.out.println("cri cri cri...");
        }
    }
}

package ups.pruebas;

import java.util.Scanner;

public class PaisPrueba {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresar pais: ");
        String pais = consola.nextLine();
        float dolares = consola.nextFloat();

        System.out.println("El país ingresado es: " + pais);
        System.out.println("El valor del dinero obtenido es " + dolares);
    }
}

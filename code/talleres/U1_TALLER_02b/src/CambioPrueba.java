import java.util.Scanner;

public class CambioPrueba {
    public static void main(String[] args) {
        Cambio objeto = new Cambio();

        Scanner consola = new Scanner(System.in);
        objeto.dolares = consola.nextFloat();

        System.out.println("Dolares a Euros: " + objeto.dolaresAEuros() + " euros.");
    }
}

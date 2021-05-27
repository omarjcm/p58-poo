import java.util.Scanner;

public class DolaresPrueba {
    public static void main(String[] args) {
        Cambio objeto = new Cambio();

        Scanner consola = new Scanner(System.in);
        objeto.dolares = consola.nextFloat();

        System.out.println("Dólares a Euros: " + objeto.dolaresAEuros());
        System.out.println("Dólares a Yenes: " + objeto.dolaresAYenes());

    }
}

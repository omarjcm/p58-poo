import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) throws InputMismatchException, ArithmeticException {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresar un número: ");
        Integer numero1 = consola.nextInt();
        System.out.print("Ingresar otro número: ");
        Integer numero2 = consola.nextInt();

        Integer resultado = numero1 / numero2;
        System.out.println("La suma es: " + resultado );
    }
}

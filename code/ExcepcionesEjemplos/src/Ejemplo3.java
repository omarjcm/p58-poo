import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Boolean centinela = true;

        try {
            System.out.print("Ingresar un número: ");
            Integer numero1 = consola.nextInt();
            System.out.print("Ingresar otro número: ");
            Integer numero2 = consola.nextInt();

            Integer resultado = numero1 / numero2;
            System.out.println("La suma es: " + resultado );
            centinela = false;
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar un número.");
        } catch (ArithmeticException ex) {
            System.out.println("No existe división por cero.");
        } finally {
            System.out.println("Salida");
        }

    }

}

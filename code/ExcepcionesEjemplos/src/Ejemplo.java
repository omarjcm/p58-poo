import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Integer numero1 = null;
        Integer numero2 = null;

        try {
            System.out.print("Ingresar un número: ");
            numero1 = consola.nextInt();
            System.out.print("Ingresar otro número: ");
            numero2 = consola.nextInt();

            Integer resultado = numero1 / numero2;
            System.out.println("La suma es: " + resultado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar un número.");
        } catch (ArithmeticException ex) {
            System.out.println("No existe división por cero.");
        }
    }

}

import java.util.Locale;
import java.util.ResourceBundle;

public class Internacionalizacion {
    public static void main(String[] args) {
        String recurso = "saludo";

        ResourceBundle rb =ResourceBundle.getBundle(recurso);
        System.out.println("Predeterminado: " + rb.getString("hola.texto"));

        rb = ResourceBundle.getBundle(recurso, Locale.ENGLISH);
        System.out.println("Inglés: " + rb.getString("hola.texto"));

        rb = ResourceBundle.getBundle(recurso, Locale.FRENCH);
        System.out.println("Francés: " + rb.getString("hola.texto"));

        rb = ResourceBundle.getBundle(recurso, Locale.GERMAN);
        System.out.println("Alemán: " + rb.getString("hola.texto"));
    }
}

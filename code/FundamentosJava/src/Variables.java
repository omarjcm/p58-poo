import java.util.Locale;

public class Variables {
    public static void main(String[] args) {
        /*
        Tipos de datos primitivos
         */
        int a = 10;
        a = a + 1;
        a++;
        System.out.println( a );

        /*
        Tipos de datos - Clases Wrappers
         */
        float dinero = 100.50f;
        double dolares = 200.00;
        System.out.println( "El dinero obtenido es: " + dinero );
        System.out.println( "Los dòlares ganados son: " + dolares );

        String nombre = "Guillermo";
        String apellido = "Pizarro";
        System.out.println( nombre + " " + apellido );
        System.out.println( nombre.toLowerCase() + " " + apellido.toUpperCase() );
    }
}

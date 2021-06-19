public class RecetaCocina20 {
    public static void main(String[] args) {
        // Receta para preparar galletas es para 20 personas.
        prepararMasaGalletas();
        prepararMasaGalletas();
        System.out.println("Enciendo el horno a 70º.");
        hornearGalletas();
        hornearGalletas();
        System.out.println("Apago el horno.");
        servirGalletas();
    }

    public static void prepararMasaGalletas() {
        System.out.println("Preparo la masa.");
        System.out.println("Le hecho chispas de chocolate a la masa.");
        System.out.println("Coloco pequeñas porciones de la masa en una bandeja.");
    }

    public static void hornearGalletas() {
        System.out.println("Coloco la bandeja en un horno.");
        System.out.println("Dejo las galletas por 20 minutos.");
        System.out.println("Saco la bandeja con galletas del horno.");
    }

    public static void servirGalletas() {
        System.out.println("Dejo enfriar las galletas.");
        System.out.println("Servir las galletas.");
    }
}

package ups.pruebas;

import ups.modelo.libreria.Libro;

public class LibroPruebas {
    public static void main(String[] args) {
        Libro libro01 = new Libro();
        //libro01.isbn = "7364648393-309484747";
        System.out.println( libro01.getIsbn() );
        System.out.println( libro01.getAnioPublicacion() );

        System.out.println( "====================================" );

        Libro libro02 = new Libro(2021, "234-567-239485");
        System.out.println( libro02.getIsbn() );
        System.out.println( libro02.getAnioPublicacion() );

        System.out.println( "====================================" );

        Libro libro03 = new Libro(2021, "234-567-239485");
        libro03.setTitulo( "Esto es un ejemplo..." );
        libro03.imprimir();

        System.out.println( "====================================" );

        Libro libro04 = new Libro(1940, "234-567-239485", "Los Tres Mosqueteros");
        libro04.imprimir();
    }
}

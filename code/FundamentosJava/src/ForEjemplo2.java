public class ForEjemplo2 {
    public static void main(String[] args) {
        figuraGeometrica(9 );
    }

    public static void figuraGeometrica(int num_linea) {
        for (int linea = 1; linea <= num_linea; linea++) {
            for (int espacio = num_linea-linea; espacio >= 0; espacio--) {
                System.out.print(" ");
            }
            for (int asterisco=1; asterisco <= linea; asterisco++) {
                System.out.print(linea);
            }
            System.out.println();
        }
    }
}

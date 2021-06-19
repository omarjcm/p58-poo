public class EstructurasDeControlRepetitivas {
    public static void main(String[] args) {
        cuadrado();
        cuadrado();
        cuadrado();
        cuadrado();
    }

    public static void cuadrado() {
        for (int i=1; i<=4; i++) {
            linea();
        }
        System.out.println();
    }

    public static void linea() {
        for (int i=1; i<=10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

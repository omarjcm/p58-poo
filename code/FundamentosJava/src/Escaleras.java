public class Escaleras {

    public static void main(String[] args) {
        escalera( 8 );
    }

    public static void escalera(int numPisos) {

        for (int i=numPisos; i>0; i--) {
            espacioAntes(i-1);
            cabeza();
            piso();
            System.out.print("*");
            espacioDespues((numPisos) -i);
            if (i != numPisos)
                finalizar();
            else
                System.out.println();

            espacioAntes(i-1);
            manos();
            espacioDespues((numPisos+1) -i);
            finalizar();

            espacioAntes(i-1);
            pies();
            espacioDespues((numPisos+1) -i);
            finalizar();
       }
        pisoAbajo(numPisos);
    }

    public static void pisoAbajo(int numPisos) {
        piso();
        for(int i=1; i<=5*numPisos+2; i++) {
            System.out.print("*");
        }
    }

    public static void finalizar() {
        System.out.println("*");
    }

    public static void espacioAntes(int repetir) {
        for (int j=repetir-1; j >= 0; j--) {
            for (int i=1; i<=5; i++) {
                System.out.print(" ");
            }
        }
    }

    public static void espacioDespues(int repetir) {
        System.out.print("*");
        for (int i=0; i<repetir; i++) {
            System.out.print("    ");
        }
        for (int i=0; i<repetir-1; i++) {
            System.out.print(" ");
        }
    }

    public static void cabeza() {
        System.out.print("  o  ");
    }

    public static void manos() {
        System.out.print(" /|\\ ");
    }

    public static void pies() {
        System.out.print(" / \\ ");
    }

    public static void piso() {
        System.out.print("****");
    }

}

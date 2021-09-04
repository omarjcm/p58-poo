public class Ejemplo4 {
    public static void main(String[] args) {
        String lista[] = {"Guillermo", "Irena", "John"};
        try {
            for (int i=0; i<3; i++) {
                System.out.println( lista[i] );
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Revisar el indice que se sale del tamaño del arreglo.");
        }
    }
}

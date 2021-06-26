package ups.modelo.dominio.universidad;

/**
 * 
 */
public class Estudiante extends Persona {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private float promedioGeneral;

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Promedio General: " + this.promedioGeneral);
    }

    public static void calcularQuintil() {
        System.out.println("Estoy calculando.");
    }
}
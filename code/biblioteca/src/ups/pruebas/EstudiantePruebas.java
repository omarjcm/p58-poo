package ups.pruebas;

import ups.modelo.universidad.Estudiante;

public class EstudiantePruebas {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setCedula("0458694857");
        estudiante.setNombre("Guillermo");
        estudiante.setApellido("Pizarro");
        estudiante.setPromedioGeneral(90);
        estudiante.imprimir();

        Estudiante.calcularQuintil();
    }
}

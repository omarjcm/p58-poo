package ups.modelo.libreria;

/**
 * 
 */
public class CopiaLibro {

    /**
     * Default constructor
     */
    public CopiaLibro() {
    }

    public CopiaLibro(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }
    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String estado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Estado del libro: " + this.estado);
    }
}
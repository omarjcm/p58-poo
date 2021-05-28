package ups.controlador;

public interface Gestionar {

    public void registrar( Object objeto );
    public void modificar( Object objeto );
    public void eliminar(String cedula);
    public Object buscar(String cedula);
    public void listar();

}

package ups.modelo.bd;

import java.util.ArrayList;

public interface BD {

    public void registrar(Object objeto);

    public void modificar(Object objeto);

    public void eliminar(Object objeto);

    public Object buscar(Object objeto);

    public ArrayList<Object> listar();
}
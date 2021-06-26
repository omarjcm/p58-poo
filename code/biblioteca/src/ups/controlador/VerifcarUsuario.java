package ups.controlador;

import ups.modelo.dominio.universidad.Bibliotecario;

public class VerifcarUsuario {

    private Bibliotecario bibliotecario;

    public VerifcarUsuario(String usuario, String clave) {
        this.bibliotecario = new Bibliotecario();
        this.bibliotecario.setUsuario( usuario );
        this.bibliotecario.setClave( clave );
    }

    public Boolean verificarUsuario() {
        if (this.bibliotecario.existeUsuario()) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}

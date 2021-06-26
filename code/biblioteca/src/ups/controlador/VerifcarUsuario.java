package ups.controlador;

import ups.modelo.bd.universidad.BibliotecarioBD;

public class VerifcarUsuario {

    private BibliotecarioBD bibliotecario;

    public VerifcarUsuario(String usuario, String clave) {
        this.bibliotecario = new BibliotecarioBD();
        this.bibliotecario.setUsuario( usuario );
        this.bibliotecario.setClave( clave );
    }

    public Boolean verificarUsuario() {
        if (this.bibliotecario.existeUsuario( this.bibliotecario.getUsuario(), this.bibliotecario.getClave() )) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}

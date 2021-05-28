package ups.vista;

import ups.controlador.VerifcarUsuario;

import java.util.Scanner;

public class VerificarUsuarioCLI {

    public Boolean verificarUsuario() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usuario = consola.nextLine();
        System.out.println("Clave: ");
        String clave = consola.nextLine();

        VerifcarUsuario objeto = new VerifcarUsuario(usuario, clave);
        return objeto.verificarUsuario();
    }
}

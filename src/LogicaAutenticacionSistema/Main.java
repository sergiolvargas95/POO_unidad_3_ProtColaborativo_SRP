package LogicaAutenticacionSistema;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("pedropablo@gmail.com", "admin", "123456");

        AutenticacionService autenticacion = new AutenticacionService();
        ValidacionService validacion = new ValidacionService();

        if(validacion.validar(usuario)) {
            System.out.println("Los datos del usuario son válidos.");
        } else {
            System.out.println("Los datos del usuario no son válidos.");
        }

        boolean esAutenticado = autenticacion.autenticarUsuario(usuario);
        if(esAutenticado) {
            System.out.println("Usuario autenticado.");
        } else {
            System.out.println("Usuario no autenticado.");
        }
    }
}

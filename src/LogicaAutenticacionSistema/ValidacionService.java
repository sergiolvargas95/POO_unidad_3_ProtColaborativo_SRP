package LogicaAutenticacionSistema;

public class ValidacionService {
    public boolean validar(Usuario usuario) {
        return validarEmail(usuario.getEmail()) && validarContrasena(usuario.getPassword());
    }

    private boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }

    private boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 6;
    }
}

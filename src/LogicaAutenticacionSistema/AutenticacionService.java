package LogicaAutenticacionSistema;

public class AutenticacionService {
    public boolean autenticarUsuario(Usuario usuario){
        return usuario.getusername()
                    .equals("admin")
                && usuario.getPassword()
                    .equals("123456");
    }
}

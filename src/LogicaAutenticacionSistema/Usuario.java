package LogicaAutenticacionSistema;

public class Usuario {
    private String username;
    private String password;
    private String email;

    public Usuario(String email, String username, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

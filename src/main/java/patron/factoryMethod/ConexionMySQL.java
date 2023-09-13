package patron.factoryMethod;

public class ConexionMySQL implements IConexion{

    private String url;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionMySQL(){
        this.url = "server2";
        this.puerto = "4200";
        this.usuario = "admin";
        this.password = "1234";
    }

    public void conectar(){
        System.out.println("Se conecto a MySQL");
    }

    public void desconectar(){
        System.out.println("Desconectado de MySQL");
    }

}

package patron.factoryMethod;

public class ConexionPostgres implements IConexion{

    private String url;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionPostgres(){
        this.url = "server3";
        this.puerto = "4200";
        this.usuario = "admin";
        this.password = "1234";
    }

    public void conectar(){
        System.out.println("Se conecto a Postgres");
    }

    public void desconectar(){
        System.out.println("Desconectado de Postgres");
    }

}

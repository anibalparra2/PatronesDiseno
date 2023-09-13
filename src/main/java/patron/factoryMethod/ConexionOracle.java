package patron.factoryMethod;

public class ConexionOracle implements IConexion{

    private String url;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionOracle(){
        this.url = "server1";
        this.puerto = "4200";
        this.usuario = "admin";
        this.password = "1234";
    }

    public void conectar(){
        System.out.println("Se conecto a Oracle");
    }

    public void desconectar(){
        System.out.println("Desconectado de Oracle");
    }

}

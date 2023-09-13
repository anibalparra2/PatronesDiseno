package patron.singleton;

public class Main {

    public static void main(String args[]){
        Conexion con = Conexion.getInstancia();
        con.conectar();
        con.desconectar();
        Conexion con2 = Conexion.getInstancia();
        con.conectar();
        con.desconectar();
    }
}

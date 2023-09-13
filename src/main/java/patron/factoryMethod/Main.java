package patron.factoryMethod;

public class Main {

    public static void main(String args[]){
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion con = fabrica.getConexion("ORACLE");
        con.conectar();
        con.desconectar();
        IConexion con2 = fabrica.getConexion("MYSQL");
        con2.conectar();
        con2.desconectar();
        IConexion con3 = fabrica.getConexion("POSTGRES");
        con3.conectar();
        con3.desconectar();
        IConexion con4 = fabrica.getConexion("H2");
        con4.conectar();
        con4.desconectar();

    }
}

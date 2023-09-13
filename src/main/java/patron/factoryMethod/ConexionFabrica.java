package patron.factoryMethod;

public class ConexionFabrica {

    public IConexion getConexion(String motor){
        switch (motor){
            case "ORACLE":
                return new ConexionOracle();
            case "MYSQL":
                return new ConexionMySQL();
            case "POSTGRES":
                return new ConexionPostgres();
            default:
                return new ConexionVacia();
        }
    }
}

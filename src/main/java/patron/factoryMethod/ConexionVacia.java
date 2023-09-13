package patron.factoryMethod;

public class ConexionVacia implements IConexion{


    @Override
    public void conectar() {
        System.out.println("No existe una conexion para ese motor");
    }

    @Override
    public void desconectar() {
        System.out.println("No existe una conexion para ese motor");
    }
}

package patron.singleton;

class Conexion {

    private static Conexion instancia;

    private Conexion(){
    }

    public static Conexion getInstancia(){
        if(instancia == null){
            System.out.println("nueva instancia");
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Me conecte");
    }

    public void desconectar(){
        System.out.println("Me desconecte");
    }
}

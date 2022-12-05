package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion uniqueInstance;

    //Constructor
    public Direccion(){}
    public static Direccion getInstance() {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Direccion();
        }
        return uniqueInstance;
    }
}

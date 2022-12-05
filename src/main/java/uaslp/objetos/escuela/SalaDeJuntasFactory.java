package uaslp.objetos.escuela;

public class SalaDeJuntasFactory{
    public static SalaDeJuntas get(String nombre){
        return new SalaDeJuntas(nombre);
    }
}

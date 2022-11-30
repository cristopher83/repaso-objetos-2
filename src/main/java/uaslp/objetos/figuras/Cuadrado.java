package uaslp.objetos.figuras;

import java.io.FileOutputStream;

public class Cuadrado extends Figura {

    private double lado;

    //Constructor.
    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado=lado;
    }

    //Constructor two with polimorphysm.
    public Cuadrado(){
        super("Cuadrado");
    }
    //Methods.
    public void setLado(double lado){
        this.lado=lado;
    }
    public double getArea(){
        return (lado*lado);
    }
    public double getLado(){
        return this.lado;
    }
}

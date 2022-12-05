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
        double area = lado*lado;
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        return area;

    }
    public double getLado(){
        return this.lado;
    }
}

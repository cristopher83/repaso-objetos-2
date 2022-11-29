package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;
    private double area;

    //Constructor.
    public Cuadrado(double lado){
        this.lado=lado;
    }
    //Constructor two with polimorphysm.
    public Cuadrado(){

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

package uaslp.objetos.figuras;

import java.lang.management.PlatformLoggingMXBean;

public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;

    //Constructor.
    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados = numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados,double lado){
        this.lado = lado;
        this.numeroDeLados = numeroDeLados;
    }


    //Methods.
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public double getArea(){ //VERIFICAR COMO SACAR AREA DE POLIGONO
        double apotema = (lado^2-)^(1/2);
        return lado*numeroDeLados;
    }
}

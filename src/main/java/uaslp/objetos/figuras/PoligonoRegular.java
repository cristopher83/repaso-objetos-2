package uaslp.objetos.figuras;
import static java.lang.Math.*;

public class PoligonoRegular extends Figura{
    private double lado;
    private final int numeroDeLados;

    //Constructor.
    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados,double lado){
        super("Poligono Regular");
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
        double tangente = tan(toRadians(360/(2*numeroDeLados)));
        double apotema = (lado/2)/ tangente;
        double perimetro =getPerimetro(numeroDeLados);
        return perimetro*apotema/2;
    }
    public double getPerimetro(int contadorDeLados){
        if(contadorDeLados == 1){
            return lado;
        }else{
            return getPerimetro(--contadorDeLados)+lado;
        }
    }
}
package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double area;
    private String description;

    //Constructor
    public Triangulo(double base,double altura){
        super("Triangulo");
        this.altura=altura;
        this.base=base;
    }
    public Triangulo(){
        super("Triangulo");
        description = "Cualquier triangulo";
    }
    public Triangulo(String msg){
        super(null);
        setDescription(msg);
    }


    //Methods.
    public void setBase(double base){
        this.base= base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getArea(){
        return base*altura/2;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String msg){
        this.description=msg;
    }
}
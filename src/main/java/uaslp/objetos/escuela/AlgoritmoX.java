package uaslp.objetos.escuela;

public class AlgoritmoX {

    private final Dependencia1 dependencia1;
    private final Dependencia2 dependencia2;
    private final Dependencia3 dependencia3;

    public AlgoritmoX(Dependencia1 dependencia1,
                      Dependencia2 dependencia2,
                      Dependencia3 dependencia3) {
        this.dependencia1 = dependencia1;
        this.dependencia2 = dependencia2;
        this.dependencia3 = dependencia3;
    }
    public AlgoritmoX(){
        this.dependencia1 = null;
        this.dependencia2 = null;
        this.dependencia3 = null;
    }

    public String algoritmoACubrir(int a, int b, String c){
        String resultado = null;
        if(a == b){
            dependencia1.save(c);
            resultado = "save";
        } else if(a < b){
            dependencia2.print(a, c);
            resultado = "print";
        } else {
            dependencia3.send(a, b);
            resultado = "send";
        }
        dependencia3.recover();
        return resultado;
    }
}

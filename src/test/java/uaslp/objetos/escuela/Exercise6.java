package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
    @Test
    public void verificaClaseAlgoritmoX(){
        AlgoritmoX algoritmoX = new AlgoritmoX();
        assertThat(algoritmoX).isInstanceOf(AlgoritmoX.class);
    }

    @Test
    public void verificaMetodoSave(){
        Dependencia dependencia1 = new Dependencia();
        Dependencia dependencia2 = new Dependencia();
        Dependencia dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        String valor = algoritmoX.algoritmoACubrir(2,2,"s");
        Assertions.assertEquals(valor,"save");
    }
    @Test
    public void verificaMetodoPrint(){
        Dependencia dependencia1 = new Dependencia();
        Dependencia dependencia2 = new Dependencia();
        Dependencia dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        String valor = algoritmoX.algoritmoACubrir(1,2,"s");
        Assertions.assertEquals(valor,"print");
    }
    @Test
    public void verificaMetodoSend(){
        Dependencia dependencia1 = new Dependencia();
        Dependencia dependencia2 = new Dependencia();
        Dependencia dependencia3 = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        String valor = algoritmoX.algoritmoACubrir(4,2,"s");
        Assertions.assertEquals(valor,"send");
    }
}

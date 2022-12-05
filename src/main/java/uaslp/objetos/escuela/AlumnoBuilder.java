package uaslp.objetos.escuela;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class AlumnoBuilder {
    private String clave;
    private String claveDeCarrera;
    private String nombre;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public AlumnoBuilder clave(String clave){
        this.clave = clave;
        return this;
    }
    public AlumnoBuilder claveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera = claveDeCarrera;
        return this;
    }
    public AlumnoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public AlumnoBuilder anioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso = anioDeIngreso;
        return this;
    }
    public AlumnoBuilder fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
    public Alumno build(){
        return new Alumno(clave,claveDeCarrera,nombre,anioDeIngreso,fechaNacimiento);
    }

}

package profesionales.prefesionales_area_medica;

import clase_empleado.Empleado;
import java.util.GregorianCalendar;

public class Enfermera extends Empleado{

    public Enfermera(){
    }

    public Enfermera(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario, String tipoSeguroSocial) {
        super(nombre, horasDiarias, fechaIngreso, salario, tipoSeguroSocial);
    }

    public Enfermera(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        super(nombre, horasDiarias, fechaIngreso, salario);
    } 
    
    public Enfermera(double horasExtra){
        super(horasExtra);
    }
   
    @Override
    public void sueldoExtraEmpleado(Empleado empleado){
        System.out.println("EL SALARIO EXTRA DEL EMPLEADO DE CLASE : "+empleado.getClass());
        System.out.println("NOMBRE : "+empleado.getNombre());
        System.out.println("SUELDO : "+super.getSalario());
        System.out.println("SUELDO EXTRA : "+(super.getHorasExtra()* 14));
    }
}

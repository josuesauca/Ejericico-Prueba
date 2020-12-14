package profesionales.prefesionales_area_medica;

import clase_empleado.Empleado;
import java.util.GregorianCalendar;

public class Medico extends Empleado{    

    private String especialidad;
    
    public Medico(){
    }

    public Medico(String especialidad, String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario, String tipoSeguroSocial) {
        super(nombre, horasDiarias, fechaIngreso, salario, tipoSeguroSocial);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        super(nombre, horasDiarias, fechaIngreso, salario);
        this.especialidad = especialidad;
    }
    
    public Medico(double horasExtra){
        super(horasExtra);
    }
       
    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return this.especialidad;
    } 

    @Override
    public void sueldoExtraEmpleado(Empleado empleado){
        System.out.println("EL SALARIO EXTRA DEL EMPLEADO DE CLASE : "+empleado.getClass());
        System.out.println("NOMBRE : "+empleado.getNombre());
        System.out.println("ESPECIALIZACION : "+this.getEspecialidad());
        System.out.println("SUELDO : "+super.getSalario());
        System.out.println("SUELDO EXTRA : "+(super.getHorasExtra()* 15));
    }
}

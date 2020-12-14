package profesionales.prefesionales_area_no_medica;

import java.util.GregorianCalendar;
import clase_empleado.Empleado;

public class Conductor extends Empleado {

    private char licencia;
    
    public Conductor() {
    }

    public Conductor(char licencia,String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario, String tipoSeguroSocial) {
        super(nombre, horasDiarias, fechaIngreso, salario, tipoSeguroSocial);
        this.licencia = licencia;
    }
    
    public Conductor(char licencia,String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        super(nombre, horasDiarias, fechaIngreso, salario);
        this.licencia = licencia;
    }
    
    public Conductor(double horasExtra){
        super(horasExtra);
    }

    /**
     * @return the licencia
     */
    public char getLicencia() {
        return this.licencia;
    }
        
    @Override
    public void sueldoExtraEmpleado(Empleado empleado){
        System.out.println("EL SALARIO EXTRA DEL EMPLEADO DE CLASE : "+empleado.getClass());
        System.out.println("NOMBRE : "+empleado.getNombre());
        System.out.println("LICENCIA TIPO : "+this.getLicencia());
        System.out.println("SUELDO : "+super.getSalario());
        System.out.println("SUELDO EXTRA : "+(super.getHorasExtra()* 13));
    }
}

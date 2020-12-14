package clase_empleado;

import java.util.GregorianCalendar;

public class Empleado {
    
    private String nombre;
    private int horasDiarias;
    private GregorianCalendar fechaIngreso;
    private double salario;
    private String tipoSeguroSocial;
    private double horasExtra;
    
    public Empleado(){
    }
   
    public Empleado(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario, String tipoSeguroSocial) {
        this.nombre = nombre;
        this.horasDiarias = horasDiarias;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.tipoSeguroSocial = tipoSeguroSocial;
    }
       
    public Empleado(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        this.nombre = nombre;
        this.horasDiarias = horasDiarias;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }
    
    public Empleado(double horasExtra){
        this.horasExtra = horasExtra;
    }
    
    /**
     * @return the horasExtra
     */
    public double getHorasExtra() {
        return horasExtra;
    }
    
    /**
     * @param horasExtra the horasExtra to set
     */
    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return the horasDiarias
     */
    public int getHorasDiarias() {
        return this.horasDiarias;
    }

    /**
     * @return the fechaIngreso
     */
    public GregorianCalendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * @return the tipoSeguroSocial
     */
    public String getTipoSeguroSocial() {
        return this.tipoSeguroSocial;
    }

    public String toString(int indiceEmpleado, Empleado empleado) {
        return indiceEmpleado+") Empleado Clase : "+empleado.getClass() 
                + "\n"+indiceEmpleado+") Nombre : " + empleado.getNombre() + 
                "\n"+indiceEmpleado+") HorasDiarias : " + empleado.getHorasDiarias() + 
                "\n"+indiceEmpleado+") Fecha y Hora Ingreso Trabajo : " + getFechaIngreso().getTime()+
                "\n"+indiceEmpleado+") Salario : " + empleado.getSalario() +
                "\n"+indiceEmpleado+") TipoSeguroSocial : " + empleado.getTipoSeguroSocial();
    }
    
    public String toString(Empleado empleado,int indiceEmpleado) {
        return indiceEmpleado+") Empleado Clase : "+empleado.getClass()
                + "\n"+indiceEmpleado+") Nombre : " + empleado.getNombre() + 
                "\n"+indiceEmpleado+") HorasDiarias : " + empleado.getHorasDiarias() + 
                "\n"+indiceEmpleado+") Fecha y Hora Ingreso Trabajo : " + getFechaIngreso().getTime()+
                "\n"+indiceEmpleado+") Salario : " + empleado.getSalario();
    }
   
    public void sueldoExtraEmpleado(Empleado empleado){
    }
    
}

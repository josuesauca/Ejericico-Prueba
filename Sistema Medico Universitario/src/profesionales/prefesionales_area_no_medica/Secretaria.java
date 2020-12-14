package profesionales.prefesionales_area_no_medica;

import clase_empleado.Empleado;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Secretaria extends Empleado {
    
    public Secretaria() {
    }

    public Secretaria(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario, String tipoSeguroSocial) {
        super(nombre, horasDiarias, fechaIngreso, salario, tipoSeguroSocial);
    }

    public Secretaria(String nombre, int horasDiarias, GregorianCalendar fechaIngreso, double salario) {
        super(nombre, horasDiarias, fechaIngreso, salario);
    }
    
    public Secretaria(double horasExtra){
        super(horasExtra);
    }
    
    @Override
    public void sueldoExtraEmpleado(Empleado empleado){
        System.out.println("EL SALARIO EXTRA DEL EMPLEADO DE CLASE : "+empleado.getClass());
        System.out.println("NOMBRE : "+empleado.getNombre());
        System.out.println("SUELDO : "+super.getSalario());
        System.out.println("SUELDO EXTRA : "+(super.getHorasExtra()* 13));
    }
    
    public void generarFactura() {
        Scanner scanner = new Scanner(System.in);
        String nombreCliente,apellidoCliente,correoCliente,direccionCliente;
        int cedulaCliente = 0;
        System.out.println("\n\n\nINGRESE LOS DATOS DEL CLIENTE");
        System.out.print("NOMBRES : ");
        nombreCliente = scanner.nextLine();
        System.out.print("APELLIDOS : ");
        apellidoCliente = scanner.nextLine();
        System.out.print("CEDULA : ");
        cedulaCliente = Integer.parseInt(scanner.next());
        System.out.print("CORREO : ");
        correoCliente = scanner.next();
        System.out.print("DIRECCION : ");
        direccionCliente = scanner.next();
        System.out.println("DATOS DEL CLIENTE");
                
        System.out.print("CUANTOS SERVICIOS ADQUIRIO EN EL HOSPITAL : ");
        int limiteArreglo = scanner.nextInt();
        String descripcionServicio[] = new String[limiteArreglo];
        double subtotalServicio[] = new double[limiteArreglo];
        System.out.println("\n");
        for (int j = 0; j < limiteArreglo; j++) {
            System.out.print((j+1)+") DESCRIPCION/CONCEPTO SERVICIO : ");
            descripcionServicio[j] = scanner.next();
            System.out.print((j+1)+") SUBTOTAL SERVICIO : ");
            subtotalServicio[j] = Double.parseDouble(scanner.next());
            
        }
                
        System.out.println("\n\n\n---------------------------------------------------------------------");
        System.out.println("\t\t\tFACTURA DE CLINICA");
        System.out.println("\t\t\tMAYO CLINIC - ROCHESTER");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("CLIENTE");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("NOMBRES COMPLETOS : "+nombreCliente+" "+apellidoCliente);
        System.out.println("CEDULA : "+cedulaCliente);
        System.out.println("CORREO : "+correoCliente);
        System.out.println("DIRECCION : "+direccionCliente);
        double totalPagar = 0 , subtotalNeto = 0,ivaPagar = 0;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("DESCRIPCION/CONCEPTO SERVICIO\t\t\tSUBTOTAL");
        System.out.println("---------------------------------------------------------------------");
        for (int j = 0; j < descripcionServicio.length ;j++) {
            System.out.println(descripcionServicio[j]+"\t\t\t\t\t\t "+subtotalServicio[j]);
            subtotalNeto = subtotalNeto + subtotalServicio[j];
        }
        
        ivaPagar = 0.12D*subtotalNeto;
        totalPagar = subtotalNeto + ivaPagar;
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t   EL SUBTOTAL NETO ES : "+subtotalNeto);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\tIVA(12%): "+ivaPagar);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t   EL TOTAL A PAGAR ES :"+totalPagar);
        System.out.println("---------------------------------------------------------------------");
    }

}

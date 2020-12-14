/**
 * Autor : Josue Sauca
 * Fecha : 13/12/2020
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.GregorianCalendar;
import clase_empleado.Empleado;
import profesionales.prefesionales_area_medica.Enfermera;
import profesionales.prefesionales_area_medica.Medico;
import profesionales.prefesionales_area_no_medica.Conductor;
import profesionales.prefesionales_area_no_medica.Secretaria;

public class Main {

    public static void main(String[] args) {
        iniciarSistemaMedico();

//        //Deber
//        System.out.println("\n\nSISTEMA MEDICO UNIVERSITARIO DE LA UNIVERSIDAD NACIONAL DE LOJA");
//
//        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
//        
//        Scanner scanner = new Scanner(System.in);
//
//        //BEGGIN CREATIONS OBJECTS
//        Empleado empleado = new Empleado();
//        Medico medico = new Medico();
//        Enfermera enfermera = new Enfermera();
//        Secretaria secretaria = new Secretaria();
//        Conductor conductor = new Conductor();
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        //END CREATIONS OBJECT
//
//        boolean verificarEntradaDatos = false;
//
//        String nombreEmpleado, tipoSeguroSocial, especialidadMedico;
//        int horasDiariasEmpleado = 0, opcionSeguro = 0, opcionEmpleado = 0, i = 0 , opcionMenu = 1;
//        double salarioEmpleado = 0;
//        char licenciaEmpleado;
//
//        do {
//            menuOpcion();
//            opcionMenu = scanner.nextInt();
//
//            switch (opcionMenu) {
//                case 1 -> {
//                    System.out.println("\nELIJA EL EMPLEADO QUE DESEA CREAR");
//                    opcionEmpleado();
//                    opcionEmpleado = scanner.nextInt();
//
//                    switch (opcionEmpleado) {
//                        case 1 -> {
//                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
//                            nombreEmpleado = scanner.next();
//                            System.out.print("ESPECIALIDAD MEDICO(A) : ");
//                            especialidadMedico = scanner.next();
//                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
//                            horasDiariasEmpleado = scanner.nextInt();
//                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
//                            salarioEmpleado = scanner.nextDouble();
//                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
//                            opcionSeguro = Integer.parseInt(scanner.next());
//
//                            if (opcionSeguro == 1) {
//                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
//                                tipoSeguroSocial = scanner.next();
//                                medico = new Medico(especialidadMedico, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
//                                listaEmpleados.add(medico);
//                            } else {
//                                medico = new Medico(especialidadMedico, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
//                                listaEmpleados.add(medico);
//                            }
//                        }
//
//                        case 2 -> {
//                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
//                            nombreEmpleado = scanner.next();
//                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
//                            horasDiariasEmpleado = scanner.nextInt();
//                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
//                            salarioEmpleado = scanner.nextDouble();
//                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
//                            opcionSeguro = Integer.parseInt(scanner.next());
//
//                            if (opcionSeguro == 1) {
//                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
//                                tipoSeguroSocial = scanner.next();
//                                enfermera = new Enfermera(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
//                                listaEmpleados.add(enfermera);
//                            } else {
//                                enfermera = new Enfermera(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
//                                listaEmpleados.add(enfermera);
//                            }
//                        }
//                        case 3 -> {
//                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
//                            nombreEmpleado = scanner.next();
//                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
//                            horasDiariasEmpleado = scanner.nextInt();
//                            System.out.println("TIPO DE LICENCIA : ");
//                            licenciaEmpleado = scanner.next().charAt(0);
//                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
//                            salarioEmpleado = scanner.nextDouble();
//                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
//                            opcionSeguro = Integer.parseInt(scanner.next());
//
//                            if (opcionSeguro == 1) {
//                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
//                                tipoSeguroSocial = scanner.next();
//                                conductor = new Conductor(licenciaEmpleado,nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
//                                listaEmpleados.add(conductor);
//                            } else {
//                                conductor = new Conductor(licenciaEmpleado, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
//                                listaEmpleados.add(conductor);
//                            }
//                        }
//                        case 4 -> {
//                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
//                            nombreEmpleado = scanner.next();
//                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
//                            horasDiariasEmpleado = scanner.nextInt();
//                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
//                            salarioEmpleado = scanner.nextDouble();
//                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
//                            opcionSeguro = Integer.parseInt(scanner.next());
//
//                            if (opcionSeguro == 1) {
//                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
//                                tipoSeguroSocial = scanner.next();
//                                secretaria = new Secretaria(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
//                                listaEmpleados.add(secretaria);
//                            } else {
//                                secretaria = new Secretaria(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
//                                listaEmpleados.add(secretaria);
//                            }
//                        }
//                    }
//                    verificarEntradaDatos = true;
//                }
//
//                case 2 -> {
//                    if(verificarEntradaDatos){
//                        i = 0;
//                        System.out.println("\nMOSTRAR EL LISTADO DE EMPLEADO");
//                        for (Empleado empleados : listaEmpleados) {
//                            System.out.println("");
//                            if (empleados.getTipoSeguroSocial() == null) {
//                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
//                                System.out.println(empleados.toString(empleados, i));
//                            } else {
//                                System.out.println("EMPLEADO CON SEGURO MEDICO");
//                                System.out.println(empleados.toString(i, empleados));
//                            }
//                            i++;
//                        }
//                    }else{
//                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
//                    }
//                }
//                case 3 -> {
//                    if(verificarEntradaDatos){
//                        System.out.println("\nELIMINAR EMPLEADO");
//                        i = 0;
//
//                        for (Empleado empleados : listaEmpleados) {
//                            System.out.println("");
//                            if (empleados.getTipoSeguroSocial() == null) {
//                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
//                                System.out.println(empleados.toString(empleados, i));
//                            } else {
//                                System.out.println("EMPLEADO CON SEGURO MEDICO");
//                                System.out.println(empleados.toString(i, empleados));
//                            }
//                            i++;
//                        }
//
//                        int eliminarEmpleado = 0, indiceEliminar = 0;
//                        boolean bandera = false;
//
//                        do {
//                            System.out.print("\nDIGITE EL INDICE DEL EMPLEADO A ELIMINAR : ");
//                            indiceEliminar = scanner.nextInt();
//                            listaEmpleados.remove(indiceEliminar);
//                            System.out.print("¿DESEA SEGUIR ELIMINANDO EMPLEADOS? 1(SI) O 2(NO) : ");
//                            eliminarEmpleado = Integer.parseInt(scanner.next());
//                            if (eliminarEmpleado == 1) {
//                                bandera = true;
//                            }
//                        } while (bandera);
//                        i = 0 ;
//                        System.out.println("NUEVA LISTA");
//                        for (Empleado empleados : listaEmpleados) {
//                            System.out.println("");
//                            if (empleados.getTipoSeguroSocial() == null) {
//                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
//                                System.out.println(empleados.toString(empleados, i));
//                            } else {
//                                System.out.println("EMPLEADO CON SEGURO MEDICO");
//                                System.out.println(empleados.toString(i, empleados));
//                            }
//                        }
//                    }else{
//                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
//                    }
//                }
//                case 4 -> {
//                    System.out.println("\nCREAR UNA FACTURA");
//                    secretaria.generarFactura();
//                }
//                case 5 ->{
//                    if(verificarEntradaDatos){
//                        System.out.println("\nINGRESAR SALARIO EXTRA");
//                        double horasExtra = 0;
//                        for (Empleado empleados : listaEmpleados) {
//                            System.out.print("HORAS EXTRA DEL EMPLEADO "+empleados.getNombre()+" : ");
//                            horasExtra = scanner.nextDouble();
//                            empleados.setHorasExtra(horasExtra);
//                        }  
//                        System.out.println("\nSUELDOS EXTRA");
//                        for (Empleado empleados : listaEmpleados) {
//                            System.out.println("");
//                            empleados.sueldoExtraEmpleado(empleados);
//                        }         
//                    }else{
//                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
//                    }
//                }
//                case 6->{
//                    if(verificarEntradaDatos){
//                        double sumaSueldosEmpleados = 0;
//                        System.out.println("\nSUMATORIA EMPLEADOS SUELDOS");
//                        for (Empleado empleados : listaEmpleados) {
//                            sumaSueldosEmpleados = sumaSueldosEmpleados +empleados.getSalario();
//                        }
//                        System.out.println("LA SUMATORIA DE LOS SUELDOS DE LOS EMPLEADOS ES IGUAL A : "+sumaSueldosEmpleados);
//                                      
//                    }else{
//                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
//                    }
//                }
//            }
//
//        } while (opcionMenu <= 6);
//        //Fin deber
    }
    
    public static void iniciarSistemaMedico(){
        //Deber
        System.out.println("\n\nSISTEMA MEDICO UNIVERSITARIO DE LA UNIVERSIDAD NACIONAL DE LOJA");

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        Scanner scanner = new Scanner(System.in);

        //BEGGIN CREATIONS OBJECTS
        Empleado empleado = new Empleado();
        Medico medico = new Medico();
        Enfermera enfermera = new Enfermera();
        Secretaria secretaria = new Secretaria();
        Conductor conductor = new Conductor();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        //END CREATIONS OBJECT

        boolean verificarEntradaDatos = false;

        String nombreEmpleado, tipoSeguroSocial, especialidadMedico;
        int horasDiariasEmpleado = 0, opcionSeguro = 0, opcionEmpleado = 0, i = 0 , opcionMenu = 1;
        double salarioEmpleado = 0;
        char licenciaEmpleado;

        do {
            menuOpcion();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1 -> {
                    System.out.println("\nELIJA EL EMPLEADO QUE DESEA CREAR");
                    opcionEmpleado();
                    opcionEmpleado = scanner.nextInt();

                    switch (opcionEmpleado) {
                        case 1 -> {
                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
                            nombreEmpleado = scanner.next();
                            System.out.print("ESPECIALIDAD MEDICO(A) : ");
                            especialidadMedico = scanner.next();
                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
                            horasDiariasEmpleado = scanner.nextInt();
                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
                            salarioEmpleado = scanner.nextDouble();
                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
                            opcionSeguro = Integer.parseInt(scanner.next());

                            if (opcionSeguro == 1) {
                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
                                tipoSeguroSocial = scanner.next();
                                medico = new Medico(especialidadMedico, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
                                listaEmpleados.add(medico);
                            } else {
                                medico = new Medico(especialidadMedico, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
                                listaEmpleados.add(medico);
                            }
                        }

                        case 2 -> {
                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
                            nombreEmpleado = scanner.next();
                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
                            horasDiariasEmpleado = scanner.nextInt();
                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
                            salarioEmpleado = scanner.nextDouble();
                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
                            opcionSeguro = Integer.parseInt(scanner.next());

                            if (opcionSeguro == 1) {
                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
                                tipoSeguroSocial = scanner.next();
                                enfermera = new Enfermera(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
                                listaEmpleados.add(enfermera);
                            } else {
                                enfermera = new Enfermera(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
                                listaEmpleados.add(enfermera);
                            }
                        }
                        case 3 -> {
                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
                            nombreEmpleado = scanner.next();
                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
                            horasDiariasEmpleado = scanner.nextInt();
                            System.out.print("TIPO DE LICENCIA : ");
                            licenciaEmpleado = scanner.next().charAt(0);
                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
                            salarioEmpleado = scanner.nextDouble();
                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
                            opcionSeguro = Integer.parseInt(scanner.next());

                            if (opcionSeguro == 1) {
                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
                                tipoSeguroSocial = scanner.next();
                                conductor = new Conductor(licenciaEmpleado,nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
                                listaEmpleados.add(conductor);
                            } else {
                                conductor = new Conductor(licenciaEmpleado, nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
                                listaEmpleados.add(conductor);
                            }
                        }
                        case 4 -> {
                            System.out.print("\nNOMBRE EMPLEADO(A) : ");
                            nombreEmpleado = scanner.next();
                            System.out.print("HORAS DIARIAS DE TRABAJO : ");
                            horasDiariasEmpleado = scanner.nextInt();
                            System.out.print("SALARIO EMPLEADO(A) TOTAL : ");
                            salarioEmpleado = scanner.nextDouble();
                            System.out.print("EL EMPLEADO DISPONE DE SEGURO MEDICO 1(SI) O 2(NO) : ");
                            opcionSeguro = Integer.parseInt(scanner.next());

                            if (opcionSeguro == 1) {
                                System.out.print("INGRESE EL TIPO DE SEGURO : ");
                                tipoSeguroSocial = scanner.next();
                                secretaria = new Secretaria(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado, tipoSeguroSocial);
                                listaEmpleados.add(secretaria);
                            } else {
                                secretaria = new Secretaria(nombreEmpleado, horasDiariasEmpleado, gregorianCalendar, salarioEmpleado);
                                listaEmpleados.add(secretaria);
                            }
                        }
                    }
                    verificarEntradaDatos = true;
                }

                case 2 -> {
                    if(verificarEntradaDatos){
                        i = 0;
                        System.out.println("\nMOSTRAR EL LISTADO DE EMPLEADO");
                        for (Empleado empleados : listaEmpleados) {
                            System.out.println("");
                            if (empleados.getTipoSeguroSocial() == null) {
                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
                                System.out.println(empleados.toString(empleados, i));
                            } else {
                                System.out.println("EMPLEADO CON SEGURO MEDICO");
                                System.out.println(empleados.toString(i, empleados));
                            }
                            i++;
                        }
                    }else{
                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
                    }
                }
                case 3 -> {
                    if(verificarEntradaDatos){
                        System.out.println("\nELIMINAR EMPLEADO");
                        i = 0;

                        for (Empleado empleados : listaEmpleados) {
                            System.out.println("");
                            if (empleados.getTipoSeguroSocial() == null) {
                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
                                System.out.println(empleados.toString(empleados, i));
                            } else {
                                System.out.println("EMPLEADO CON SEGURO MEDICO");
                                System.out.println(empleados.toString(i, empleados));
                            }
                            i++;
                        }

                        int eliminarEmpleado = 0, indiceEliminar = 0;
                        boolean bandera = false;

                        do {
                            bandera = false;
                            System.out.print("\nDIGITE EL INDICE DEL EMPLEADO A ELIMINAR : ");
                            indiceEliminar = scanner.nextInt();
                            listaEmpleados.remove(indiceEliminar);
                            System.out.print("¿DESEA SEGUIR ELIMINANDO EMPLEADOS? 1(SI) O 2(NO) : ");
                            eliminarEmpleado = Integer.parseInt(scanner.next());
                            if (eliminarEmpleado == 1) {
                                bandera = true;
                            }
                        } while (bandera);
                        i = 0 ;
                        System.out.println("NUEVA LISTA");
                        for (Empleado empleados : listaEmpleados) {
                            System.out.println("");
                            if (empleados.getTipoSeguroSocial() == null) {
                                System.out.println("EMPLEADO SIN SEGURO MEDICO");
                                System.out.println(empleados.toString(empleados, i));
                            } else {
                                System.out.println("EMPLEADO CON SEGURO MEDICO");
                                System.out.println(empleados.toString(i, empleados));
                            }
                            i++;
                        }
                    }else{
                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
                    }
                }
                case 4 -> {
                    System.out.println("\nCREAR UNA FACTURA");
                    secretaria.generarFactura();
                }
                case 5 ->{
                    if(verificarEntradaDatos){
                        System.out.println("\nINGRESAR SALARIO EXTRA");
                        double horasExtra = 0;
                        for (Empleado empleados : listaEmpleados) {
                            System.out.print("HORAS EXTRA DEL EMPLEADO "+empleados.getNombre()+" : ");
                            horasExtra = scanner.nextDouble();
                            empleados.setHorasExtra(horasExtra);
                        }  
                        System.out.println("\nSUELDOS EXTRA");
                        for (Empleado empleados : listaEmpleados) {
                            System.out.println("");
                            empleados.sueldoExtraEmpleado(empleados);
                        }         
                    }else{
                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
                    }
                }
                case 6->{
                    if(verificarEntradaDatos){
                        double sumaSueldosEmpleados = 0;
                        System.out.println("\nSUMATORIA EMPLEADOS SUELDOS");
                        for (Empleado empleados : listaEmpleados) {
                            sumaSueldosEmpleados = sumaSueldosEmpleados +empleados.getSalario();
                        }
                        System.out.println("\nLA SUMATORIA DE LOS SUELDOS DE LOS EMPLEADOS ES IGUAL A : "+sumaSueldosEmpleados);
                                      
                    }else{
                        System.out.println("\n\nAUN NO HA CREADO NINGUN EMPLEADO!!!!");
                    }
                }
            }

        } while (opcionMenu <= 6);
        //Fin deber
    }

    public static void menuOpcion() {
        System.out.println("\n\n1. CREAR UN NUEVO EMPLEADO");
        System.out.println("2. MOSTRAR EL LISTADO DE EMPLEADOS CREADOS");
        System.out.println("3. ELIMINAR EMPLEADO");
        System.out.println("4. CREAR UNA FACTURA");
        System.out.println("5. CONSULTAR SALARIO EXTRA");
        System.out.println("6. SUMATORIA SUELDOS EMPLEADOS");
        System.out.println("7. SALIR");
        System.out.print("OPCION : ");
    }

    public static void opcionEmpleado() {
        System.out.println("\n1. MEDICO(A)");
        System.out.println("2. ENFERMERO(A)");
        System.out.println("3. CONDUCTOR(A)");
        System.out.println("4. SECRETARIO(A)");
        System.out.print("OPCION : ");
    }

}

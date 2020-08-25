//ALGORITMO REALIZADO POR : JOSUE SAUCA 
//PARALELO "B"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

FILE *presentarFactura;

struct Cliente{

    int id;
    char nombres[50];
    char apellidos[50];
    char dni[50];
    char correo[50];
    char direccion[50];
    
};

struct Item{
    char codigo[50];
    char descripcion[50];
    float cantidad;
    float precioUnitario;
    float totalProducto;
};

struct Factura {
    char numero[50];
    float tasaIva;
    float totalIva;
    float subtotal;
    float total;
    struct tm date;
    struct Cliente cliente;
    struct Item *item;
};

struct Factura datosFactura;

void datosCliente();
float ingresoProductoIva(char *etiqueta);
void limiteProduc(int limiteProdu);
void impresionInicial(int numeroFactura);
void calculoTotal(int limite,float iva);
void impresionProductosIngresados(int limite);
void impresionDatosCliente();
void impresionCalculoTotal(struct Factura datosFactura,float iva);
void mensajeSalida();
void facturaTxt(FILE *presentarFactura,int numeroFactura,int limite,float iva);


int main(int argc, char const *argv[]){

    srand(time(NULL));
    int numeroFactura = rand() %450+1;
    char imprimirFactura;
       
    system("@cls||clear");
    datosCliente();
    int limiteProdu = ingresoProductoIva("\nPor Favor Ingrese la Cantidad de Productos a Llevar : ");
    float iva = ingresoProductoIva("Por Favor Ingrese la Tasa del Iva  : ");
    limiteProduc(limiteProdu);

    system("@cls||clear");
    
    impresionInicial(numeroFactura);
    impresionDatosCliente();
    calculoTotal(limiteProdu,iva);
    impresionProductosIngresados(limiteProdu);
    impresionCalculoTotal(datosFactura,iva);
    mensajeSalida(); 

    
    printf("\nDesea Imprimir la Factura (1)Si o (2)No : ");
    scanf(" %c",&imprimirFactura);

    if (imprimirFactura == '1' ){

        char *direccion = {"C:\\Users\\DELL\\Desktop\\ALGORITMOS\\Factura Programacion\\Factura.txt"};
        presentarFactura = fopen(direccion,"w+"); 
        facturaTxt(presentarFactura,numeroFactura,limiteProdu,iva); 
        fclose(presentarFactura);
        
    }
       
    return 0;
}

float ingresoProductoIva(char *etiqueta){
    float cantidadProductos;
    printf("%s ",etiqueta);
    scanf("%f",&cantidadProductos);
    return cantidadProductos;
}

void impresionInicial(int numeroFactura){
   
    time_t fecha = time(NULL);
    datosFactura.date = *localtime(&fecha);

    printf("----------------------------------------------------------------\n");
    printf("\t\t\tFACTURA DE VENTA\n");
    printf("\t\t\tEMPRESA TELCEL\n");
    printf("-----------------------------------------------------------------");
    printf("\nFecha de emision : %d-%d-%d",datosFactura.date.tm_year+1900,datosFactura.date.tm_mon+1,datosFactura.date.tm_mday);
    printf("\nNro. factura : 000%i ",numeroFactura);

}

void datosCliente() {
    
    fflush(stdin);
    puts("\nIngrese los Datos del Cliente");
    printf("\n---------------------------------------------------------------\n");
    printf("Nombres : ");
    gets(datosFactura.cliente.nombres);
    printf("Apellidos : ");
    gets(datosFactura.cliente.apellidos);
    printf("Cedula : ");
    fgets(datosFactura.cliente.dni,sizeof(datosFactura.cliente.dni),stdin);
    printf("Correo : ");
    fgets(datosFactura.cliente.correo,sizeof(datosFactura.cliente.correo),stdin);
    printf("Direccion : ");
    fgets(datosFactura.cliente.direccion,sizeof(datosFactura.cliente.direccion),stdin);
    printf("Id : ");
    scanf("%i",&datosFactura.cliente.id);

}

void impresionDatosCliente(){

    printf("\n\nCliente");
    printf("\n---------------------------------------------------------------");
    printf("\nNombres : ");
    printf("%s %s",(datosFactura.cliente.nombres),(datosFactura.cliente.apellidos));
    printf("\nCedula : %s",datosFactura.cliente.dni);
    printf("Correo : %s",datosFactura.cliente.correo);
    printf("Direccion : %s",datosFactura.cliente.direccion);
    printf("Id : %i",datosFactura.cliente.id);

}

void limiteProduc(int limiteProdu){

    int i;
    datosFactura.item = (struct Item*)malloc(limiteProdu *sizeof(struct Item));
    fflush(stdin);
    for (i = 0; i <limiteProdu;i++){

        printf("\n");
        printf("%i) Codigo del Producto : ",i+1);
        scanf("%s",&datosFactura.item[i].codigo);
        printf("%i) Cantidad : ",i+1);
        scanf("%f",&datosFactura.item[i].cantidad);
        printf("%i) Descripcion : ",i+1);
        scanf("%s",&datosFactura.item[i].descripcion);
        printf("%i) Precio : ",i+1);
        scanf("%f",&datosFactura.item[i].precioUnitario);

    }

}

void impresionProductosIngresados(int limite){
    int j;
    printf("\n---------------------------------------------------------------");
    printf("\nLISTADO DE PRODUCTOS");
    printf("\n---------------------------------------------------------------");
    printf("\nCodigo\tCantidad\tDescripcion\tPrecio U.\tTotal");
    printf("\n---------------------------------------------------------------");
    for (j = 0; j<limite;++j){
        printf("\n%s  \t%.2f       \t%s       \t%.2f    \t%.2f",datosFactura.item[j].codigo,datosFactura.item[j].cantidad,datosFactura.item[j].descripcion,datosFactura.item[j].precioUnitario,datosFactura.item[j].totalProducto); 
    }

}

void calculoTotal(int limite,float iva){
    int j;

    for (j = 0; j<limite;++j){       
        datosFactura.item[j].totalProducto = datosFactura.item[j].cantidad * datosFactura.item[j].precioUnitario;          
        datosFactura.total = datosFactura.total + datosFactura.item[j].totalProducto;
    }

    datosFactura.tasaIva = datosFactura.total*(iva/100);
    datosFactura.totalIva = datosFactura.tasaIva + datosFactura.total;

}

void impresionCalculoTotal(struct Factura datosFactura,float iva){

    printf("\n---------------------------------------------------------------");
    printf("\nSubtotal Neto : %.2f USD",datosFactura.total);
    printf("\n---------------------------------------------------------------");
    printf("\nIVA(%.2f%%) : %.2f",iva,datosFactura.tasaIva);
    printf("\n---------------------------------------------------------------");
    printf("\nTotal a Pagar : %.2f USD", datosFactura.totalIva);
    printf("\n---------------------------------------------------------------");

}

void mensajeSalida(){

   printf("\t\t\n!!!!!!!!GRACIAS POR TU COMPRA!!!!!!!");
   printf("\n---------------------------------------------------------------");
   printf("\n===============================================================");
   printf("\n\tProgramado por JOSUE SAUCA");
   printf("\n===============================================================");
    
}

void facturaTxt(FILE *presentarFactura,int numeroFactura,int limite,float iva){
    int j;
    time_t fecha = time(NULL);
    datosFactura.date = *localtime(&fecha);
    fprintf(presentarFactura,"---------------------------------------------------------------\n");
    fprintf(presentarFactura,"\t\t\tFACTURA DE VENTA\n");
    fprintf(presentarFactura,"\t\t\tEMPRESA TELCEL\n");
    fprintf(presentarFactura,"---------------------------------------------------------------");
    fprintf(presentarFactura,"\nFecha de emision : %d-%d-%d",datosFactura.date.tm_year+1900,datosFactura.date.tm_mon+1,datosFactura.date.tm_mday);
    fprintf(presentarFactura,"\nNro. factura : 000%i",numeroFactura);
    fprintf(presentarFactura,"\n\nCliente");
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nNombres : ");
    fprintf(presentarFactura,"%s %s",(datosFactura.cliente.nombres),(datosFactura.cliente.apellidos));
    fprintf(presentarFactura,"\nCedula : %s",datosFactura.cliente.dni);
    fprintf(presentarFactura,"Correo : %s",datosFactura.cliente.correo);
    fprintf(presentarFactura,"Direccion : %s",datosFactura.cliente.direccion);
    fprintf(presentarFactura,"Id : %i",datosFactura.cliente.id);
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nLISTADO DE PRODUCTOS");
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nCodigo\tCantidad\tDescripcion\tPrecio U.\tTotal");
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    for (j = 0; j<limite;++j){
        fprintf(presentarFactura,"\n%s  \t%.2f       \t%s       \t%.2f    \t%.2f",datosFactura.item[j].codigo,datosFactura.item[j].cantidad,datosFactura.item[j].descripcion,datosFactura.item[j].precioUnitario,datosFactura.item[j].totalProducto); 
    }
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nSubtotal Neto : %.2f USD", datosFactura.total);
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nIVA(%.2f%%) : %.2f",iva,datosFactura.tasaIva);
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\nTotal a Pagar : %.2f USD",datosFactura.totalIva);
    fprintf(presentarFactura,"\n---------------------------------------------------------------");    
    fprintf(presentarFactura,"\n\t\t!!!!!!!!GRACIAS POR TU COMPRA!!!!!!!");
    fprintf(presentarFactura,"\n---------------------------------------------------------------");
    fprintf(presentarFactura,"\n===============================================================");
    fprintf(presentarFactura,"\n\t\tProgramado por JOSUE SAUCA");
    fprintf(presentarFactura,"\n==============================================================="); 
}
  
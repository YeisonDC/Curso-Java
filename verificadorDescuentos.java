
import java.util.Scanner;


public class verificadorDescuentos {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        //Titulo
        System.out.println("***Programa Verificador de descuentos***");
        //Definición de constantes
        final double montoMinimo= 1000;
        //Solicitud de datos
        System.out.print("Cuanto ha sido el monto de la compra?: ");
        var monto = Double.parseDouble(consola.nextLine());
        System.out.print("Es Miembro de la tienda?: ");
        var miembro = Boolean.parseBoolean(consola.nextLine());
        //Calculo compra mas 1000 y es miembro
        double calculo1Sub = monto * 0.1;
        double calculo1Total = monto + calculo1Sub;
        //Calculo si solo es miembro
        double calculo2Sub = monto * 0.05;
        double calculo2Total = monto + calculo2Sub;
        //Imprimir informacion
        if (monto > montoMinimo && miembro){
            System.out.printf("""
                              Felicidades ha recibido un descuento de 10%%
                              Monto de descuento: %.2f
                              Monto total: %.
                              
                              """, calculo1Sub, calculo1Total);}
       else if (monto <= montoMinimo && miembro){
            System.out.printf(""" 
                              Felicidades ha recibido un descuento de 5%%
                              Monto de descuento: %.2f
                              Monto total: %.2f
                              """,calculo2Sub,calculo2Total);
        }
        else System.out.println("No ha recibido usted un descuento");
    }
}

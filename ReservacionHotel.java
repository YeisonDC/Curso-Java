
import java.util.Scanner;
public class ReservacionHotel {

    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    //Designacion de constantes
    final double conMar = 190.50;
    final double sinMar = 150.50;
    //Solicitud de informacion
        //Programa
        System.out.println(" ***Sistema de reservacion*** ");
        //Nombre
        System.out.print("Indique su nombre: ");
        var nombre = consola.nextLine();
        //Dias de estancias
        System.out.print("Dias de estancia: ");
        var diasEstancia = Integer.parseInt(consola.nextLine());
        //Cuarto con vista al mar
        System.out.print("Quiere el cuarto con vista al mar?(true/false): ");
        boolean vistaAlMar = Boolean.parseBoolean(consola.nextLine());
    //Calculo vista con mar
    double calculoVistaMar = diasEstancia * conMar;
    //Calculo vista sin mar
    double calculoVistaSinMar = diasEstancia * sinMar;
    //Verificación
    var vista_Mar = (vistaAlMar) ? "Si" :"No";
    if (vistaAlMar){System.out.printf("""
                                      \n--------- Detalle de la Reservacion ---------
                                      \tCliente: %s
                                      \tDias de estancia: %d
                                      \tCosto total: $%.2f
                                      \tHabitacion con vista al mar: %s
                                       """, nombre,diasEstancia ,calculoVistaMar,vista_Mar);
         }
     else {System.out.printf("""
                             \n--------- Detalle de la Reservacion ---------
                             \tCliente: %s
                             \tDias de estancia: %d
                             \tCosto total: $%.2f
                             \tHabitacion con vista al mar: %s                             
                             """, nombre,diasEstancia, calculoVistaSinMar,vista_Mar);
         }
    } 
}

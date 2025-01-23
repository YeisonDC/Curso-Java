
import java.util.Scanner;


public class AplicacionSaludFitness {

    public static void main(String[] args) {
        System.out.println("*** Bienvenido a su medidor de calorias y pasos diarios ***");
        var consola = new Scanner(System.in);
        //Constantes definidas
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;
        //Solicitud de informacion
        System.out.print("Cual es su nombre?: ");
        var nombre = consola.nextLine();
        System.out.print("Pasos Caminados el dia de hoy: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());
        //Calculo de calorias quemadas por pasos caminados
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        //Verificamos si cumplimos la meta
        if (pasosDiarios >= META_PASOS_DIARIOS){
            System.out.printf("""
                             \nFELICIDADES SUPERASTE TU META PERSONAL
                             DIARIOA %s AQUI ESTÁ TU RECUENTO:
                             
                             \tCALORIAS QUE QUEMASTE: %.2f
                             \tPASOS DADOS EL DIA DE HOY %d
                             
                             SIGUE ASI Y CUMPLIRAS TODO!!
                             """, nombre.toUpperCase(),caloriasQuemadas,pasosDiarios);
            }
        else {System.out.printf("""
                                \nNO LOGRASTE TU OBJETIVO EL DIA DE HOY...
                                PERO NO TE DESANIMES %s !!! MAÑANA LO
                                CONSEGUIRAS
                                \tCALORIAS QUE QUEMASTE: %.2f
                                \tPASOS DADOS EL DIA DE HOY %d
                                
                                 """, nombre.toUpperCase(), caloriasQuemadas, pasosDiarios);
                }
    }  
}

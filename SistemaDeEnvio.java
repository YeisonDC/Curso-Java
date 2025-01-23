
import java.util.Scanner;
public class SistemaDeEnvio {

    public static void main(String[] args) {
    //Costantes definidas
    final double nacional = 10.00;
    final double internacional = 20.00;
        
    //Definir el input
    var consola = new Scanner(System.in);
    
    //Nombre del sistema/Programa
    System.out.println(" ***Sistema calculo de envios*** ");
    
    //Solicitud de la información
    System.out.print("Indique el articulo que sera enviado: ");
    var articulo = consola.nextLine().toUpperCase().trim();
    System.out.print("Indique el tipo de envio del producto(nacional/internacional): ");
    var tipoEnvio = consola.nextLine().toUpperCase().trim(); 
    System.out.print("Indique el peso del producto (Kilogramos): ");
    var pesoEnvio = consola.nextDouble();
    
    //Calculo del envio
    double costoEnvio = switch (tipoEnvio){
        case "NACIONAL" -> pesoEnvio * nacional;
        case "INTERNACIONAL" -> pesoEnvio * internacional;
        default -> { 
            System.out.print("Ingrese un valor valido nacional o internacional");
            yield 0.0;
        }
     };
 
    //Impresion del sistema
    System.out.printf("""
                      \n------------- ENVIO %s -------------
                      SU ORDEN DE ENVIO FUE CREADA CON EXITO
                      \tARTICULO: %s
                      \tTIPO DE ENVIO: %s
                      \tPESO DEL ARTICULO: %.2f
                      ------------- ENVIO %s -------------
                      \tTOTAL DEL COSTO: %.2f
                      """, tipoEnvio, articulo ,tipoEnvio, pesoEnvio,tipoEnvio ,costoEnvio);
    }
    
}

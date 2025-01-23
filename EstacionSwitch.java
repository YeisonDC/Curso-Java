
import java.util.Scanner;


public class EstacionSwitch {

    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    //Nombre del programa
    System.out.println(" ***Sistema identificador de estaciones*** ");
    
    //Solicitud de informacion
    System.out.print("Proporcione el valor numero de un mes: ");
    var numero = consola.nextInt();
    
    //calculo
    var resultado = "resultado";
    resultado = switch(numero){
        case 1,2,12 -> "Invierno";
        case 3,4,5 -> "Primavera";
        case 6,7,8 -> "Verano";
        case 9,10,11 -> "Otonio";
        default -> "Estacion Desconocida";        
    };
        System.out.printf("""
                          La estacion correspondiente al mes es: %s
                          """, resultado);    
    consola.close();
    }
 }


    
